package aulaVirtual;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Representa a un alumno del aula virtual.
 * Un alumno puede estar inscrito en varias asignaturas.
 */
public class Alumno extends Usuario {

    private Map<Asignatura, Integer> notas; //notas con asignaturas

    /**
     *Constructor de la clase alumno con su nombre, email y sus notas de las asignaturas
     * @param nombre nombre del alumno
     * @param email email del alumno
     */

    public Alumno(String nombre, String email) {
        super(nombre, email);
        this.notas = new HashMap<>();
    }

    /**
     *Getter de la copia de notas
     * @return copia de las notas junto con las asignaturas
     */
    public Map<Asignatura, Integer> getNotas() {
        return new HashMap<>(notas);
    }

    /**
     *Metodo que inscribe al alumno a una asignatura asignandole una nota, si no
     * esta inscrito se imprime que el alumno no esta inscrito en dicha asignatura
     * @param asignatura asignatura de la que el alumno se evalua
     * @param nota nota de la asignatura cursada
     */

    protected void asignarNota(Asignatura asignatura, int nota) {
        if (getAsignaturas().contains(asignatura)) {
            notas.put(asignatura, nota);
        } else {
            System.out.println("El alumno no está inscrito en esta asignatura.");
        }
    }

    /**
     *Metodo que muestra las notas cuando el alumno ha sido inscrito en una
     * asignatura
     */
    public void mostrarNotas() {
        System.out.println("Notas del alumno " + nombre + ":");
        for (Map.Entry<Asignatura, Integer> entry : notas.entrySet()) {
            System.out.println(entry.getKey().getNombre() + ": " + entry.getValue());
        }
    }


    /**
     *Metodo para obtener la nota despues de cursar la asignatura
     * @param asignatura asignatura de la que el alumno se ha evaluado
     */
    public int obtenerNota(Asignatura asignatura) {
        return notas.getOrDefault(asignatura, -1);
    }

}