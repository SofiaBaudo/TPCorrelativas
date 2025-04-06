package Materias;

import Alumnos.Alumno;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class MateriaTest {

    @Test
    public void chequearSiPuedeCursar() {
        Alumno unAlumno = new Alumno();
        Materia analisis = new Materia();
        Materia paradigmas = new Materia();
        Materia logica = new Materia();

        analisis.addCorrelativas(logica);
        paradigmas.addCorrelativas(analisis);

        unAlumno.agregarMateriasAprobadas(logica);
        unAlumno.agregarMateriasAprobadas(analisis);

        Assertions.assertTrue(paradigmas.puedeSerCursadaPor(unAlumno));
    }
}
