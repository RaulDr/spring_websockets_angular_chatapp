import {Component, OnInit} from '@angular/core';
import {FormBuilder, Validators} from '@angular/forms';
import {ApiService} from '../../../services/api.service';
import {Router} from '@angular/router';
import {Location} from '@angular/common';

@Component({
    selector: 'app-login',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

    public userNotFound: boolean;

    public loginForm = this.formBuilder.group({
        username: ['', Validators.required],
        password: ['', Validators.required]
    });

    constructor(private formBuilder: FormBuilder, private apiService: ApiService, private router: Router, private location: Location) {
        this.userNotFound = false;
    }

    ngOnInit() {
    }

    onSubmit() {
        if (this.loginForm.dirty && this.loginForm.valid) {
            console.log(this.loginForm.value);

            this.apiService.loginUser('/login', this.loginForm.value).subscribe(res => {
                if (!res) {
                    console.log('unauthorized');
                } else {
                    this.userNotFound = false;
                    console.log(res);
                    localStorage.setItem('token', res['token']);
                    this.router.navigate(['app']);
                }
            }, error => {
                this.userNotFound = true;
                console.log('unauthorized');
                console.log(error);
            });
        }
    }

    public goBack() {
        this.location.back();
    }


}
