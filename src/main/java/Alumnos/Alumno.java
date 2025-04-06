package Alumnos;

import Materias.Materia;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombreAlumno;
    private String apellido;
    public List<Materia> materiasAprob = new ArrayList<>();
    public List<Materia> materiasInscriptas = new ArrayList<>();

    public void agregarMateriasAprobadas(Materia materiaAprob){
        this.materiasAprob.add(materiaAprob);
    }
    public void inscribirMateria(Materia materiaInscripcion){
        this.materiasInscriptas.add(materiaInscripcion);
    }
    public List<Materia> getMateriasAprobadas(){
        return this.materiasAprob;
    }
}


