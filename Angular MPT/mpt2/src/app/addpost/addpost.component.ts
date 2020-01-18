import { Component, OnInit } from '@angular/core';
import { PostService } from '../post.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-addpost',
  templateUrl: './addpost.component.html',
  styleUrls: ['./addpost.component.css']
})
export class AddpostComponent implements OnInit {
  message: string;
  constructor(private postService: PostService) { }

  ngOnInit() {
  }
  addPost(form: NgForm) {
    this.postService.postData(form.value).subscribe(data => {
      console.log(data);
      this.message = data.message;
      setTimeout( () => {
        this.message = null;
      }, 2000);
      form.reset();
    }, err => {
      console.log(err);
   });

}
