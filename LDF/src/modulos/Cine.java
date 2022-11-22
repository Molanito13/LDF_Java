package modulos;

import java.util.Vector;

/**
 * Clase Cine
 *
 * @author Lucía Piñán Barberan 
 *         Daniel Molano Caraballo 
 *         Fernando Martín Gay 
 *         Álvaro Pérez Hernández
 *
 * @version 1.8 24/05/2022
 */
public class Cine {
    
    private String nombre;
    private String direccion;
    private String id;
    private Vector<Entrada> entradas;
    private Vector<Sala> salas;
    private Cartelera cartelera;

    /**
     * Método que devuelve el nombre del cine
     * 
     * @return El nombre del cine
     */
    public String getNombre() {
        return nombre;
    }

    
    /**
     * Método que actualiza el nombre del cine
     * 
     * @param nombre El nombre del cine
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve la dirección del cine
     * 
     * @return La dirección del cine
     */
    public String getDireccion() {
        return direccion;
    }

    
    /**
     * Método que actualiza la dirección del cine
     * 
     * @param direccion La dirección del cine
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método que devuelve el ID del cine
     * 
     * @return EL ID del cine
     */
    public String getId() {
        return id;
    }

    
    /**
     * Método que actualiza el ID del cine
     * 
     * @param id EL ID del cine
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Método que devuelve las entradas del cine
     * 
     * @return Las entradas del cine
     */
    public Vector<Entrada> getEntradas() {
        return entradas;
    }

    /**
     * Método que actualiza las entradas del cine
     * 
     * @param entradas Las entradas del cine
     */
    public void setEntradas(Vector<Entrada> entradas) {
        this.entradas = entradas;
    }

    /**
     * Método que devuelve las salas del cine
     * 
     * @return Las salas del cine
     */
    public Vector<Sala> getSalas() {
        return salas;
    }

    /**
     * Método que actualiza las salas del cine
     * 
     * @param salas Las salas del cine
     */
    public void setSalas(Vector<Sala> salas) {
        this.salas = salas;
    }

    /**
     * Método que devuelve la cartelera del cine
     * 
     * @return La cartelera del cine
     */
    public Cartelera getCartelera() {
        return cartelera;
    }

    /**
     * Método que actualiza la cartelera del cine
     * 
     * @param cartelera La cartelera del cine
     */
    public void setCartelera(Cartelera cartelera) {
        this.cartelera = cartelera;
    }
    
    
}
