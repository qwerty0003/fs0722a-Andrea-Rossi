import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { User } from 'src/app/interface/user.interface';

@Component({
    selector: 'app-new-user',
    templateUrl: './new-user.component.html',
    styleUrls: ['./new-user.component.scss'],
})
export class NewUserComponent implements OnInit {
    @Output() onManCreated = new EventEmitter<User>();
    @Output() onWomanCreated = new EventEmitter<User>();

    newName = '';
    newSurname = '';
    newAge = 0;

    constructor() {}

    onAddMan() {
        this.onManCreated.emit({
            name: this.newName,
            surname: this.newSurname,
            sex: 'Uomo',
            age: this.newAge,
        });
    }

    onAddWoman() {
        this.onWomanCreated.emit({
            name: this.newName,
            surname: this.newSurname,
            sex: 'Donna',
            age: this.newAge,
        });
    }

    ngOnInit(): void {}
}
