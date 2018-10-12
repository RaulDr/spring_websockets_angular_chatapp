import {Component, OnInit} from '@angular/core';
import {Location} from '@angular/common';
import {Router} from '@angular/router';

@Component({
    selector: 'app-main',
    templateUrl: './main.component.html',
    styleUrls: ['./main.component.scss']
})
export class MainComponent implements OnInit {

    public isMainRoute: boolean;

    constructor(private location: Location, private router: Router) {
        this.isMainRoute = true;
    }

    ngOnInit() {
        if (localStorage.getItem('token')) {
            this.router.navigate(['app']);
        }
    }

    public goBack() {
        this.location.back();
    }

}
