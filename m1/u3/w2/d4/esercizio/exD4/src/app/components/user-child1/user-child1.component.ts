import { Component, Input, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { User } from 'src/app/user';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-user-child1',
  templateUrl: './user-child1.component.html',
  styleUrls: ['./user-child1.component.scss'],
})
export class UserChild1Component implements OnInit {
  u!: User;

  constructor(
    private userSrv: UserService,
    private activatedRoute: ActivatedRoute
  ) {}

  ngOnInit(): void {
    //prendo dall'url l'id
    let id = this.activatedRoute.snapshot.params['id'];
    //uso l'id per il metodo getSigle()
    let user = this.userSrv.getSingle(id);
    //per poi salvare il singolo user nella variabile u
    this.u = user;
  }
}
