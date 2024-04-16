import { Component } from '@angular/core';
import { Subreddit } from '../models/subreddit';
import { SubredditserviceService } from '../services/subredditservice.service';
import { throwError } from 'rxjs';

@Component({
  selector: 'app-list-subreddit',
  standalone: true,
  imports: [],
  templateUrl: './list-subreddit.component.html',
  styleUrl: './list-subreddit.component.css'
})
export class ListSubredditComponent {
  subreddits:any;
  constructor(private subredditService: SubredditserviceService) { }

  ngOnInit() {
    this.subredditService.getAllSubreddits().subscribe((data) => {
      this.subreddits = data;
    }, (error) => {
      throwError(error);
    })
  }

}
