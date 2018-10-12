import {AbstractControl, FormGroup, ValidationErrors, ValidatorFn} from '@angular/forms';

export class PasswordValidation {

    static matchPassword: ValidatorFn = (control: FormGroup): ValidationErrors | null => {
        const password = control.get('password').value; // to get value in input tag
        const confirmPassword = control.get('confirmPassword').value; // to get value in input tag
        return password !== confirmPassword ? {'matchPassword': true} : null;
    };
}
