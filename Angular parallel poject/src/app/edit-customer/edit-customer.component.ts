import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Router, ActivatedRoute } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit {

  customerId1;
  customerName1;
  email1;
  postalcode1;
  streetAddress11;
  streetAddress21;
  telephone1;
  town1;
 constructor(private customerService: CustomerService, private router: Router, private activatedRoute: ActivatedRoute) {
    activatedRoute.params.subscribe(data => {
      console.log(data.customerid);
      this.customerId1 = data.customerid;
    });
    activatedRoute.queryParams.subscribe(data => {
      console.log(data);
      this.customerName1 = data.customerName;
      this.email1 = data.email;
      this.postalcode1 = data.postalcode;
      this.streetAddress11 = data.streetAddress1;
      this.streetAddress21 = data.streetAddress2;
      this.telephone1 = data.telephone;
      this.town1 = data.town;
    });
  }
  updateCustomer(form: NgForm) {
    this.customerService.updateData(form.value).subscribe(res => {
      console.log(res);
      if (res.statusCode === 201) {
        form.reset();
        this.router.navigateByUrl('/customers');
      }
    }, error => {
      console.log(error);
 });
  }


  // constructor(public customerService: CustomerService, private router: Router) { }

  ngOnInit() {
  }
}
