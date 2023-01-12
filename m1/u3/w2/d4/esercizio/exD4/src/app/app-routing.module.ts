import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ActiveComponent } from './components/active/active.component';
import { InactiveComponent } from './components/inactive/inactive.component';
import { HomeComponent } from './components/home/home.component';
import { Error404Component } from './components/error404/error404.component';
import { UsersComponent } from './components/users/users.component';
import { UserChild1Component } from './components/user-child1/user-child1.component';
import { DettagliComponent } from './components/dettagli/dettagli.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
  },
  {
    path: 'active',
    component: ActiveComponent,
  },
  {
    path: 'inactive',
    component: InactiveComponent,
  },
  {
    path: 'active/details/:id',
    component: DettagliComponent,
  },
  {
    path: 'inactive/details/:id',
    component: DettagliComponent,
  },
  {
    path: 'users',
    component: UsersComponent,
    children: [
      {
        path:`:id`,
        component:UserChild1Component,
      },
    ],
  },
  {
    path: '**',
    component: Error404Component,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
