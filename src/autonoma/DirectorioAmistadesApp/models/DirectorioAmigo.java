/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DirectorioAmistadesApp.models;

import java.util.ArrayList;

/**
 *
 * @author Maria Paz Puerta
 */
public class DirectorioAmigo {
    private  ArrayList<Amigo> amigos;

    public DirectorioAmigo(ArrayList<Amigo> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Amigo> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Amigo> amigos) {
        this.amigos = amigos;
    }
    
    
    public boolean agregarAmigo(String nombre, long telefono, String correoElectronico){
        for (int i = 0; i < amigos.size(); i++) {
            if (amigos.get(i).getCorreoElectronico().equalsIgnoreCase(correoElectronico)) {
                return false;
            }
        }
        Amigo nuevoAmigo = new Amigo(nombre, telefono, correoElectronico);
        amigos.add(nuevoAmigo);
        return true;
    }
    
    public Amigo buscarAmigo(String correoElectronico){
        for (int i = 0; i < amigos.size(); i++) {
            if (amigos.get(i).getCorreoElectronico().equalsIgnoreCase(correoElectronico)) {
                return amigos.get(i); 
            }
        }
        return null; 
    }
    
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
