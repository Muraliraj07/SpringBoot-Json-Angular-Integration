import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent {

  users: any;
  constructor(private userService: ServiceService) { }

  ngOnInit() {
    this.userService.getUsers().subscribe(data => {
      // console.log(data); 
      this.users = data;
    });                 
  }
}
