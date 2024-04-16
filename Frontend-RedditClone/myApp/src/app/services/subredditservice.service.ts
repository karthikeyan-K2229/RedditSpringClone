import { Injectable } from '@angular/core';
import { Subreddit } from '../models/subreddit';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class SubredditserviceService {
  constructor(private http: HttpClient) { }
  createsubreddit(subredditModel: Subreddit): Observable<object> {
    console.log(subredditModel);
    return this.http.post<any>('http://localhost:8080/api/subreddit',subredditModel);
  }
  getAllSubreddits(): Observable<Array<Subreddit>> {
    return this.http.get<Array<Subreddit>>('http://localhost:8080/api/subreddit');
  }

  
}
