/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.DirectorioAmistadesApp.main;
import autonoma.DirectorioAmistadesApp.models.DirectorioAmigo;
import autonoma.DirectorioAmistadesApp.views.VentanaPrincipal;
/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@uatonoma.edu.co>
 * @since 20250319
 * @version 1.0.0
 */
public class DirectorioAmistadesApp {

    public static void main(String[] args) {
        
        
        DirectorioAmigo directorioAmigo = new DirectorioAmigo();
        
        VentanaPrincipal ventana = new VentanaPrincipal(directorioAmigo);
        ventana.setVisible(true);
        
    
    }
    
}
