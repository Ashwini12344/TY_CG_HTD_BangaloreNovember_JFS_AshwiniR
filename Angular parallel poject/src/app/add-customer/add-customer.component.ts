import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {

  message: string;

  constructor(private customerService: CustomerService) {}

  ngOnInit() {
  }
addCustomer(form: NgForm) {
  this.customerService.postData(form.value).subscribe(data => {
    console.log(data);
    this.message = data.message;
    setTimeout( () => {
      this.message = null;
    }, 2000);
    form.reset();
  }, err => {
    console.log(err);
 });
  }

}
