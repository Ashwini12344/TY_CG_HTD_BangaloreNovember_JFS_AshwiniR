import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  message;
  products: Product[];

  constructor(private productService: ProductService, private router: Router) {
    this.getProducts();

   }

   getProducts() {
     this.productService.getData().subscribe(response => {
       console.log(response);
       this.products = response.bean;
     }, err => {
       console.log(err);
     });
   }
deleteProduct(product: Product) {
    this.productService.deleteData(product).subscribe(response => {
      console.log(response);
      if (response.statuscode === 201) {
        this.products.splice(this.products.indexOf(product), 1);
        this.message = response.message;
      } else {
        this.message = response.message;
      }
    });
  }
  deleteMessage() {
    this.message = null;
  }

  selectProduct(product) {
    console.log(product);
    // this.customerService.selectedCustomerToUpdate = customer;
    this.router.navigate([`update-product/${product.prodId}`],
      {
        queryParams: {
          prodName: product.prodName,
          prodDescription: product.prodDescription,
          cost: product.cost
          }
      }
    );
  }
  ngOnInit() {
  }

}
