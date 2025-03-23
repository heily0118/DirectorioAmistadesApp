/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DirectorioAmistadesApp.exceptions;

/**
 *
 * @author Heily Yohana Rios Ayala<heilyy.riosa@autonoma.edu.co>
 */
public class NumeroAStringException  extends RuntimeException{

    public NumeroAStringException() {
        super("No se puede convertir un número a un string");
    }
    
    
}
