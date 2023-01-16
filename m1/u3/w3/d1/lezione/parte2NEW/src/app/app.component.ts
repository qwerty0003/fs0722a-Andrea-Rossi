import { Component } from '@angular/core';
import { UserInterface } from './interfaces/user.interface';
import { UsersService } from './users.service';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  newUser: {
    first_name: string;
    last_name: string;
  } = {
    first_name: '',
    last_name: '',
  };
  sub!: Subscription;
  users: UserInterface[] | undefined;

  constructor(private userSrv: UsersService) {}

  ngOnInit(): void {
    this.recuperaUtenti();
  }

  recuperaUtenti() {
    this.sub = this.userSrv.get().subscribe((ris) => {
      console.log(ris);
      this.users = ris;
    });
  }

  creaUtente() {
    this.sub = this.userSrv.post(this.newUser).subscribe((ris) => {
      console.log(ris);
      this.users?.push(ris);
    });
  }

  cancellaUtente(id:number){
    this.sub = this.userSrv.delete(id).subscribe(()=>{
      this.users = this.users?.filter((user) => user.id != id)
      console.log(`Utente ${id} cancellato :'(`)
    })
  }

  ngOnDestroy():void{
    this.sub.unsubscribe()
  }
}
