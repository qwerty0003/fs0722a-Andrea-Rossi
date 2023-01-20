import { Component, OnInit } from '@angular/core';
import { Sport, SportsService } from '../sports.service';
import { catchError } from 'rxjs';

@Component({
    selector: 'app-sports',
    templateUrl: './sports.component.html',
    styleUrls: ['./sports.component.scss'],
})
export class SportsComponent implements OnInit {
    sports: Sport[] = [];

    constructor(private ss: SportsService) {}
    //è importante usare il catcherror nella pipe perchè il token aggiunto dall'interceptor in base al login, se non dovesse essere inserito correttamente allora l'errore ci arriva dalla response
    ngOnInit(): void {
        this.ss.getSports().pipe(catchError((err)=>{
            console.log(err);
            this.sports = [{id:0,nome:'ERRORE'}];
            throw err
        })).subscribe((res) => {
            console.log(res);
            this.sports = res;
        });
    }
}
