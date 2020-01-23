import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AddContractComponent } from './add-contract/add-contract.component';
import { AddProductComponent } from './add-product/add-product.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { DeleteContractComponent } from './delete-contract/delete-contract.component';
import { ProductsComponent } from './products/products.component';
import { EditProductComponent } from './edit-product/edit-product.component';
import { ContractsComponent } from './contracts/contracts.component';
import { CustomersComponent } from './customers/customers.component';
import { LandComponent } from './land/land.component';
import { SchedulerComponent } from './scheduler/scheduler.component';
import { EditCustomerComponent } from './edit-customer/edit-customer.component';
import { AddScheduleComponent } from './add-schedule/add-schedule.component';
import { SchedulesComponent } from './schedules/schedules.component';
import { AdminPageComponent } from './admin-page/admin-page.component';
import { ClientComponent } from './client/client.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AddContractComponent,
    AddCustomerComponent,
    DeleteContractComponent,
    AddProductComponent,
    HomeComponent,
    AdminComponent,
    ProductsComponent,
    EditProductComponent,
    ContractsComponent,
    CustomersComponent,
    LandComponent,
    SchedulerComponent,
    EditCustomerComponent,
    AddScheduleComponent,
    SchedulesComponent,
    AdminPageComponent,
    ClientComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
     { path: 'header', component: HeaderComponent},
     { path: 'add-contract', component: AddContractComponent},
     { path: 'delete-contractor/{contractNo}', component: ContractsComponent},
     { path: 'add-customer', component: AddCustomerComponent},
     { path: '', redirectTo: 'user-login', pathMatch: 'full'},
     { path: 'user-login', component: AdminComponent},
     { path : 'add-product', component: AddProductComponent},
     { path : 'products', component: ProductsComponent},
     { path: 'edit-product', component: EditProductComponent},
     { path : 'contracts', component: ContractsComponent},
     { path : 'customers', component: CustomersComponent},
     { path: 'update-customer/:customerid', component: EditCustomerComponent},
     { path: 'update-product/:prodId', component: EditProductComponent },
     { path: 'admin-page', component: AdminPageComponent},
     { path: 'home', component: HomeComponent},
     { path: 'client', component: ClientComponent},
     { path: 'add-schedule', component: AddScheduleComponent},
     { path: 'scheduler', component: SchedulerComponent},
     { path : 'schedules', component: SchedulesComponent}


    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
