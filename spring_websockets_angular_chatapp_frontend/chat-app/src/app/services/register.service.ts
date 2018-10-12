import {Injectable} from '@angular/core';

@Injectable({
    providedIn: 'root'
})
export class RegisterService {

    constructor() {
    }

    registerUser(data) {
        console.log('data', data);
    }
}
