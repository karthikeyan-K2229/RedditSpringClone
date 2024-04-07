import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { SubredditserviceService } from '../services/subredditservice.service';
import { Subreddit } from '../models/subreddit';
import { Observable, throwError } from 'rxjs';

@Component({
  selector: 'app-create-subreddit',
  standalone: true,
  imports: [],
  templateUrl: './create-subreddit.component.html',
  styleUrl: './create-subreddit.component.css'
})

export class CreateSubredditComponent {
  createSubreddit: any;
  subredditModel: Subreddit;
  title = new FormControl('');
  description = new FormControl('');
 
  constructor(private subredditservice: SubredditserviceService, private _router : Router  )
  {
    this.createSubreddit=new FormGroup({
      title: new FormControl('', Validators.required),
      description: new FormControl('', Validators.required)
    });

    this.subredditModel = {
      name: '',
      description: ''
    }
  }
  createSubredditfunc()
  {
    this.subredditModel.name=this.createSubreddit.get('title').value;
    this.subredditModel.description=this.createSubreddit.get('description').value;
    this.subredditservice.createsubreddit(this.subredditModel).subscribe(data => {
      this._router.navigateByUrl('/list-subreddits');
  }, (error) => {
    throwError(error);
  })
}
}
