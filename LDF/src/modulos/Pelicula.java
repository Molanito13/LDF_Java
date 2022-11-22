package modulos;

import java.time.LocalDate;

/**
 * Clase Película
 *
 * @author Lucía Piñán Barberan Daniel Molano Caraballo Fernando Martín Gay
 * Álvaro Pérez Hernández
 *
 * @version 1.8 24/05/2022
 */
public class Pelicula {

    private String nombre;
    private String director;
    private String generos;
    private int duracion;
    private int clasificacion;
    private String productora;
    private String descripcion;
    private LocalDate fecha_estreno;

    /**
     * Método que retorna el nombre de la pelicula
     *
     * @return el nombre de la pelicula
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que actualiza el nombre de la pelicula
     *
     * @param nombre el nombre de la pelicula actualizado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que retorna el director de la pelicula
     *
     * @return el director de la pelicula
     */
    public String getDirector() {
        return director;
    }

    /**
     * Método que actualiza el director de la pelicula
     *
     * @param director el director de la pelicula actualizado
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Método que retorna el genero de la pelicula
     *
     * @return el genero de la pelicula
     */
    public String getGeneros() {
        return generos;
    }

    /**
     * Método que actualiza el genero de la pelicula
     *
     * @param generos el genero de la pelicula actualizado
     */
    public void setGeneros(String generos) {
        this.generos = generos;
    }

    /**
     * Método que retorna la duracion de la pelicula
     *
     * @return la duracion de la pelicula
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Método que actualiza la duracion de la pelicula
     *
     * @param duracion la duracion la pelicula actualizado
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Método que retorna la clasificacion de la pelicula
     *
     * @return la clasificacion de la pelicula
     */
    public int getClasificacion() {
        return clasificacion;
    }

    /**
     * Método que actualiza la clasificacion de la pelicula
     *
     * @param clasificacion la clasificacion la pelicula actualizado
     */
    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * Método que retorna la productora de la pelicula
     *
     * @return la productora de la pelicula
     */
    public String getProductora() {
        return productora;
    }

    /**
     * Método que actualiza la productora de la pelicula
     *
     * @param productora la productora la pelicula actualizado
     */
    public void setProductora(String productora) {
        this.productora = productora;
    }

    /**
     * Método que retorna la descripcion de la pelicula
     *
     * @return la descripcion de la pelicula
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método que actualiza la descripcion de la pelicula
     *
     * @param descripcion la descripcion la pelicula actualizado
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método que retorna la fecha de estrono de la pelicula
     *
     * @return la fecha de estrono de la pelicula
     */
    public LocalDate getFecha_estreno() {
        return fecha_estreno;
    }

    /**
     * Método que actualiza la fecha de estrono de la pelicula
     *
     * @param fecha_estreno la fecha de estrono la pelicula actualizado
     */
    public void setFecha_estreno(LocalDate fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

}
