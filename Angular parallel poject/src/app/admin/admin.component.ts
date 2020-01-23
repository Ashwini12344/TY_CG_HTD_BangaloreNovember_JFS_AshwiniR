import { Component, OnInit } from '@angular/core';
import { NgForm, FormGroup } from '@angular/forms';
import { AdminService } from '../admin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  description: string;
  error: string;
  constructor(private auth: AdminService, private router: Router) { }

  submitForm(form: NgForm) {
    this.auth.login(form.value).subscribe(response => {
      console.log(response);
      if (response.statusCode === 201) {
        localStorage.setItem('userDetails', JSON.stringify(response));
        this.description = response.description;
        if (response.user['0'].userType === 'admin') {
          this.router.navigateByUrl('/admin-page');
          } else if (response.user['0'].userType === 'client') {
           this.router.navigateByUrl('/client');
          } else  {
            this.router.navigateByUrl('/scheduler');
          }
        console.log('user Details Inserted in local Storage');
        form.reset();
      }
    }, err => {
      console.log(err);
      this.error = err.error.message;
      setTimeout(() => {
        this.error = null;
      }, 5000);
    });
  }

  ngOnInit() {
  }

}
