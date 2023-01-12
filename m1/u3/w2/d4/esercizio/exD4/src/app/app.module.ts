import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { ActiveComponent } from './components/active/active.component';
import { InactiveComponent } from './components/inactive/inactive.component';
import { PostCardComponent } from './components/post-card/post-card.component';
import { HomeComponent } from './components/home/home.component';
import { EvidenziaDirective } from './directives/evidenzia.directive';
import { Error404Component } from './components/error404/error404.component';
import { UsersComponent } from './components/users/users.component';
import { UserChild1Component } from './components/user-child1/user-child1.component';
import { DettagliComponent } from './components/dettagli/dettagli.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    ActiveComponent,
    InactiveComponent,
    PostCardComponent,
    HomeComponent,
    EvidenziaDirective,
    Error404Component,
    UsersComponent,
    UserChild1Component,
    DettagliComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
