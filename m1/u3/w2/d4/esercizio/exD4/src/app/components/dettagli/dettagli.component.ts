import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Post } from 'src/app/post';
import { PostService } from 'src/app/post.service';

@Component({
  selector: 'app-dettagli',
  templateUrl: './dettagli.component.html',
  styleUrls: ['./dettagli.component.scss']
})
export class DettagliComponent implements OnInit {

  p!:Post;

  constructor(private postSrv:PostService, private actRoute:ActivatedRoute) { }

  ngOnInit(): void {
    let id = this.actRoute.snapshot.params['id'];
    let post = this.postSrv.getPost(id)
    this.p = post
    console.log(this.p)
  }

}
