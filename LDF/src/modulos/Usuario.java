package modulos;

import Estilos.Colorinchis;
import java.time.LocalDate;

/**
 * Clase usuario
 *
 * @author Lucía Piñán Barberan 
 *         Daniel Molano Caraballo 
 *         Fernando Martín Gay 
 *         Álvaro Pérez Hernández
 *
 * @version 1.8 24/05/2022
 */
public class Usuario {
    
    private String nombre;
    private String apellidos;
    private String nick;
    private LocalDate fecha_nac;
    private String correo;
    private String contraseña;
    private boolean premium;

    /**
     * Método constructor de la clase Usuario
     * 
     * @param nombre Nombre del usuario
     * @param apellidos Apellidos del usuario
     * @param nick Nick del usuario
     * @param fecha_nac Fecha de nacimiento del usuario
     * @param correo Correo del usuario
     * @param contraseña Contraseña del usuario
     */
    public Usuario(String nombre, String apellidos, String nick, LocalDate fecha_nac, String correo, String contraseña) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nick = nick;
        this.fecha_nac = fecha_nac;
        this.correo = correo;
        this.contraseña = contraseña;
        this.premium = false;
    }

    /**
     * Método que retorna el nombre del usuario
     *
     * @return el nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que actualiza el nombre del usuario
     *
     * @param nombre el nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que retorna los apellidos del usuario
     *
     * @return los apellidos del usuario
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Método que actualiza los apellidos del usuario
     *
     * @param apellidos los apellidos del usuario
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Método que retorna el nick del usuario
     *
     * @return el nombre del usuario
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
     * Método que retorna la fecha de nacimiento del usuario
     *
     * @return la fecha de nacimiento del usuario
     */
    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    /**
     * Método que actualiza la fecha de nacimiento del usuario
     *
     * @param fecha_nac la fecha de nacimiento del usuario
     */
    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    /**
     * Método que retorna el correo del usuario
     *
     * @return el correo del usuario
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Método que actualiza el correo del usuario
     *
     * @param correo el correo del usuario
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Método que retorna la contraseña del usuario
     *
     * @return el nombre del usuario
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Método que actualiza la contraseña del usuario
     *
     * @param contraseña la contraseña del usuario
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Método que retorna el estado del usuario
     *
     * @return el estado del usuario
     */
    public boolean isPremium() {
        return premium;
    }

    /**
     * Método que actualiza el estado del usuario
     *
     * @param premium el estado del usuario
     */
    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    /**
     * Método que imprime el objeto Usuario
     * 
     * @return La información del objeto
     */
    @Override
    public String toString() {
        return "¿Son los datos correctos?" +"\n"+ Colorinchis.purple("\nNombre:    ") + nombre + Colorinchis.purple("\nApellidos:  ") + apellidos + Colorinchis.purple("\nNick:    ") + nick + Colorinchis.purple("\nFecha de nacimiento:  ") + fecha_nac + 
                Colorinchis.purple("\nCorreo:  ") + correo + "\n";
    }
    
    
}
