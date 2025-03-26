/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.DirectorioAmistadesApp.views;
import autonoma.DirectorioAmistadesApp.exceptions.AmigoDuplicadoException;
import autonoma.DirectorioAmistadesApp.exceptions.CaracteresEspecialesException;
import autonoma.DirectorioAmistadesApp.exceptions.CorreoInvalidoException;
import autonoma.DirectorioAmistadesApp.exceptions.DatosObligatoriosException;
import autonoma.DirectorioAmistadesApp.exceptions.FormatoInvalidoException;
import autonoma.DirectorioAmistadesApp.exceptions.FormatoNumeroInvalidoException;
import autonoma.DirectorioAmistadesApp.exceptions.NumeroTelefonoNegativoException;
import autonoma.DirectorioAmistadesApp.exceptions.TelefonoInvalidoException;
import autonoma.DirectorioAmistadesApp.models.Amigo;
import autonoma.DirectorioAmistadesApp.models.DirectorioAmigo;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Maria Paz Puerta
 */
public class ActualizarAmigo extends javax.swing.JDialog {
    private DirectorioAmigo directorio;
    private Amigo amigo;
    private ArrayList<Amigo> amigos;
    private VentanaPrincipal ventana;
    /**
     * Creates new form ActualizarAmigo
     */
    public ActualizarAmigo(java.awt.Frame parent, boolean modal, DirectorioAmigo directorio, VentanaPrincipal ventana, Amigo amigo) {
        super(parent, modal);
        initComponents();
        setSize(650, 500);
        setResizable(false);
        this.setLocationRelativeTo(null);
        this.directorio = directorio;
        this.amigo = amigo;
        
        try { 
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNuevoNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNuevoTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNuevoCorreoElectronico = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Ingrese el nuevo nombre:");

        txtNuevoNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNuevoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoNombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese el nuevo teléfono:");

        txtNuevoTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNuevoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoTelefonoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Ingrese el nuevo correo electrónico: ");

        txtNuevoCorreoElectronico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNuevoCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoCorreoElectronicoActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(0, 153, 102));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar ");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNuevoTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(txtNuevoNombre)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnCancelar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnActualizar)
                                .addGap(85, 85, 85))
                            .addComponent(txtNuevoCorreoElectronico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNuevoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNuevoCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualizar Amigo");

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/DirectorioAmistadesApp/images/salir.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNuevoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoNombreActionPerformed

    private void txtNuevoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoTelefonoActionPerformed

    private void txtNuevoCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoCorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoCorreoElectronicoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String nuevoNombre = this.txtNuevoNombre.getText();
        String nuevoTelefono = txtNuevoTelefono.getText().trim();
        String nuevoCorreoElectronico = this.txtNuevoCorreoElectronico.getText();

        try {
            if (nuevoNombre.isEmpty() || nuevoTelefono.isEmpty() || nuevoCorreoElectronico.isEmpty()) {
                throw new DatosObligatoriosException();
            }
            long telefono = Long.parseLong(nuevoTelefono);
            if (telefono < 0){
                throw new NumeroTelefonoNegativoException();
            }
            if (!nuevoTelefono.startsWith("606") && !nuevoTelefono.startsWith("30")) {
                throw new TelefonoInvalidoException();
            }
            if (!nuevoCorreoElectronico.contains("@")){
                throw new CorreoInvalidoException();
            }

            boolean tieneLetras = false;
            boolean tieneNumeros = false;
            for (int i = 0; i < nuevoNombre.length(); i++) {
                char c = nuevoNombre.charAt(i);
                if (Character.isLetter(c)) {
                    tieneLetras = true;
                } else if (Character.isDigit(c)) {
                    tieneNumeros = true;
                    throw new FormatoInvalidoException();
                }
            }

            for (int i = 0; i < directorio.getAmigos().size(); i++) {
                if (directorio.getAmigos().get(i).getCorreo().equals(nuevoCorreoElectronico)) {
                    throw new AmigoDuplicadoException();
                }
            }

            String caracteresProhibidos = "!#$%^&*()_=+\\|{};,:/?>";
            for (int i = 0; i < nuevoNombre.length(); i++) {
                char c = nuevoNombre.charAt(i);
                if (caracteresProhibidos.contains(String.valueOf(c))) {
                    throw new CaracteresEspecialesException();
                }
            }

            for (int i = 0; i < nuevoTelefono.length(); i++) {
                char c = nuevoTelefono.charAt(i);
                if (caracteresProhibidos.contains(String.valueOf(c))) {
                    throw new CaracteresEspecialesException();
                }
            }

            for (int i = 0; i < nuevoCorreoElectronico.length(); i++) {
                char c = nuevoCorreoElectronico.charAt(i);
                if (caracteresProhibidos.contains(String.valueOf(c))) {
                    throw new CaracteresEspecialesException();
                }
            }

            Amigo amigo = new Amigo(nuevoNombre, telefono, nuevoCorreoElectronico);

            if (this.directorio.agregarAmigo(nuevoNombre, telefono, nuevoCorreoElectronico, amigo)) {
                JOptionPane.showMessageDialog(this, "El amigo " + nuevoNombre + " ha sido agregado exitosamente");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Ha ocurrido un error, no se ha podido agregar un amigo");
                this.dispose();
            }
        } catch (FormatoNumeroInvalidoException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (DatosObligatoriosException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (TelefonoInvalidoException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (CorreoInvalidoException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (NumeroTelefonoNegativoException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (AmigoDuplicadoException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (CaracteresEspecialesException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (FormatoInvalidoException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        long telefono = Long.parseLong(nuevoTelefono);
        amigo.setNombre(nuevoNombre);
        amigo.setTelefono(telefono);
        amigo.setCorreo(nuevoCorreoElectronico);

        JOptionPane.showMessageDialog(this, "El amigo " + nuevoNombre + " ha sido actualizado exitosamente");

        actualizarTabla();

        this.dispose();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JToggleButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNuevoCorreoElectronico;
    private javax.swing.JTextField txtNuevoNombre;
    private javax.swing.JTextField txtNuevoTelefono;
    // End of variables declaration//GEN-END:variables

}
