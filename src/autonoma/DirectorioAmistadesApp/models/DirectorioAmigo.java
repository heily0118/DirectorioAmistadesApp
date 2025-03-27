/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DirectorioAmistadesApp.models;

import autonoma.DirectorioAmistadesApp.exceptions.AmigoDuplicadoException;
import autonoma.DirectorioAmistadesApp.exceptions.AmigoNoEncontradoException;
import autonoma.DirectorioAmistadesApp.exceptions.CaracteresEspecialesException;
import autonoma.DirectorioAmistadesApp.exceptions.CorreoInvalidoException;
import autonoma.DirectorioAmistadesApp.exceptions.DatosObligatoriosException;
import autonoma.DirectorioAmistadesApp.exceptions.FormatoInvalidoException;
import autonoma.DirectorioAmistadesApp.exceptions.NumeroTelefonoNegativoException;
import autonoma.DirectorioAmistadesApp.exceptions.TelefonoInvalidoException;
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
    
    /**
     * Constructor para crear un objeto vacío
     */
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
    public boolean validarAmigo(String nombre, String telefonoStr, String correoElectronico) throws 
        DatosObligatoriosException, TelefonoInvalidoException, CorreoInvalidoException, NumeroTelefonoNegativoException,
        AmigoDuplicadoException, CaracteresEspecialesException, FormatoInvalidoException {
    
    if (nombre.isEmpty() || telefonoStr.isEmpty() || correoElectronico.isEmpty()) {
        throw new DatosObligatoriosException();
    }
    
    long telefono;
    try {
        telefono = Long.parseLong(telefonoStr);
    } catch (NumberFormatException e) {
        throw new NumeroTelefonoNegativoException();
    }
    
    if (telefono < 0) {
        throw new NumeroTelefonoNegativoException();
    }
    
    if (!telefonoStr.startsWith("606") && !telefonoStr.startsWith("30")) {
        throw new TelefonoInvalidoException();
    }
    
    if (!correoElectronico.contains("@")) {
        throw new CorreoInvalidoException();
    }
    
    boolean tieneLetras = false;
    boolean tieneNumeros = false;
    for (char c : nombre.toCharArray()) {
        if (Character.isLetter(c)) {
            tieneLetras = true;
        } else if (Character.isDigit(c)) {
            tieneNumeros = true;
            throw new FormatoInvalidoException();
        }
    }
    
    for (Amigo a : this.amigos) {
        if (a.getCorreo().equals(correoElectronico)) {
            throw new AmigoDuplicadoException();
        }
    }
    
    String caracteresProhibidos = "!#$%^&*()_=+\\|{};,:/?>";
    for (char c : (nombre + telefonoStr + correoElectronico).toCharArray()) {
        if (caracteresProhibidos.contains(String.valueOf(c))) {
            throw new CaracteresEspecialesException();
        }
    }
    
    return true;
}

    public boolean agregarAmigo(String nombre, long telefono, String correoElectronico) {
    Amigo nuevoAmigo = new Amigo(nombre, telefono, correoElectronico);
    return amigos.add(nuevoAmigo);
}
    
    /**
     * Busca a un amigo por medio de su correo electrónco en la lista.
     * @param correoElectronico El correo electrónico de el amigo que desea buscar.
     * @return Retorna a el amigo si se encontro a la persona por medio de su correo electrónco y retorna null si no se
     * encontró.
     */
    public Amigo buscarAmigo(String correoElectronico) throws AmigoNoEncontradoException{
        for (int i = 0; i < amigos.size(); i++) {
            if (amigos.get(i).getCorreo().equalsIgnoreCase(correoElectronico)) {
                return amigos.get(i); 
            }
        }
      return null;
    }
    
    /**
     * Actualiza a un amigo.
     * @param nombre El nombre del nuevo amigo a actualizar.
     * @param telefono El teléfono del nuevo amigo a actualizar.
     * @param correo El correo de la nuevo amigo a actualizar.
     * @param nuevoAmigo Se crea un objeto de tipo Amigo para almacenar el nuevo amigo.
     * @return Retorna true si se puedo actualizar el amigo y false si no se encuentra el amigo.
     */
    public boolean actualizarAmigo(String nombre, long telefono, String correo, Amigo nuevoAmigo){
        for (int i = 0; i < amigos.size(); i++) {
            Amigo amigo = amigos.get(i);
            if (amigo.getNombre().equals(nombre) && amigo.getTelefono() == telefono && amigo.getCorreo().equals(correo)) {
                amigos.set(i, nuevoAmigo);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Elimina un amigo de la lista según su correo electrónico.
     * @param correoElectronico El correo electónico del amigo a eliminar.
     * @return Retorna true si el amigo fue eliminado y false si no se encontró el amigo en la lista.
     */
    public boolean eliminarAmigo(String correoElectronico) throws AmigoNoEncontradoException {
        for (int i = 0; i < amigos.size(); i++) {
        if (amigos.get(i).getCorreo().equalsIgnoreCase(correoElectronico)) {
            amigos.remove(i);
            return true;
        }
    }
    throw new AmigoNoEncontradoException();

    }
    
    /**
     * Obtiene una copia de la lista de todos los amigos almacenados.
     * @return Retorna una nueva lista que contiene todos los amigos.
     */
   public ArrayList<Amigo> obtenerTodosLosAmigos() {
    return amigos;
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
                            + "--------------------------------------------------------------------------------------------------------------------\n"
                            + "Desarrolladoras: " + nombreDesarrollador + "\n"
                            + "Universidad: " + universidad + "\n"
                            + "Asignatura: " + asignatura + "\n"
                            + "--------------------------------------------------------------------------------------------------------------------";
        return informacion; 
    }
}
