import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { SubredditserviceService } from '../services/subredditservice.service';
import { Subreddit } from '../models/subreddit';
import { Observable, throwError } from 'rxjs';

@Component({
  selector: 'app-create-subreddit',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './create-subreddit.component.html',
  styleUrl: './create-subreddit.component.css'
})

export class CreateSubredditComponent {
  createSubreddit: any;
  //subredditModel: Subreddit;
  title = new FormControl('');
  description = new FormControl('');
 
  constructor(private subredditservice: SubredditserviceService,
     private _router : Router,
     private formBuilder: FormBuilder )
  {
    this.forms();
  }
  forms()
  {
    this.createSubreddit=this.formBuilder.group(
      {
        title:[''],
        description:[''],
        numberOfPosts:['30']
      }
    );
  }
  createSubredditfunc()
  {
    console.log(this.createSubreddit.value);
  
    this.subredditservice.createsubreddit(this.createSubreddit.value).subscribe(data => {
      this._router.navigateByUrl('/list-subreddits');
  }, (error) => {
    throwError(error);
  })
}
}
