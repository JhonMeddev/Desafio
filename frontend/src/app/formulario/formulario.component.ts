import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { Formulario } from '../model/Formulario';
import { FormularioService } from '../service/formulario.service';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent implements OnInit {

  formulario : Formulario = new Formulario();

  listaContatos: Formulario[]

  constructor(
    private router: Router,
    private formularioService: FormularioService
  ) { }

  ngOnInit(): void {

    this.getAllContatos()
  }

  getAllContatos(){
    this.formularioService.getAllContatos().subscribe((resp: Formulario[]) => {
      this.listaContatos = resp
    })
  }

  enviar(){

    this.formularioService.enviar(this.formulario).subscribe((resp: Formulario) => {
      this.formulario = resp
      alert('Dados Enviado com sucesso!')
      this.formulario = new Formulario()
      this.getAllContatos()

    })
  }


}
