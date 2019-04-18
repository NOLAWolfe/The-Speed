import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavComponent } from './core/nav/nav.component';
import { ProfileComponent } from './user/profile/profile.component';
import { LoginComponent } from './core/login/login.component';
import { UserComponent } from './user/user/user.component';
import { RegisterComponent } from './core/register/register.component';
import { LandingComponent } from './core/landing/landing.component';
import { PageNotFoundComponent } from './core/page-not-found/page-not-found.component';

@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    ProfileComponent,
    LoginComponent,
    UserComponent,
    RegisterComponent,
    LandingComponent,
    PageNotFoundComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
