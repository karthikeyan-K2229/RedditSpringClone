import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateSubredditComponent } from './create-subreddit/create-subreddit.component';


export const routes: Routes = [
  {path: '', component: CreateSubredditComponent }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule
{}