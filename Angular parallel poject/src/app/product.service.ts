import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  selectedProductToUpdate: Product;
  api = 'http://localhost:8087';

  constructor(private http: HttpClient) { }

  postData(product): Observable<any> {
    return this.http.post<any>(
      `${this.api}/add-product`,
      product);
   }

   getData(): Observable<any> {
     return this.http.get<any>(`http://localhost:8087/get-allproducts`);
   }
   deleteData(product: Product): Observable<any> {
     return this.http.delete<any>(`${this.api}/delete-product/${product.prodId}`);
   }
   updateData(product): Observable<any> {
     return this.http.put<any>(`${this.api}/update-product`, product);
   }
}
