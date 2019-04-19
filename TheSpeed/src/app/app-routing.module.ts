import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './core/login/login.component';
import { RegisterComponent } from './core/register/register.component';
import { LandingComponent } from './core/landing/landing.component';
import { PageNotFoundComponent } from './core/page-not-found/page-not-found.component';
import { UserComponent } from './user/user/user.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  {
    path: 'landing', component: LandingComponent,
    children: [
      {path: 'login', component: LoginComponent },
      {path: 'register', component: RegisterComponent},
    ],
  },
  {path: '', redirectTo: 'landing', pathMatch: 'full'},
  {path: '**', component: PageNotFoundComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
