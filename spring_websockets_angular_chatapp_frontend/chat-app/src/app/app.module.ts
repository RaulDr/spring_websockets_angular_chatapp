import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {RegisterFormComponent} from './auth/register/register-form/register-form.component';
import {AppRoutingModule} from './app-routing.module';
import {MainComponent} from './main/main/main.component';
import {RegisterMainComponent} from './auth/register/register-main/register-main.component';
import {ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {ConfigService} from './config/config.service';
import { LoginComponent } from './auth/login/login/login.component';
import { ApplicationMainComponent } from './application/application-main/application-main.component';

@NgModule({
    declarations: [
        AppComponent,
        RegisterFormComponent,
        MainComponent,
        RegisterMainComponent,
        LoginComponent,
        ApplicationMainComponent
    ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        ReactiveFormsModule,
        HttpClientModule
    ],
    providers: [ConfigService],
    bootstrap: [AppComponent]
})
export class AppModule {
}
