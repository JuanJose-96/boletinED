package aulaVirtual;

/**
 * Representa a un profesor del aula virtual.
 * Un profesor puede impartir varias asignaturas.
 */

public class Profesor extends Usuario {
    /**
     * Constructor de la clase profesor
     * @param nombre nombre del profesor
     * @param email email del profesor
     */
    public Profesor(String nombre, String email) {
        super(nombre, email); // Llamada al constructor padre de la clase usuario
    }


    /**
     * Metodo del profesor para calificar a un alumno que cursa una asignatura y
     * la nota de dicha asignatura. Si el profesor no imparte la asignatura se imprimirá
     * que el profesor no imparte la asignatura
     * @param alumno alumno al que se va a calificar
     * @param asignatura asignatura que el alumno cursó
     * @param nota nota que sacó el alumno en dicha asignatura
     * @return true si imparte la asignatura
     * @return false no imparte la asignatura
     */
    public boolean calificarAlumno(Alumno alumno, Asignatura asignatura, int nota) {
        if (getAsignaturas().contains(asignatura)) {
            alumno.asignarNota(asignatura, nota);
            System.out.println("Nota asignada a " + alumno.getNombre() + " en " + asignatura.getNombre() + ": " + nota);
            return true;
        } else {
            System.out.println("El profesor no imparte esta asignatura.");
            return false;
        }
    }
}
