import { Injectable } from '@angular/core';
import { HttpClient}  from '@angular/common/http'
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  Url = 'http://localhost:8080/api/users';

  constructor(private http: HttpClient) { }

  adduser(data:any):Observable<any[]>{
    return this.http.post<any[]>(this.Url,data)
  }

  getUsers(): Observable<any[]> {
    return this.http.get<any[]>(this.Url);
  }
  
  update(id:number, data:any):Observable<any[]>{
    return this.http.put<any[]>(this.Url+id, data)
  }

  delete(id:number):Observable<any[]>{
    return this.http.delete<any[]>(this.Url+id)
  }
}