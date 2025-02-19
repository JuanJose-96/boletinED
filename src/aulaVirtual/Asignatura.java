package aulaVirtual;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una asignatura en el aula virtual.
 * Una asignatura tiene un nombre y un profesor encargado.
 */
public class Asignatura {
    private String nombre; // Nombre de la asignatura
    private Profesor profesor; // Profesor encargado de impartir la asignatura
    private List<Alumno> alumnos; // Lista de alumnos que cursan la asignatura

    /**
     * Constructor de la clase Asignatura. La asignatura tiene un nombre y una
     * lista de alumnos que la van a cursar y un profesor que la imparte
     * @param nombre nombre de la asignatura
     */
    public Asignatura(String nombre) {
        this.nombre = nombre; // Nombre de la asignatura
        this.profesor = null; // Nota para Javier --> ¿No debería ser igual a la copia de Profesor y recibir por parametro a un profesor?
        this.alumnos = new ArrayList<>(); //Lista de alumnos que cursan la asignatura
    }

    /**
     * Getter de nombre de la asignatura
     * @return nombre  de la asignatura
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter del profesor que imparte la asignatura
     * @return profesor  de la asignatura
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Metodo que agrega a un alumno a una lista de alumnos
     * que cursaran una asignatura posteriormente
     * @param alumno alumno que será añadido a la lista
     */
    public void agreagarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    /**
     * Metodo que elimina a un alumno de una lista de alumnos para que dejen
     * de cursar una asignatura
     * @param alumno alumno que será eliminado de la lista
     */
    public void eliminarAlumno(Alumno alumno) {
        for (Alumno a : this.alumnos) {
            if (a.getNombre().equals(alumno.nombre)) alumnos.remove(a);
        }
    }

    /**
     * Metodo que muestra los datos (nombre y email)
     * de la lista de alumnos que van a cursar la asignatura
     * @return lista de alumnos
     */
    public List<Alumno> getDatosAlumnos() {

        for (Alumno datosAlumnos : alumnos) {
            System.out.println("Nombre: "+datosAlumnos.getNombre()+ "\n"+
                    "Email: " + datosAlumnos.getEmail());
        }
        return alumnos;
    }
}
