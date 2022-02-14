import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Formulario } from '../model/Formulario';

@Injectable({
  providedIn: 'root'
})
export class FormularioService {

  constructor(
    private http: HttpClient,
    private router: Router
  ) { }

  enviar(formulario: Formulario): Observable<Formulario> {
    return this.http.post<Formulario>('http://localhost:8080/contatos', formulario)
  }

  getAllContatos (): Observable<Formulario[]>{

    return this.http.get<Formulario[]>('http://localhost:8080/contatos')
  }
}
