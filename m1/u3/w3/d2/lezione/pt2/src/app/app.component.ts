import { FormatWidth } from '@angular/common';
import { Component } from '@angular/core';
import {
  FormBuilder,
  FormControl,
  FormGroup,
  FormArray,
  Validators,
} from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  title = 'pt2';

  generi = ['uomo', 'donna', 'n/a'];
  form!: FormGroup;
  usernameProibiti = ['Mario', 'Anna'];

  constructor(private fb: FormBuilder) {}

  ngOnInit(): void {
    this.form = this.fb.group({
      userInfo: this.fb.group({
        username: this.fb.control(null, [
          Validators.required,
          this.validUsername,
        ]),
        email: this.fb.control(null, [Validators.required, Validators.email]),
      }),
      genere: this.fb.control('n/a'),
      sports: this.fb.array(['']),
    });

    this.form.valueChanges.subscribe((value) => {
      console.log(value);
    });
  }

  validUsername = (formC: FormControl) => {
    if (this.usernameProibiti.includes(formC.value)) {
      return { usernameProibito: true };
    } else {
      return null;
    }
  };

  getErrorsC(name: string, error: string) {
    return this.form.get(name)?.errors![error];
  }

  getFormC(name: string) {
    return this.form.get(name);
  }

  getSportsF() {
    return (this.form.get('sports') as FormArray).controls;
  }

  addSports() {
    const control = this.fb.control(null);
    (this.form.get('sports') as FormArray).push(control);
    console.log(this.getSportsF());
  }

  submit() {
    console.log(this.form);
    console.log('form correttamente inviato');
    this.getSportsF().length=1;
    this.form.reset();
  }
}
