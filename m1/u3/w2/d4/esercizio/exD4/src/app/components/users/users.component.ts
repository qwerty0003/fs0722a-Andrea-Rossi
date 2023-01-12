import { Component, OnInit, importProvidersFrom } from '@angular/core';
import { User } from 'src/app/user';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.scss']
})
export class UsersComponent implements OnInit {

  users:User[]= this.userSrv.getUser()

  constructor(private userSrv:UserService) { }

  ngOnInit(): void {  }

}
