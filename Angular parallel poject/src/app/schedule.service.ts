import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ScheduleService {
  api = 'http://localhost:8087';
  constructor(private http: HttpClient) { }

postData(scheduler): Observable<any> {
    return this.http.post<any>(
      `${this.api}/add-schedule`,
      scheduler);
   }
   getData(): Observable<any> {
    return this.http.get<any>(`http://localhost:8087/get-allschedule`);
  }
  deleteData(schedule: Schedule): Observable<any> {
    return this.http.delete<any>(`${this.api}/delete-schedule/${schedule.scheduleId}`);
  }
  updateData(schedule): Observable<any> {
    return this.http.put<any>(`${this.api}/update-schedule`, schedule);
  }

}
