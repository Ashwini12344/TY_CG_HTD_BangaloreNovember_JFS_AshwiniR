import { Component, OnInit } from '@angular/core';
import { ContractService } from '../contract.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-contracts',
  templateUrl: './contracts.component.html',
  styleUrls: ['./contracts.component.css']
})
export class ContractsComponent implements OnInit {

  description: string;
  contracts: Contract[];

  constructor(private contractService: ContractService, private router: Router) {
    this.getContracts();

   }

   getContracts() {
     this.contractService.getData().subscribe(response => {
       console.log(response);
       this.contracts = response.bean;
     }, err => {
       console.log(err);
     });
   }
deleteContractor(contract: Contract) {
    this.contractService.deleteData(contract).subscribe(response => {
      console.log(response);
      if (response.statusCode === 201) {
        this.contracts.splice(this.contracts.indexOf(contract), 1);
        this.description = response.description;
      }
    });
  }
  deleteMessage() {
    this.description = null;
  }

  // selectProduct(contract) {
  // this.contractService.selectedContractToUpdate = contract;
  // this.router.navigateByUrl('/edit-product');
  // }
  ngOnInit() {
  }


}
