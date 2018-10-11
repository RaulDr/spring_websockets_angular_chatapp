import {Component, OnInit} from '@angular/core';
import {FormControl} from '@angular/forms';
import {RegisterService} from '../../services/register.service';
import {ApiService} from '../../services/api.service';

@Component({
    selector: 'app-register-main',
    templateUrl: './register-main.component.html',
    styleUrls: ['./register-main.component.scss']
})
export class RegisterMainComponent implements OnInit {

    constructor(private register: RegisterService, private apiService: ApiService) {
    }

    ngOnInit() {
    }

    doSomething(user) {
        this.register.registerUser(user);
        this.apiService.registerUser('/user/createAccount', user).subscribe(() => {
            console.log('posted');
        });
    }

}
