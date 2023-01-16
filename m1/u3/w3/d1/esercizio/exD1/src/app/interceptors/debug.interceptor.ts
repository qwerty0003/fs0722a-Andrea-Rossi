import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor,
  HttpErrorResponse
} from '@angular/common/http';
import { Observable,  catchError,  map, throwError } from 'rxjs';

@Injectable()
export class DebugInterceptor implements HttpInterceptor {

  constructor() {}

  intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {
    console.log("Richiesta interceptor");
        return next.handle(request)
            .pipe(
                map(res => {
                    console.log("Risposta interceptor");
                    return res
                }),catchError((error: HttpErrorResponse) => {
                  let errorMsg = '';
                  if (error.error instanceof ErrorEvent) {
                      console.log('Errore client side');
                      errorMsg = `Error: ${error.error.message}`;
                  } else {
                      console.log('Errore server side');
                      errorMsg = `Error Code: ${error.status},  Message: ${error.message}`;
                  }
                  console.log(errorMsg);
                  return throwError(errorMsg);
              })
          )
  }
}
