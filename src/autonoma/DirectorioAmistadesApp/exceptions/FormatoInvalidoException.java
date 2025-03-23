/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DirectorioAmistadesApp.exceptions;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 */
public class FormatoInvalidoException extends RuntimeException{

    public FormatoInvalidoException() {
        super("El formato es invalido, ingrese solo letras en el nombre!");
    }
    
    
    
}
