/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DirectorioAmistadesApp.models;

import java.util.ArrayList;

/**
 *
 * @author Maria Paz Puerta Acevedo <mariap.puertaa@autonoma.edu.co>
 * @since 20250319
 * @version 1.0.0
 */
public class DirectorioAmigo {
    /// Atributos
    /**
     * Lista para almacenar un amigo y su información
     */
    private  ArrayList<Amigo> amigos;
    
    public DirectorioAmigo() {
       this.amigos = new ArrayList<>();
    }
    
    /**
     * Obtiene la lista de amigos almacenada en la clase DirectorioAmigo
     * @return Retorna una lista de tipo Amigo donde se almacenan amigos.
     */
    public ArrayList<Amigo> getAmigos() {
        return amigos;
    }
    
    /**
     * Establece la lista de amigos en el DirectorioAmigo.
     * @param amigos Lista de objetos tipo Amigo que reemplazará la lista actual.
     */
    public void setAmigos(ArrayList<Amigo> amigos) {
        this.amigos = amigos;
    }
    
    /**
     * Agrega un nuevo amigo al directorio si su nombre no está registrado previamente.
     * @param nombre El nombre de el amigo a agregar.
     * @param telefono El teléfono de el amigo a agregar.
     * @param correoElectronico El correo electrónico de el amigo a agregar.
     * @return Retorna true si el amigo no existe en la lista y retorna false si ya existe un mismo nombre.
     */
    public boolean agregarAmigo(String nombre, long telefono, String correoElectronico, Amigo amigo){
        for (int i = 0; i < amigos.size(); i++) {
            if (amigos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return false;
            }
        }
        Amigo nuevoAmigo = new Amigo(nombre, telefono, correoElectronico);
        amigos.add(nuevoAmigo);
        return true;
    }
    
    /**
     * Busca a un amigo por medio de su correo electrónco en la lista.
     * @param correoElectronico El correo electrónico de el amigo que desea buscar.
     * @return Retorna a el amigo si se encontro a la persona por medio de su correo electrónco y retorna null si no se
     * encontró.
     */
    public Amigo buscarAmigo(String correoElectronico){
        for (int i = 0; i < amigos.size(); i++) {
            if (amigos.get(i).getCorreo().equalsIgnoreCase(correoElectronico)) {
                return amigos.get(i); 
            }
        }
        return null; 
    }
    
    /**
     * Proporciona información sobre la aplicación, incluyendo los nombres de los desarrolladores,
     * la universidad y la asignatura en la que se desarrolló.
     * @return Retorna una cadena de texto con la información sobre la aplicación.
     */
    public String mostrarInformacionAplicacion() {
        String nombreDesarrollador = "María Paz Puerta y Heily Yohana Rios";
        String universidad = "Universidad Autónoma de Manizales";
        String asignatura = "Programación Orientada a Objetos";

        String informacion = "Acerca de esta aplicación:\n"
                            + "---------------------------\n"
                            + "Desarrolladoras: " + nombreDesarrollador + "\n"
                            + "Universidad: " + universidad + "\n"
                            + "Asignatura: " + asignatura + "\n"
                            + "---------------------------";
        return informacion; 
    }
}
