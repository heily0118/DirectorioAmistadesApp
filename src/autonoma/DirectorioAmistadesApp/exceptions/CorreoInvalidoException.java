/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DirectorioAmistadesApp.exceptions;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@uatonoma.edu.co>
 */
public class CorreoInvalidoException extends RuntimeException{

    public CorreoInvalidoException() {
        super("El correo debe tener un '@'");
    }
    
    
}
