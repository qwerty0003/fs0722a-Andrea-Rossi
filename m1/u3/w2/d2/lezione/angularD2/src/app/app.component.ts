import { Component } from '@angular/core';
import { UserComponent } from './components/user/user.component';
import { UsersService } from './service/users.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
  providers: [UsersService],
})
export class AppComponent {
  title = 'angularD2';
  users = this.userSrv.users;
  constructor(private userSrv: UsersService) {}
}
