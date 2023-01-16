import { Component, OnInit } from '@angular/core';
import { Observable, Subscription } from 'rxjs';
import { map } from 'rxjs/operators';

@Component({
    selector: 'app-users',
    templateUrl: './users.component.html',
    styleUrls: ['./users.component.scss'],
})
export class UsersComponent implements OnInit {
    sub!: Subscription; //oggetto che sottoscriverà l'observable
    conteggio: number = 0; //variabile che riceverà il valore dell'observable (observer)

    constructor() {}

    ngOnInit(): void {
        //creo l'observable
        const intervallo = new Observable((observer) => {
            let count = 0;
            setInterval(() => {
                //in una variabile chiamata observer, l'observable emette un valore (riga 30)
                observer.next(count);
                if (count == 5) {
                    observer.complete(); //completo l'observable al raggiungimento di un determinato valore
                    console.log('Observer completato!');
                }
                if (count > 3) {
                    observer.error(new Error('Count è troppo grande'));
                }
                count++; //incremento il valore emesso dall'observable
            }, 1000);
        });

        this.sub = intervallo.pipe(map((conta) => { //sottoscrivo l'observable
                    this.conteggio = Number(conta); //incremento la variabile con il valore dell'observable
                    return `Siamo al numero ${conta}`;
                })
            ).subscribe((numero) => { //sottoscrivo observable memorizzando il suo valore in una variabile
                    console.log(numero);
                },(error) => { //in caso di errore emetto l'errore ma non blocco il flusso
                    console.log(error);
                    alert(error);
                },() => {
                    console.log('Observable completato!'); //al completamento stampo il completamento
                }
            );
    }

    ngOnDestroy():void{
        this.sub.unsubscribe();
        console.log('Observable scaricato :)');
    }

}
