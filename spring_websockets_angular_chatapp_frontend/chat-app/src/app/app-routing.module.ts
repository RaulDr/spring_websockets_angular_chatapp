import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {MainComponent} from './main/main/main.component';
import {RegisterMainComponent} from './auth/register/register-main/register-main.component';
import {LoginComponent} from './auth/login/login/login.component';
import {ApplicationMainComponent} from './application/application-main/application-main.component';

const routes: Routes = [
    {path: '', redirectTo: '/main', pathMatch: 'full'},
    {
        path: 'main', component: MainComponent,
        children: [
            {path: 'register', component: RegisterMainComponent},
            {path: 'login', component: LoginComponent},
        ]
    },

    {path: 'app', component: ApplicationMainComponent},

];

@NgModule({
    imports: [
        RouterModule.forRoot(routes)
    ],
    exports: [RouterModule]
})
export class AppRoutingModule {
}
