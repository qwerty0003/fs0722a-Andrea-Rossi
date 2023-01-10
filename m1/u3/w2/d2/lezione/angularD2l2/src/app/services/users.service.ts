import { Injectable } from '@angular/core';
import { User } from '../interfaces/user.interface';

@Injectable({
  providedIn: 'root',
})
export class UsersService {
  private users: User[] = [
    {
      id: 1,
      nome: 'Andrea',
      cognome: 'Rossi',
      email: 'andrea@rossi.com',
    },
    {
      id: 2,
      nome: 'Giggino',
      cognome: 'Iacono',
      email: 'giggino@iacono.com',
    },
    {
      id: 3,
      nome: 'Pino',
      cognome: 'Dalla Pineta',
      email: 'emailbuffa@buffo.com',
    }
  ];

  constructor() {}

  getUsers() {
    return this.users;
  }

  getUser(idUser: number) {
    //ricevo tutti gli oggetti dell'array in una variabile user ed estraggo l'oggetto che ha lo stesso id arrivato come parametro
    return this.users.find((user) => user.id === idUser);
  }
}
