import { Component, OnInit } from '@angular/core';
import { ScheduleService } from '../schedule.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-schedules',
  templateUrl: './schedules.component.html',
  styleUrls: ['./schedules.component.css']
})
export class SchedulesComponent implements OnInit {

  message;
  schedules: Schedule[];

  constructor(private scheduleService: ScheduleService, private router: Router) {
    this.getAllSchedules();

   }

   getAllSchedules() {
     this.scheduleService.getData().subscribe(response => {
       console.log(response);
       this.schedules = response.bean;
     }, err => {
       console.log(err);
     });
   }
deleteSchedule(schedule: Schedule) {
    this.scheduleService.deleteData(schedule).subscribe(response => {
      console.log(response);
      if (response.statuscode === 201) {
        this.schedules.splice(this.schedules.indexOf(schedule), 1);
        this.message = response.message;
      } else {
        this.message = response.message;
      }
    });
  }
  deleteMessage() {
    this.message = null;
  }

  selectSchedule(schedule) {
    console.log(schedule);
    // this.customerService.selectedCustomerToUpdate = customer;
    this.router.navigate([`update-schedule/${schedule.scheduleId}`],
      {
        queryParams: {
          scheduleId: schedule.scheduleId,
          prodId: schedule.prodId,
          contractNo: schedule.contractNo,
          deliveryDate: schedule.deliveryDate
          }
      }
    );
  }
  ngOnInit() {
  }

}



