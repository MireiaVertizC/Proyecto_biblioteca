package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a un usuario de la biblioteca.
 * <p>
 * Cada usuario se identifica por su <code>dni</code> y mantiene una lista
 * de los {@link Libro} que tiene prestados.
 * </p>
 *
 * @author Tu Nombre
 * @version 1.0
 */
public class Usuario {

    /** Nombre completo del usuario. */
    private String nombre;

    /** DNI del usuario. */
    private String dni;

    /** Libros que el usuario tiene actualmente prestados. */
    private List<Libro> librosPrestados;

    /**
     * Crea un usuario sin libros prestados.
     *
     * @param nombre nombre completo del usuario
     * @param dni    DNI del usuario
     */
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.librosPrestados = new ArrayList<>();
    }

    /**
     * Devuelve el nombre del usuario.
     *
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el DNI del usuario.
     *
     * @return el DNI
     */
    public String getDni() {
        return dni;
    }

    /**
     * Devuelve la lista de libros prestados.
     *
     * @return lista de libros que el usuario tiene en préstamo
     */
    public List<Libro> getLibrosPrestados() {
    }
}
