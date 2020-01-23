import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ContractService } from '../contract.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-delete-contract',
  templateUrl: './delete-contract.component.html',
  styleUrls: ['./delete-contract.component.css']
})
export class DeleteContractComponent implements OnInit {
    message;
    contracts: Contract[];

  constructor(private contractService: ContractService, private router: Router) { }
  getContract() {
    this.contractService.getData().subscribe(response => {
      console.log(response);
      this.contracts = response.product;
    }, err => {
      console.log(err);
    });
  }
deleteContract(contract: Contract) {
   this.contractService.deleteData(contract).subscribe(response => {
     console.log(response);
     if (response.message === 'deleted successfully') {
       this.contracts.splice(this.contracts.indexOf(contract), 1);
       this.message = response.message;
     }
   });
 }
 deleteMessage() {
   this.message = null;
 }

//  selectContract(contract) {
//    this.contractService.selectedContractToUpdate = contract;
//    this.router.navigateByUrl('/edit-product');
//  }

  ngOnInit() {
  }

}
