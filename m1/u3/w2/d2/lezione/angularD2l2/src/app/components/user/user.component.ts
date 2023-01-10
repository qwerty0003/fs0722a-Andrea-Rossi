import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/interfaces/user.interface';
import { UsersService } from 'src/app/services/users.service';
import { ActivatedRoute, Params } from '@angular/router';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.scss'],
})
export class UserComponent implements OnInit {
  user!: User | undefined;
  sub!: Subscription;

  constructor(private userSrv: UsersService, private router: ActivatedRoute) {}

  ngOnInit(): void {
    this.sub = this.router.params.subscribe((params: Params) => {
      const id = +params['id'];
      this.user = this.userSrv.getUser(id);
    });
  }
  
  ngOnDestroy(): void {
    this.sub.unsubscribe;
  }
}
