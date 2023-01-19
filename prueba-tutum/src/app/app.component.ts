import { Component } from '@angular/core';
import { ServiceService } from './service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'prueba-tatam';


  alumnoSeleccionado: any;
  materiaSeleccionada: any;
  promedio: any;
  alumnos: any[] = [];
  calificaciones: any[] = [];
  materias: any[] = [];
  calificacion = 0;
  calificacionUpdate = 0;
  materiaUpdate = "";
  calificacionActualizar: any;



  constructor(private service: ServiceService) {

    this.getAlumnos();
    this.getMaterias();

  }

  getAlumnos() {
    this.service.getAlumnos().subscribe(
      res => this.alumnos = res
    );
  }

  getMaterias() {
    this.service.getMaterias().subscribe(
      res => this.materias = res
    );
  }

  getCalificaciones() {
    this.service.getCalificaciones(this.alumnoSeleccionado.id).subscribe(
      res => {
        this.calificaciones = res.calificaciones,
          this.promedio = res.promedio
      }
    );
  }

  eliminarCalificacion(calificacion: any) {
    console.log(calificacion.id_t_calificacion);

    this.service.deleteCalificacion(calificacion.id_t_calificacion).subscribe(
      res => {
        alert(res.msg);
        this.getCalificaciones();
      },
      error => {
        alert(error.msg);
      }
    );
  }


  guardarCalificacion() {

    let calificacion = {
      id_t_materias: this.materiaSeleccionada.id,
      id_t_usuarios: this.alumnoSeleccionado.id,
      calificacion: this.calificacion
    }

    this.service.insertCalificacion(calificacion).subscribe(
      res => {
        alert(res.msg);
        this.getCalificaciones();
      },
      error => {
        alert(error.msg);
      }
    );

    this.calificacion = 0;
  }

  modalCalificacion(calificacion: any) {
    this.materiaUpdate = calificacion.materia;
    this.calificacionUpdate = calificacion.calificacion;
    this.calificacionActualizar = calificacion;
  }

  modificarCalificacion() {

    let calificacion = {
      id_t_calificaciones: this.calificacionActualizar.id_t_calificacion,
      id_t_materias: this.calificacionActualizar.id_t_materia,
      id_t_usuarios: this.calificacionActualizar.id_t_usuario,
      calificacion: this.calificacionUpdate
    }


    this.service.updateCalificacion(calificacion).subscribe(
      res => {
        alert(res.msg);
        this.getCalificaciones();
      },
      error => {
        alert(error.msg);
      }
    );






  }





}
