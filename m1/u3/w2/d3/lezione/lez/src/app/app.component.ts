import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  title = 'lez';

  users = [
    {
      nome: 'Mario',
      cognome: 'Rossi',
    },
    {
      nome: 'Gino',
      cognome: 'Bianchi',
    },
    {
      nome: 'Micuzzo',
      cognome: 'Neri',
    },
    {
      nome: 'Pino',
      cognome: 'Della Pineta',
    },
    {
      nome: 'Gennaro',
      cognome: 'Gialli',
    },
    {
      nome: 'Franchino',
      cognome: 'Verdi',
    },
  ];
}
