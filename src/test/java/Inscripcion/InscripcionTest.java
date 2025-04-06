package Inscripcion;

import Alumnos.Alumno;
import Materias.Materia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    public void esAceptadaLaInscripcion(){
        Alumno unAlumno = new Alumno();
        Materia analisis1 = new Materia();
        Materia paradigmas = new Materia();
        Materia analisis2 = new Materia();
        Materia logica = new Materia();
        Materia fisica1 = new Materia();
        Materia fisica2 = new Materia();
        analisis2.addCorrelativas(analisis1);
        paradigmas.addCorrelativas(logica);
        fisica2.addCorrelativas(analisis1);
        fisica2.addCorrelativas(fisica1);

        unAlumno.agregarMateriasAprobadas(analisis1);
        unAlumno.agregarMateriasAprobadas(logica);
        unAlumno.agregarMateriasAprobadas(fisica1);

        unAlumno.inscribirMateria(analisis2);
        unAlumno.inscribirMateria(paradigmas);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.hacerInscripcion(unAlumno);

        Assertions.assertTrue(inscripcion.aprobada(unAlumno));
    }

    @Test
    public void fallaInscripcionPorMateriaQueNoPuedeCursar(){
        Alumno otroAlumno = new Alumno();
        Materia fisica1 = new Materia();
        Materia fisica2 = new Materia();
        Materia programacion = new Materia();

        fisica2.addCorrelativas(fisica1);

        otroAlumno.inscribirMateria(fisica2);
        otroAlumno.inscribirMateria(programacion);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.hacerInscripcion(otroAlumno);

        Assertions.assertFalse(inscripcion.aprobada(otroAlumno));

    }


}