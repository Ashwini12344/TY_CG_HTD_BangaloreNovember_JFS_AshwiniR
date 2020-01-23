import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ScheduleService } from '../schedule.service';

@Component({
  selector: 'app-add-schedule',
  templateUrl: './add-schedule.component.html',
  styleUrls: ['./add-schedule.component.css']
})
export class AddScheduleComponent implements OnInit {
  description: string;
  constructor(private scheduleService: ScheduleService) { }
  addSchedule(form: NgForm) {
    this.scheduleService.postData(form.value).subscribe(data => {
      console.log(data);
      this.description = data.message;
      setTimeout( () => {
        this.description = null;
      }, 2000);
      form.reset();
    }, err => {
      console.log(err);
   });
    }
  ngOnInit() {
  }

}
