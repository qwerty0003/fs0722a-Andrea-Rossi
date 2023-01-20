import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-td-form',
  templateUrl: './td-form.component.html',
  styleUrls: ['./td-form.component.scss'],
})
export class TdFormComponent implements OnInit {
  @ViewChild('form', { static: true }) form!: NgForm;
  stampa: boolean = false;

  poteri = [
    {
      label: 'Invisibilità',
      value: 'Invisibilità',
    },
    {
      label: 'Super forza',
      value: 'Super forza',
    },
    {
      label: 'Occhi laser',
      value: 'occhi laser',
    },
  ];

  superUser: any = {
    name: '',
    alterEgo: '',
    power: '',
    enemy: '',
    planet: '',
    weakness: '',
  };

  userForm = {
    name: '',
    alterEgo: '',
    power: '',
    enemy: '',
    planet: '',
  };

  ngOnInit(): void {
    this.form.statusChanges?.subscribe((status) => {
      console.log('Form status', status);
    });
  }

  generateHero() {
    this.form.form.patchValue({
      heroInfo: {
        name: 'Chucky Lee',
        alterEgo: 'Superguy',
        power: 'Super forza',
        enemy: 'Evilgirl',
        planet: 'Namecc',
      },
    });
  }

  submit() {
    console.log('FORM INVIATO: ', this.form);
    console.log(this.superUser);
    this.stampa = true
    this.superUser.name = this.form.value.heroInfo.name;
    this.superUser.alterEgo = this.form.value.heroInfo.alterEgo;
    this.superUser.power = this.form.value.heroInfo.power;
    this.superUser.enemy = this.form.value.heroInfo.enemy;
    this.superUser.planet = this.form.value.heroInfo.planet;
    this.superUser.weakness = this.form.value.heroInfo.weakness;

    this.form.reset();
  }
}
