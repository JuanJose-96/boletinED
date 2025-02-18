package aulaVirtual;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProfesorTest {
    private Profesor profesor;
    private Alumno alumno;
    private Asignatura programacion;
    private Asignatura matematicas;

    @Before
    public void setUp() throws Exception {
        profesor=new Profesor("pepe","dfgh@gmail.com");
        alumno=new Alumno("juanjo","cvbn@gmail.com");
        programacion=new Asignatura("programacion");
        matematicas=new Asignatura("matematicas");
        profesor.inscribirAsignatura(programacion);
        alumno.inscribirAsignatura(programacion);
        alumno.inscribirAsignatura(matematicas);

    }

    @Test
    public void calificarAlumno() {
        boolean calif = profesor.calificarAlumno(alumno,programacion,9);
        assertTrue(calif);
    }
    @Test
    public void calificarAlumnoNoImparte() {
        boolean calif = profesor.calificarAlumno(alumno,matematicas,9);
        assertTrue(calif);
    }
}