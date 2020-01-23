import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit {

  description: string;
  customers: Customer[];

  constructor(private customerService: CustomerService, private router: Router) {
    this.getCustomers();

   }

   getCustomers() {
     this.customerService.getData().subscribe(response => {
       console.log(response);
       this.customers = response.bean;
     }, err => {
       console.log(err);
     });
   }
deleteCustomer(customer: Customer) {
    this.customerService.deleteData(customer).subscribe(response => {
      console.log(response);
      if (response.statusCode === 201) {
        this.customers.splice(this.customers.indexOf(customer), 1);
        this.description = response.description;
      }
    });
  }
  deleteMessage() {
    this.description = null;
  }
  selectCustomer(customer) {
    console.log(customer);
    // this.customerService.selectedCustomerToUpdate = customer;
    this.router.navigate([`update-customer/${customer.customerid}`],
      {
        queryParams: {
          customerName: customer.customerName,
          email: customer.email,
          postalcode: customer.postalcode,
          streetAddress1: customer.streetAddress1,
          streetAddress2: customer.streetAddress2,
          telephone: customer.telephone,
          town: customer.town
          }
      }
    );
  }


  ngOnInit() {
  }

}
