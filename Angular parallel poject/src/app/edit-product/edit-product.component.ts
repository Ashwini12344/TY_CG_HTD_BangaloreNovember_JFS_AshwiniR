import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { ProductService } from '../product.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-edit-product',
  templateUrl: './edit-product.component.html',
  styleUrls: ['./edit-product.component.css']
})
export class EditProductComponent implements OnInit {
prodId1;
prodName1;
prodDescription1;
cost1;

constructor(private productService: ProductService, private router: Router, private activatedRoute: ActivatedRoute) {
  activatedRoute.params.subscribe(data => {
    console.log(data.prodId);
    this.prodId1 = data.prodId;
  });
  activatedRoute.queryParams.subscribe(data => {
    console.log(data);
    this.prodDescription1 = data.prodDescription;
    this.prodName1 = data.prodName;
    this.cost1 = data.cost;
  });
}
updateProduct(form: NgForm) {
  this.productService.updateData(form.value).subscribe(res => {
    console.log(res);
    if (res.statusCode === 201) {
      form.reset();
      this.router.navigateByUrl('/products');
    }
  }, error => {
    console.log(error);
});
}


  ngOnInit() {
  }


}
