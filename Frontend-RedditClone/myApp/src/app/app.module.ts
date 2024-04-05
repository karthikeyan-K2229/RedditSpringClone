import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { CreateSubredditComponent } from './create-subreddit/create-subreddit.component';
import { ListSubredditComponent } from './list-subreddit/list-subreddit.component';

@NgModule({
    declarations: [
        CreateSubredditComponent,
        ListSubredditComponent
      
    ],
    imports: [
      BrowserModule,

    ],
    providers: [
     
    ],
    bootstrap: []
  })
  export class AppModule { }