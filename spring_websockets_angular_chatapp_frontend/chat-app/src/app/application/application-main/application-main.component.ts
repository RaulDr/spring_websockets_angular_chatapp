import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {HttpClient, HttpErrorResponse, HttpHeaders} from '@angular/common/http';

@Component({
    selector: 'app-application-main',
    templateUrl: './application-main.component.html',
    styleUrls: ['./application-main.component.scss']
})
export class ApplicationMainComponent implements OnInit {

    constructor(private router: Router, private http: HttpClient) {
    }

    httpOptions = {
        headers: new HttpHeaders({
            'Authorization': localStorage.getItem('token')
        })
    };

    ngOnInit() {
        // this.sync();
        if (!localStorage.getItem('token')) {
            this.router.navigate(['']);
        }
    }

    onLogOut() {
        localStorage.removeItem('token');
        this.router.navigate(['']);
    }

    sync() {
        this.http.post('http://localhost:8000/api/student/sync', {}, this.httpOptions)
            .subscribe(studentInfo => {
                console.log('ceva');
                console.log(studentInfo['student']['subjects']);
                // this.subjects = studentInfo['student']['subjects'] as string[];
            }, (err: HttpErrorResponse) => {
                console.log(err.message);
                localStorage.removeItem('token');
                this.router.navigate(['students']);
            });
    }

}
