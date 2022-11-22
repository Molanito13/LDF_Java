package modulos;

import java.time.LocalDate;

/**
 * Clase Entrada
 *
 * @author Lucía Piñán Barberan 
 *         Daniel Molano Caraballo 
 *         Fernando Martín Gay 
 *         Álvaro Pérez Hernández
 *
 * @version 1.8 24/05/2022
 */
public class Entrada {
    
   private String nick;
   private String id_cine;
   private int id_sala;
   private String nombre;
   private int fila ;
   private int butaca;
   private LocalDate fecha_hora;
   private double precio;

   
   /**
     * Método constructor de la clase Entrada
     * 
     * @param nombre Nombre de la película
     * @param id_cine Identificador del cine
     * @param id_sala Identificador de la sala
     * @param fecha_hora Día de la sesión
     * @param fila fila de la butaca
     * @param butaca butaca de la fila
     */
    public Entrada(String id_cine, int id_sala, String nombre, int fila, int butaca, LocalDate fecha_hora) {
        this.id_cine = id_cine;
        this.id_sala = id_sala;
        this.nombre = nombre;
        this.fila = fila;
        this.butaca = butaca;
        this.fecha_hora = fecha_hora;
    }

   

    /**
     * Método que retorna el nick del usuario
     *
     * @return el nick del usuario
     */
    public String getNick() {
        return nick;
    }

    /**
     * Método que actualiza el nick del usuario
     *
     * @param nick el nick del usuario
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * Método que retorna el ID del cine
     *
     * @return el ID del cine
     */
    public String getId_cine() {
        return id_cine;
    }

    /**
     * Método que actualiza el ID del cine
     *
     * @param id_cine el id del cine
     */
    public void setId_cine(String id_cine) {
        this.id_cine = id_cine;
    }

    /**
     * Método que retorna el ID de la sala del cine 
     *
     * @return el ID de la sala del cine 
     */
    public int getId_sala() {
        return id_sala;
    }

    /**
     * Método que actualiza el ID de la sala
     *
     * @param id_sala el id de la sala
     */
    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }

    /**
     * Método que retorna el nombre de la película
     *
     * @return el nombre de la pelicula
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que actualiza el nombre de la película
     *
     * @param nombre el nombre de la película
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que retorna la fila
     *
     * @return la fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * Método que actualiza la fila
     *
     * @param fila la fila
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * Método que retorna la butaca
     *
     * @return la butaca
     */
    public int getButaca() {
        return butaca;
    }

    /**
     * Método que actualiza la butaca
     *
     * @param butaca la butaca
     */
    public void setButaca(int butaca) {
        this.butaca = butaca;
    }

    /**
     * Método que retorna la sesión
     *
     * @return la sesión
     */
    public LocalDate getFecha_hora() {
        return fecha_hora;
    }

    /**
     * Método que actualiza la sesión
     *
     * @param fecha_hora la sesion
     */
    public void setFecha_hora(LocalDate fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    /**
     * Método que retorna el precio de la entrada
     *
     * @return el precio de la entrada
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método que actualiza el precio de la entrada
     *
     * @param precio el precio de la entrada
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
   
}
