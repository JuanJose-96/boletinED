package aulaVirtual;
import static org.junit.Assert. assertEquals;


import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AlumnoTest {
    private Alumno alumno;
    private Asignatura programacion;
    private Asignatura matematicas;


    @Before
    public void setUp() throws Exception {
        alumno=new Alumno ("juanjo","qwer@gmail.com" );
        programacion= new Asignatura("programacion");
        alumno.inscribirAsignatura(matematicas);
        alumno.inscribirAsignatura(programacion);
        programacion.agreagarAlumno(alumno);
        alumno.asignarNota(programacion,8);

    }

    @Test
    public void obtenerNota() {
        double nota=alumno.obtenerNota(programacion);
        assertEquals(8.0,nota,0.1);


    }
    @Test
    public void obtenerNotaAsigNoCursada(){
        double nota2=alumno.obtenerNota(matematicas);
        assertEquals(8.0,nota2,0.1);
    }
}