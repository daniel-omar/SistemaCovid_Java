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
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FMantenedorIncorporacion extends javax.swing.JInternalFrame {

    Incorporacion incorporacion = new Incorporacion();
    IncorporacionDAO incorporacionDAO = new IncorporacionDAO();
    Persona persona = new Persona();
    PersonaDAO personaDAO = new PersonaDAO();

    public static Persona empleado;

    public FMantenedorIncorporacion() {
        initComponents();

        Ocultar(false);
        btnEstadoFicha.setText("Pendiente");
        lblInfo.setText("<html>Se debe completar la ficha para poder registrar <br> su incorporación</html>");
        lblInfo.setFont(new Font("Tahoma", Font.PLAIN, 12));
        this.setSize(300, 160);
    }

    public FMantenedorIncorporacion(int idIncorporacion) {
        initComponents();

        obtenerIncorporacion(idIncorporacion);
        obtenerPersona(incorporacion.getIdPersonaRegistro());

        Ocultar(false);
        if (Principal.persona.getoTipoPersona().getNombre().equalsIgnoreCase("empleado")) {
            btnVer.setVisible(true);
            lblProceso.setVisible(true);
            lblProceso.setText("<html>Su proceso de incoporación esta en estado: " + incorporacion.getoEstadoIncorporacion().getNombre() + "</html>");
            return;
        }
        Ocultar(true);
        if (incorporacion.getoEstadoIncorporacion().getNombre().equalsIgnoreCase("pendiente")) {
            btnIncorporar.setEnabled(true);
            btnNoIncorporar.setEnabled(true);
        } else {
            btnIncorporar.setEnabled(false);
            btnNoIncorporar.setEnabled(false);
        }
    }

    private void obtenerIncorporacion(int idIncorporacion) {
        incorporacion = incorporacionDAO.obtenerIncorporacion(idIncorporacion);
        btnEstadoFicha.setText("Completada");
    }

    private void obtenerPersona(int idPersona) {
        persona = personaDAO.obtenerPersona(idPersona);
        lblInfo.setText(persona.getNombres() + " " + persona.getApellidoPaterno() + " " + persona.getApellidoMaterno());
        lblInfo.setFont(new Font("Tahoma", Font.BOLD, 14));
    }

    void Ocultar(boolean esVisible) {

        btnVer.setVisible(esVisible);
        lblAccion.setVisible(esVisible);
        btnIncorporar.setVisible(esVisible);
        btnNoIncorporar.setVisible(esVisible);

    }

    private void pintarLabel(JLabel lbl, String ruta) {
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(
                imagen.getImage().getScaledInstance(
                        lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT
                )
        );
        lbl.setIcon(icono);
        this.repaint();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblInfo.setText("Persona");
        getContentPane().add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblProceso.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(lblProceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 290, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("<html><p><u>Ficha</u></p></html>");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Ficha Sintomatología");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lblAccion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblAccion.setText("<html><p><u>Acciones</u></p></html>");
        getContentPane().add(lblAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        btnIncorporar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIncorporar.setText("Incorporar");
        btnIncorporar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncorporarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIncorporar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 114, 35));

        btnNoIncorporar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNoIncorporar.setText("No incorporar");
        btnNoIncorporar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoIncorporarActionPerformed(evt);
            }
        });
        getContentPane().add(btnNoIncorporar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, 35));

        btnEstadoFicha.setBackground(new java.awt.Color(153, 255, 153));
        btnEstadoFicha.setText("Estado");
        btnEstadoFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoFichaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstadoFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 100, -1));

        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        getContentPane().add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncorporarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncorporarActionPerformed
        try {

            boolean resp = incorporacionDAO.actualizarEstadoIncorporacion(incorporacion.getIdIncorporacion(), 2, 0);

            if (resp) {
                JOptionPane.showMessageDialog(null, "Incorporación registrada", "Info", JOptionPane.INFORMATION_MESSAGE);
                FIncorporacion fIncorporacion = new FIncorporacion();
                Principal.dsPrincipal.add(fIncorporacion);
                Redimensionar.redimensionar(dsPrincipal, fIncorporacion);
                fIncorporacion.show();
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
                FIncorporacion fIncorporacion = new FIncorporacion();
                Principal.dsPrincipal.add(fIncorporacion);
                Redimensionar.redimensionar(dsPrincipal, fIncorporacion);
                fIncorporacion.show();
                this.dispose();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNoIncorporarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        FFichaSintomatologia fFichaSintomatologia = new FFichaSintomatologia(incorporacion.getIdFichaSintomatologica());
        Principal.dsPrincipal.add(fFichaSintomatologia);
        Redimensionar.redimensionar(dsPrincipal, fFichaSintomatologia);
        fFichaSintomatologia.show();
        this.dispose();
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnEstadoFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoFichaActionPerformed
        if (btnEstadoFicha.getText().equalsIgnoreCase("Pendiente")) {
            FFichaSintomatologia fFichaSintomatologia = new FFichaSintomatologia();
            Principal.dsPrincipal.add(fFichaSintomatologia);
            Redimensionar.redimensionar(dsPrincipal, fFichaSintomatologia);
            fFichaSintomatologia.show();
            this.dispose();
        }
    }//GEN-LAST:event_btnEstadoFichaActionPerformed


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
