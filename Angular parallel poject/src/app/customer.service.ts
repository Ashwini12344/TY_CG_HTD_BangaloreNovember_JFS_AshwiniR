import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  api = 'http://localhost:8087';

  constructor(private http: HttpClient) { }

  postData(customer): Observable<any> {
    return this.http.post<any>(
      `${this.api}/add-customer`,
      customer);
   }
   getData(): Observable<any> {
    return this.http.get<any>(`http://localhost:8087/get-allcustomer`);
    }
    deleteData(customer: Customer): Observable<any> {
      return this.http.delete<any>(`${this.api}/delete-customer/${customer.customerid}`);
    }
    updateData(customer): Observable<any> {
      return this.http.put<any>(`${this.api}/update-customer`, customer);
    }

}
