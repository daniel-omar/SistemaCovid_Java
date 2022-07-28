/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Incorporacion;
import Data.IncorporacionDAO;
import Data.PersonaDAO;
import Modelo.Persona;
import Modelo.TipoPersona;
import Util.Redimensionar;
import static Vista.Principal.dsPrincipal;
import javax.swing.JOptionPane;

public class FMantenedorIncorporacion extends javax.swing.JInternalFrame {

    Incorporacion incorporacion = new Incorporacion();
    IncorporacionDAO incorporacionDAO = new IncorporacionDAO();
    Persona persona = new Persona();
    PersonaDAO personaDAO = new PersonaDAO();

    public static Persona empleado;

    public FMantenedorIncorporacion() {
        initComponents();

        OcultarPorTipo(false);
        btnEstadoFicha.setText("Pendiente");
    }

    public FMantenedorIncorporacion(int idIncorporacion) {
        initComponents();

        obtenerIncorporacion(idIncorporacion);
        OcultarPorTipo(true);
        obtenerPersona(incorporacion.getIdPersonaRegistro());
    }

    private void obtenerIncorporacion(int idIncorporacion) {
        incorporacion = incorporacionDAO.obtenerIncorporacion(idIncorporacion);
        btnEstadoFicha.setText("Completada");
    }

    private void obtenerPersona(int idPersona) {
        persona = personaDAO.obtenerPersona(idPersona);
        lblInfo.setText(persona.getNombres() + " " + persona.getApellidoPaterno() + " " + persona.getApellidoMaterno());
    }

    void OcultarPorTipo(boolean esVisible) {

        btnVer.setVisible(esVisible);
        lblAccion.setVisible(esVisible);
        btnIncorporar.setVisible(esVisible);
        btnNoIncorporar.setVisible(esVisible);

        if (incorporacion.getoEstadoIncorporacion().getNombre().equalsIgnoreCase("pendiente")) {
            btnIncorporar.setEnabled(true);
            btnNoIncorporar.setEnabled(true);
        } else {
            btnIncorporar.setEnabled(false);
            btnNoIncorporar.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInfo = new javax.swing.JLabel();
        lblProceso = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAccion = new javax.swing.JLabel();
        btnIncorporar = new javax.swing.JButton();
        btnNoIncorporar = new javax.swing.JButton();
        btnEstadoFicha = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();

        setClosable(true);

        lblInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblInfo.setText("Persona");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("<html><p><u>Ficha</u></p></html>");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Ficha Sintomatología");

        lblAccion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblAccion.setText("<html><p><u>Acciones</u></p></html>");

        btnIncorporar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIncorporar.setText("Incorporar");
        btnIncorporar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncorporarActionPerformed(evt);
            }
        });

        btnNoIncorporar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNoIncorporar.setText("No incorporar");
        btnNoIncorporar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoIncorporarActionPerformed(evt);
            }
        });

        btnEstadoFicha.setBackground(new java.awt.Color(153, 255, 153));
        btnEstadoFicha.setText("Estado");

        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lblProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblInfo)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnEstadoFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnIncorporar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNoIncorporar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnEstadoFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnIncorporar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNoIncorporar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncorporarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncorporarActionPerformed
        try {

            boolean resp = incorporacionDAO.actualizarEstadoIncorporacion(incorporacion.getIdIncorporacion(), 2, 0);

            if (resp) {
                JOptionPane.showMessageDialog(null, "Incorporación registrada", "Info", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIncorporarActionPerformed

    private void btnNoIncorporarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoIncorporarActionPerformed
        try {

            boolean resp = incorporacionDAO.actualizarEstadoIncorporacion(incorporacion.getIdIncorporacion(), 3, 0);

            if (resp) {
                JOptionPane.showMessageDialog(null, "No Incorporación registrada", "Info", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNoIncorporarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        FFichaSintomatologia fFichaSintomatologia = new FFichaSintomatologia(incorporacion.getIdIncorporacion());
        Principal.dsPrincipal.add(fFichaSintomatologia);
        Redimensionar.redimensionar(dsPrincipal, fFichaSintomatologia);
        fFichaSintomatologia.show();
    }//GEN-LAST:event_btnVerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadoFicha;
    private javax.swing.JButton btnIncorporar;
    private javax.swing.JButton btnNoIncorporar;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAccion;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblProceso;
    // End of variables declaration//GEN-END:variables
}
