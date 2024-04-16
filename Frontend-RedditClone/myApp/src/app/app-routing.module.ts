import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateSubredditComponent } from './create-subreddit/create-subreddit.component';
import { ListSubredditComponent } from './list-subreddit/list-subreddit.component';


export const routes: Routes = [
  {path: '', component: CreateSubredditComponent },
  {path:'list',component:ListSubredditComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule
{}