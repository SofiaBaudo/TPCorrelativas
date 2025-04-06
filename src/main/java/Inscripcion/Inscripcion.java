package Inscripcion;

import Alumnos.Alumno;
import Materias.Materia;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
        private String nombre;
        private List<Materia> materiasInscripcion = new ArrayList<Materia>();

        public void hacerInscripcion(Alumno alumno){
            materiasInscripcion = alumno.materiasInscriptas;
        }
        public boolean aprobada(Alumno unAlumno){
            return  this.materiasInscripcion.
                    stream()
                    .allMatch(materia -> materia.puedeSerCursadaPor(unAlumno));
        }


    }

