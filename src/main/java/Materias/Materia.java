package Materias;
import Alumnos.Alumno;

import java.util.ArrayList;
import java.util.List;



public class Materia {
        private String nombreMat;
        public List<Materia> correlativas = new ArrayList<>();

        public boolean puedeSerCursadaPor(Alumno unAlumno){
            return unAlumno.materiasAprob.containsAll(this.correlativas); //si todos los elementos de la coleccion de correlativas estan presentes en materias aprobadas.
        }

    public void addCorrelativas(Materia unaMateria) {
        this.correlativas.add(unaMateria);
    }
}

