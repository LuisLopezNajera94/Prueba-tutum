import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http: HttpClient) { }


  getAlumnos():any{
    return this.http.get("http://localhost:8080/alumnos")
  }

  
  getMaterias():any{
    return this.http.get("http://localhost:8080/materias")
  }

  
  getCalificaciones(id:any):any{
    return this.http.get("http://localhost:8080/calificaciones?id=" + id)
  }

  deleteCalificacion(id:any):any{
    return this.http.delete("http://localhost:8080/eliminaCalificaciones?id=" + id)
  }

  insertCalificacion(calificacion:any):any{
    return this.http.post("http://localhost:8080/altaCalificaion",calificacion)
  }

  updateCalificacion(calificacion:any):any{
    return this.http.put("http://localhost:8080/actualizaCalificaion",calificacion)
  }



}
