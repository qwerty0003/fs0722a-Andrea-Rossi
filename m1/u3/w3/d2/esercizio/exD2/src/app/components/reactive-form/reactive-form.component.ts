// import { Component, OnInit } from '@angular/core';
// import {
//   FormBuilder,
//   FormControl,
//   FormGroup,
//   FormArray,
//   Validators,
// } from '@angular/forms';

// @Component({
//   selector: 'app-reactive-form',
//   templateUrl: './reactive-form.component.html',
//   styleUrls: ['./reactive-form.component.scss'],
// })
// export class ReactiveFormComponent implements OnInit {
//   form!: FormGroup;
//   enemyInvalid: boolean = false;
//   planetInvalid: boolean = false;

//   constructor(private formBuilder: FormBuilder) {}

//   ngOnInit(): void {
//     this.form = this.formBuilder.group({
//       heroInfo: this.formBuilder.group({
//         name: this.formBuilder.control(null, [Validators.required]),
//         alterEgo: this.formBuilder.control(null, [Validators.required]),
//         power: this.formBuilder.array([''], [Validators.required]),
//         enemy: this.formBuilder.control(null, [
//           Validators.required,
//           this.enemyValidator,
//         ]),
//         planet: this.formBuilder.control(null, [
//           Validators.required,
//           this.planetValidator,
//         ]),
//         weakness: this.formBuilder.array(['']),
//       }),
//     });

//     this.form.valueChanges.subscribe((value) => {
//       console.log(value);
//     });
//   }

//   enemyValidator(formControl: FormControl) {
//     if (formControl.value.length > 10) {
//       return { enemyInvalid: true };
//     } else {
//       return null;
//     }
//   }

//   planetValidator(formControl: FormControl) {
//     if (formControl.value.length < 5) {
//       return { planetInvalid: true };
//     } else {
//       return null;
//     }
//   }

//   getErrorsC(name: string, error: string) {
//     return this.form.get(name)?.errors![error];
//   }

//   getFormC(name: string) {
//     return this.form.get(name);
//   }

//   getPower() {
//     return (this.form.get('power') as FormArray).controls;
//   }

//   getWeakness() {
//     return (this.form.get('weakness') as FormArray).controls;
//   }

//   addPower() {
//     const control = this.formBuilder.control(null);
//     (this.form.get('powers') as FormArray).push(control);
//     console.log(this.getPower());
//   }
//   addWeakness() {
//     const control = this.formBuilder.control(null);
//     (this.form.get('sports') as FormArray).push(control);
//     console.log(this.getWeakness());
//   }

//   submit() {
//     console.log(this.form);
//     console.log('Form correttamente inviato');
//     this.getPower().length=1;
//     this.getWeakness().length=1;
//     this.form.reset();
//   }
// }

import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms'; ////
@Component({
     selector: 'app-reactive-form',
     templateUrl: './reactive-form.component.html',
     styleUrls: ['./reactive-form.component.scss'],
   })
export class ReactiveFormComponent implements OnInit {
  heroForm = new FormGroup ({
    name: new FormControl(''),
    weakness: new FormControl('')
  });
  preview: string = '';
  save() {
    this.preview = JSON.stringify(this.heroForm.value);
  }
  constructor() { }
  ngOnInit(): void {
  }
}
