/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DirectorioAmistadesApp.exceptions;

/**
 *
 * @author Heily Yohana Rios Ayala < heilyy.riosa@autonoma.edu.co>
 */
public class FormatoNumeroInvalidoException extends RuntimeException{

    public FormatoNumeroInvalidoException() {
        super("Número de teléfono inválido. Por favor, ingrese solo números.");
    }
    
    
}
