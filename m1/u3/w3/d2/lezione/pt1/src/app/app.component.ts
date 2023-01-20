import { Component, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  @ViewChild('form', { static: true }) form!: NgForm;
  stampa:boolean=false

  userForm = {
    defUserName: '',
    email: '',
    question: '',
  };

  generi = [
    {
      label: 'Uomo',
      value: 'Uomo',
    },
    {
      label: 'Donna',
      value: 'Donna',
    },
    {
      label: 'Preferisco non rispondere',
      value: 'N/A',
    },
  ];

  risposta = '';

  user: any = {
    username: '',
    email: '',
    secret: '',
    sesso: '',
    risposta: '',
  };

  ngOnInit(): void {
    this.form.statusChanges?.subscribe((status) => {
      console.log('Stato del form', status);
    });
  }

  generateUsername() {
    this.form.form.patchValue({
      userInfo: {
        email: 'email@buffa.net',
        username: 'jezus',
      },
    });
  }

  submit() {
    console.log('FORM INVIATO: ', this.form);
    this.stampa = true
    this.user.username = this.form.value.userInfo.username;
    this.user.email = this.form.value.userInfo.email;
    this.user.secret = this.form.value.userInfo.secret;
    this.user.sesso = this.form.value.userInfo.sesso;
    this.user.risposta = this.form.value.userInfo.risposta;

    this.form.reset();
  }
}
