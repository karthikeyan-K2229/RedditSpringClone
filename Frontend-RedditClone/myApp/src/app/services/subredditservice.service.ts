import { Injectable } from '@angular/core';
import { Subreddit } from '../models/subreddit';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class SubredditserviceService {
  constructor(private http: HttpClient) { }
  createsubreddit(subredditModel: Subreddit): Observable<Subreddit> {
    console.log(this.createsubreddit)
    return this.http.post<Subreddit>('http://localhost:8080/api/subreddit',
      subredditModel);
  }

  
}
