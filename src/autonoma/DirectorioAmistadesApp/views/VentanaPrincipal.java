/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.DirectorioAmistadesApp.views;

import autonoma.DirectorioAmistadesApp.models.DirectorioAmigo;
import javax.swing.ImageIcon;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@uatonoma.edu.co>
 * @since 20250319
 * @version 1.0.0
 */
public class VentanaPrincipal extends javax.swing.JFrame {
     private DirectorioAmigo directorio;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal(DirectorioAmigo directorio) {
        initComponents();
        setSize(700, 550);
        setResizable(false);
        this.setLocationRelativeTo(null);
        this.directorio = directorio;
        
        
        try{ 
        this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/DirectorioAmistadesApp/images/directorioAmistad.png")).getImage());
        
        }catch(NullPointerException e){
            System.out.println("Imagen no encontrada");
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
