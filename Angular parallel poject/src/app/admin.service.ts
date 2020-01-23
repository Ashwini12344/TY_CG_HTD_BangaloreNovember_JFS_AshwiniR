import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminService {
  url = 'http://localhost:8087';

  constructor(private http: HttpClient) { }

  // registerUser(userDetails): Observable<any> {
  //   return this.http.post<any>(`${this.url}/add-user`, userDetails);
  // }

  login(userCredentials): Observable<any> {
    return this.http.get<any>(`http://localhost:8087/user-login`,  {params: userCredentials});
  }
}
