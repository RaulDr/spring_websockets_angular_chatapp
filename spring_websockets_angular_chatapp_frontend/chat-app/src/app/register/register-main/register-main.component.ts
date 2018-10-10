import {Component, OnInit} from '@angular/core';
import {FormControl} from '@angular/forms';
import {RegisterService} from '../../services/register.service';

@Component({
    selector: 'app-register-main',
    templateUrl: './register-main.component.html',
    styleUrls: ['./register-main.component.scss']
})
export class RegisterMainComponent implements OnInit {

    constructor(private register: RegisterService) {
    }

    ngOnInit() {
    }

    doSomething(ceva) {
        this.register.registerUser(ceva.value);
    }

}
