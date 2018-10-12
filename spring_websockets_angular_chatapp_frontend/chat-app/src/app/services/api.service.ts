import {Injectable} from '@angular/core';
import {environment} from '../../environments/environment';
import {Observable, of, throwError} from 'rxjs';
import {map, catchError} from 'rxjs/operators';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {ConfigService} from '../config/config.service';


const httpOptions = {
    headers: new HttpHeaders({
        'Content-Type': 'application/json',
        'Accept': 'application/json'
    })
};

@Injectable({
    providedIn: 'root'
})
export class ApiService {

    constructor(private http: HttpClient, private config: ConfigService) {
    }

    private formatErrors(error: any) {
        return Observable.throw(error);
    }

    get(path: string, params: URLSearchParams = new URLSearchParams()): Observable<any> {
        return this.http.get(`${environment.api_url}${path}`, httpOptions).pipe(map((res: Response) => res.json()),
            catchError(this.formatErrors));
    }


    put(path: string, body: Object = {}): Observable<any> {
        console.log('path: ' + path);
        console.log(JSON.stringify(body));
        return this.http.put(
            `${environment.api_url}${path}`,
            JSON.stringify(body),
            httpOptions
        ).pipe(map((res: Response) => res.json()), catchError(this.formatErrors));
    }

    loginUser(path: String, body: Object = {}): Observable<any> {
        return this.http.post(
            `${environment.api_url}${path}`,
            JSON.stringify(body),
            httpOptions
        );
    }

    registerUser(path: string, body: Object = {}): Observable<any> {
        return this.http.post(
            `${environment.api_url}${path}`,
            JSON.stringify(body),
            httpOptions
        ).pipe(catchError(this.config.handleError));
    }

    delete(path): Observable<any> {
        return this.http.delete(
            `${environment.api_url}${path}`,
            httpOptions
        ).pipe(map((res: Response) => res.json()), catchError(this.formatErrors));
    }
}
