import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PostService {
  api = 'https://jsonplaceholder.typicode.com/posts';
  constructor(private http: HttpClient) { }

  postData(post): Observable<any> {
    return this.http.post<any>(
      `${this.api}/add-post`, post);
   }

   getData(): Observable<any> {
     return this.http.get<any>(`https://jsonplaceholder.typicode.com/posts`);
   }
  

}
