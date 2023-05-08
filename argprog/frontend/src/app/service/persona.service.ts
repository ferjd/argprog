import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { persona } from 'src/app/model/persona.model';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {
  url='http://localhot:8080/persona/';
  constructor(private http: HttpClient) { }
  /**
   * getPersona 
 */
  public getPersona():Observable<persona> {
        return this.http.get<persona>(`${this.url}traer/perfil`);
  }
}
