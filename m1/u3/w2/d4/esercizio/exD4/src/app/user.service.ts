import { Injectable } from '@angular/core';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  user:User[]=[
    {
      id: 0,
      name:'John',
      role:'user',
      email:'john@email.com'
    },
    {
      id: 1,
      name:'Banana',
      role:'admin',
      email:'banana@inpigiama.com'
    },
    {
      id: 2,
      name:'Ginuzzo',
      role:'user',
      email:'gin@uzzo.com'
    }
  ]

  constructor() { }

  getUser(){
    return this.user
  }
  //metodo per ricavare un singolo el, usato in user-child-1.component.ts
  getSingle(i:number){
    return this.user[i]
  }

}
