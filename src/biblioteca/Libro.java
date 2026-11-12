package biblioteca;

/**
 * Representa un libro del catálogo de la biblioteca.
 * <p>
 * Cada libro se identifica por su <code>isbn</code> y puede estar
 * disponible o prestado. Para gestionar su estado se usan los métodos
 * {@link #prestar()} y {@link #devolver()}.
 * </p>
 *
 * @author Tu Nombre
 * @version 1.0
 */
public class Libro {

    /** Título del libro. */
    private String titulo;

    /** Autor del libro. */
    private String autor;

    /** Código ISBN que identifica al libro. */
    private String isbn;

    /** Indica si el libro está disponible para préstamo. */
    private boolean disponible;

    /**
     * Crea un libro nuevo, que empieza estando disponible.
     *
     * @param titulo título del libro
     * @param autor  autor del libro
     * @param isbn   código ISBN del libro
     */
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    /**
     * Devuelve el título del libro.
     *
     * @return el título
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devuelve el autor del libro.
     *
     * @return el autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Devuelve el ISBN del libro.
     *
     * @return el ISBN
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Indica si el libro está disponible.
     *
     * @return <code>true</code> si se puede prestar, <code>false</code> si no
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * Marca el libro como prestado.
     *
     * @throws IllegalStateException si el libro ya estaba prestado
     */
    public void prestar() {
        if (!disponible) {
            throw new IllegalStateException("El libro ya está prestado: " + titulo);
        }
        disponible = false;
    }

    /**
     * Marca el libro como disponible de nuevo.
     */
    public void devolver() {
        disponible = true;
    }
}

