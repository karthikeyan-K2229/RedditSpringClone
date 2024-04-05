import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { SubredditserviceService } from '../services/subredditservice.service';
import { Subreddit } from '../models/subreddit';

@Component({
  selector: 'app-create-subreddit',
  standalone: true,
  imports: [],
  templateUrl: './create-subreddit.component.html',
  styleUrl: './create-subreddit.component.css'
})

export class CreateSubredditComponent {
  createSubreddit: any;
  subredditModel: Subreddit | undefined;
 
  constructor(private subredditservice: SubredditserviceService, private _router : Router  )
  {
    this.createSubreddit=new FormGroup({
      title: new FormControl('', Validators.required),
      description: new FormControl('', Validators.required)
    });
  }
  
}
