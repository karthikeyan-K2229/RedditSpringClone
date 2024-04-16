import { BrowserModule } from '@angular/platform-browser';
import { CUSTOM_ELEMENTS_SCHEMA, NgModule } from '@angular/core';
import { CreateSubredditComponent } from './create-subreddit/create-subreddit.component';
import { ListSubredditComponent } from './list-subreddit/list-subreddit.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { RouterModule, RouterOutlet } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { SubredditserviceService } from './services/subredditservice.service';

@NgModule({
    declarations: [
       AppComponent,
        CreateSubredditComponent,
        ListSubredditComponent
      
    ],
    imports: [
      BrowserModule,
      AppRoutingModule,
      FormsModule,
      HttpClientModule,
      RouterModule,
      ReactiveFormsModule
  
    ],
    providers: [HttpClientModule],
    bootstrap: [AppComponent]
    
  })
  export class AppModule { }