import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ContractService {

  api = 'http://localhost:8087';

  constructor(private http: HttpClient) { }

  postData(bean): Observable<any> {
    return this.http.post<any>(
      `${this.api}/add-contract`,
      bean);
   }

    getData(): Observable<any> {
    return this.http.get<any>(`http://localhost:8087/get-allcontracts`);
    }
    deleteData(contract: Contract): Observable<any> {
      return this.http.delete<any>(`${this.api}/delete-contractor/${contract.contractNo}`);
    }
   }
