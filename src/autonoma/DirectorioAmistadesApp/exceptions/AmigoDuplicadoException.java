/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DirectorioAmistadesApp.exceptions;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 */
public class AmigoDuplicadoException extends Exception{

    public AmigoDuplicadoException() {
        super("Ya existe un amigo con ese correo, lo que significa que el correo ya fue registrado");
    }
    
    
}
