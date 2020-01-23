import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ContractService } from '../contract.service';

@Component({
  selector: 'app-add-contract',
  templateUrl: './add-contract.component.html',
  styleUrls: ['./add-contract.component.css']
})
export class AddContractComponent implements OnInit {

  message: string;


  constructor(private contractService: ContractService) {}

  ngOnInit() {
  }
addContract(form: NgForm) {
  this.contractService.postData(form.value).subscribe(data => {
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
