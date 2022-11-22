package modulos;

import Estilos.Colorinchis;
import java.sql.Time;
import java.time.LocalDate;

/**
 * Clase Cartelera
 *
 * @author Lucía Piñán Barberan 
 *         Daniel Molano Caraballo 
 *         Fernando Martín Gay 
 *         Álvaro Pérez Hernández
 *
 * @version 1.8 24/05/2022
 */
public class Cartelera {

    private String nombre;
    private String id_cine;
    private int id_sala;
    private LocalDate fecha_hora;
    private Time hora;
    private int duracion;
    private String tipo;

    /**
     * Método constructor de la clase Cartelera
     * 
     * @param nombre Nombre de la película
     * @param id_cine Identificador del cine
     * @param id_sala Identificador de la sala
     * @param fecha_hora Día de la sesión
     * @param hora Hora de la sesión
     * @param duracion Duración de la película
     * @param tipo Tipo de sesión
     */
    public Cartelera(String nombre, String id_cine, int id_sala, LocalDate fecha_hora, Time hora, int duracion, String tipo) {
        this.nombre = nombre;
        this.id_cine = id_cine;
        this.id_sala = id_sala;
        this.fecha_hora = fecha_hora;
        this.hora = hora;
        this.duracion = duracion;
        this.tipo = tipo;
    }

    /**
     * Método constructor de la clase Cartelera
     * 
     * @param nombre Nombre de la película
     * @param id_cine Identificador del cine
     * @param id_sala Identificador de la sala
     * @param fecha_hora Día de la sesión
     * @param duracion Duración de la película
     * @param tipo Tipo de sesión
     */
    public Cartelera(String nombre, String id_cine, int id_sala, LocalDate fecha_hora, int duracion, String tipo) {
        this.nombre = nombre;
        this.id_cine = id_cine;
        this.id_sala = id_sala;
        this.fecha_hora = fecha_hora;
        this.duracion = duracion;
        this.tipo = tipo;
    }

    /**
     * Método que devuelve la fecha de la sesion
     * 
     * @return La fecha de la sesion
     */
    public LocalDate getFecha_hora() {
        return fecha_hora;
    }

    /**
     * Método que actualiza la fecha de la sesion
     * 
     * @param fecha_hora fecha de la sesion
     */
    public void setFecha_hora(LocalDate fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    /**
     * Método que devuelve el nombre de la película
     * 
     * @return El nombre de la película
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que actualiza el nombre de la película
     * 
     * @param nombre nombre de la película
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el ID del cine
     * 
     * @return El ID del cine
     */
    public String getId_cine() {
        return id_cine;
    }

    /**
     * Método que actualiza el ID del cine
     * 
     * @param id_cine ID del cine
     */
    public void setId_cine(String id_cine) {
        this.id_cine = id_cine;
    }

    /**
     * Método que devuelve el ID de la sala
     * 
     * @return El ID de la sala
     */
    public int getId_sala() {
        return id_sala;
    }

    /**
     * Método que actualiza el ID de la sala
     * 
     * @param id_sala ID de la sala
     */
    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }

    /**
     * Método que devuelve el tipo de la película
     * 
     * @return El tipo de la película
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Método que actualiza el tipo de la película
     * 
     * @param tipo tipo de la película
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Método que devuelve la duración de la película
     * @return La duración de la película
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Método que actualiza la duración de la película
     * @param duracion duracion de la película
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Método que imprime el objeto Cartelera
     * 
     * @return La información del objeto
     */
    @Override
    public String toString() {
        return Colorinchis.purple("NOMBRE: ") + nombre + Colorinchis.purple("      ID_CINE: ") + id_cine + Colorinchis.purple("        SALA: ") + id_sala + Colorinchis.purple("       SESIÓN: ") + fecha_hora + "-" + hora + Colorinchis.purple("      DURACION: ") + duracion + Colorinchis.purple("      VERSIÓN: ") + tipo + "\n";
    }

}
