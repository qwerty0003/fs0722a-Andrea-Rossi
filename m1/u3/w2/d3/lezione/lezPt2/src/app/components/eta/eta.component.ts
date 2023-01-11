import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
    selector: 'app-eta',
    templateUrl: './eta.component.html',
    styleUrls: ['./eta.component.scss'],
})
export class EtaComponent implements OnInit {
    @Input() eta!: number;
    @Output() etaChange = new EventEmitter<number>();

    constructor() {}

    add() {
        this.eta++;
        this.etaChange.emit(this.eta);
    }
    add2() {
        let age = this.eta + 10;
        this.etaChange.emit(age);
    }
    remove() {
        this.eta--;
        if (this.eta >= 0) {
            this.etaChange.emit(this.eta);
        } else {
            this.eta = 0;
        }
    }
    remove2() {
        let age = this.eta - 10;
        if (this.eta >= 0) {
            this.etaChange.emit(age);
        } else {
            this.eta = 0;
        }
    }
    removeAll(){
        this.eta = 0
        this.etaChange.emit(this.eta);
    }

    ngOnInit(): void {}
}
