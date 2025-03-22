/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DirectorioAmistadesApp.exceptions;

/**
 *
 * @author Maria Paz Puerta Acevedo <mariap.puertaa@autonoma.edu.co>
 */
public class DatosObligatoriosException extends RuntimeException{
    
    public DatosObligatoriosException(){
        super("Todos los datos son obligatorios. Ingrese nuevamente el nombre, teléfono y correo.");
    }
}
