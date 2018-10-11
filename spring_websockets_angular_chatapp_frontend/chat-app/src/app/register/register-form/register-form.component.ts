import {Component, OnInit, Output, EventEmitter} from '@angular/core';
import {Location} from '@angular/common';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {User} from '../../model/user';
import {PasswordValidation} from './password-validation';

@Component({
    selector: 'app-register-form',
    templateUrl: './register-form.component.html',
    styleUrls: ['./register-form.component.scss']
})
export class RegisterFormComponent implements OnInit {

    public user: User;
    @Output() registerData: EventEmitter<any> = new EventEmitter<any>();

    public registerForm = this.formBuilder.group({
        name: ['', Validators.required],
        username: ['', Validators.required],
        email: ['', Validators.required],
        passwords: this.formBuilder.group({
            password: ['', Validators.required],
            confirmPassword: ['', Validators.required]
        }, {
            validator: PasswordValidation.matchPassword
        })
    });

    constructor(private location: Location, private formBuilder: FormBuilder) {
    }

    ngOnInit() {
        this.user = new User();
    }

    public goBack() {
        this.location.back();
    }

    public onSubmit() {
        const user = new User(this.registerForm.value.name, this.registerForm.value.username,
            this.registerForm.value.email, this.registerForm.value.passwords.password);
        console.log(user);
        this.registerData.emit(user);
    }

}
