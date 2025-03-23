/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DirectorioAmistadesApp.models;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@uatonoma.edu.co>
 * @since 20250319
 * @version 1.0.0
 */
public class Amigo {
    private String nombre;
    private long telefono;
    private String correo;

    
    /**
     * Constructor para crear un objeto Amigo
     * 
     * @param nombre   Nombre del amigo
     * @param telefono Número de teléfono del amigo
     * @param correo   Correo electrónico del amigo
     */
    public Amigo(String nombre, long telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

     /**
     * Obtiene el nombre del amigo.
     * 
     * @return El nombre del amigo.
     */
    public String getNombre() {
        return nombre;
    }
     /**
     * Establece el nombre del amigo.
     * 
     * @param nombre Nuevo nombre del amigo.
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     /**
     * Obtiene el número de teléfono del amigo.
     * 
     * @return El número de teléfono del amigo.
     */

    public long getTelefono() {
        return telefono;
    }
    /**
     * Establece el número de teléfono del amigo.
     * 
     * @param telefono Nuevo número de teléfono del amigo.
     */

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
     /**
     * Obtiene el correo electrónico del amigo.
     * 
     * @return El correo electrónico del amigo.
     */
    public String getCorreo() {
        return correo;
    }
    /**
     * Establece el correo electrónico del amigo.
     * 
     * @param correo Nuevo correo electrónico del amigo.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
