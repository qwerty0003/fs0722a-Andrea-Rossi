import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError } from 'rxjs/internal/operators/catchError';
import { map, take } from 'rxjs/operators';
import { AuthService } from 'src/app/auth/auth.service';

export interface Sport {
    nome: string;
    id: number;
}

@Injectable({
    providedIn: 'root',
})
export class SportsService {
    constructor(private http: HttpClient, private as:AuthService) {}

    getSports() {
        return this.http.get<Sport[]>('http://localhost4200/sports').pipe(catchError((err)=>{
            console.log(err);
            throw err
        }))
    }
}
