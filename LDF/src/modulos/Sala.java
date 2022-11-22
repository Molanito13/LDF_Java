package modulos;

/**
 * Clase Sala
 *
 * @author Lucía Piñán Barberan Daniel Molano Caraballo Fernando Martín Gay
 * Álvaro Pérez Hernández
 *
 * @version 1.8 24/05/2022
 */
public class Sala {

    private int layout[][];
    private String id_sala;
    private String id_cine;

    
    /**
     * Método que devuelve el layout de la sala
     *
     * @return matriz de la sala
     */
    public int[][] getLayout() {
        return layout;
    }

    /**
     * Método que actualiza el layout de la sala
     *
     * @param layout matriz de la sala
     */
    public void setLayout(int[][] layout) {
        this.layout = layout;
    }

    /**
     * Método que devuelve el id de sala
     *
     * @return id de sala
     */
    public String getId_sala() {
        return id_sala;
    }

    /**
     * Método que actualiza el id de sala
     *
     * @param id_sala id de sala actualizado
     */
    public void setId_sala(String id_sala) {
        this.id_sala = id_sala;
    }

    /**
     * Método que devuelve el id de cine
     *
     * @return id de cine
     */
    public String getId_cine() {
        return id_cine;
    }

    /**
     * Método que actualiza el id de cine
     *
     * @param id_cine id de cine actualizado
     */
    public void setId_cine(String id_cine) {
        this.id_cine = id_cine;
    }

}
