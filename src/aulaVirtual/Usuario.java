package aulaVirtual;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un usuario genérico en el aula virtual.
 * Puede ser un Alumno o un Profesor.
 * @author Javier Barceló
 * @version 0.1
 */
public class Usuario {
    protected String nombre; //nombre del usuario
    protected String email; // email del usuario
    private List<Asignatura> asignaturas; // lista de asignaturas

    /**
     * Constructor de la clase Usuario
     * El constructor recibe por parámetro el nombre y el email del usuario
     * El constructor también inicializa una lista de asignaturas vacia
     * @param nombre Nombre del Usuario
     * @param email Email del usuario
     */
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.asignaturas = new ArrayList<>();
    }


    /**
     * Getter de lista de asignaturas
     * @return copia de la lista de las asignaturas
     */
    public List<Asignatura> getAsignaturas() {
        return new ArrayList<>(asignaturas);
    }

    /**
     * Metodo para añadir una asignatura a la lista de asignaturas para cursar
     * @param asignatura asignatura
     */
    public void inscribirAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    /**
     * Getter del nombre del usuario
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter del email del usuario
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Metodo para que se inicie sesion en el aula virtual
     * @param password recibe una cadena de caracteres que será la contraseña para entrar
     * @return true
     */
    public boolean iniciarSesión (String password) {
        // simula la consulta a la base de datos de las credenciales del usuario
        int hash = password.hashCode();
        return true;
    }
}