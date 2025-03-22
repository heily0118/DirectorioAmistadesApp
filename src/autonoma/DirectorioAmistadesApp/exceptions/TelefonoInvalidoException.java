/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DirectorioAmistadesApp.exceptions;

/**
 *
 * @author Maria Paz Puerta Acevedo <mariap.puertaa@autonoma.edu.co>
 */
public class TelefonoInvalidoException extends RuntimeException{
    
    public TelefonoInvalidoException(){
        super("El teléfono ingresado no es válido. Debe iniciar con 606 o 30.");
    }
}
