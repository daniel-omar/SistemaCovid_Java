/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.FichaSintomatologica;
import Data.FichaSintomatologicaDAO;
import Data.IncorporacionDAO;
import Util.Redimensionar;
import static Vista.Principal.dsPrincipal;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 *
 * @author omar_
 */
public class FFichaSintomatologia extends javax.swing.JInternalFrame {

    FichaSintomatologica fichaSintomatologica = new FichaSintomatologica();
    FichaSintomatologicaDAO fichaSintomatologicaDAO = new FichaSintomatologicaDAO();
    IncorporacionDAO incorporacionDAO = new IncorporacionDAO();

    public FFichaSintomatologia() {
        initComponents();
        addCloseEvent();
        lblDescripcion.setText("<html>Los datos ingresados en esta ficha contituyen una declaración jurada de su parte</html>");

    }

    void addCloseEvent() {
        addInternalFrameListener(new InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent e) {
                FIncorporacion fIncorporacion = new FIncorporacion();
                dsPrincipal.add(fIncorporacion);
                Redimensionar.redimensionar(dsPrincipal, fIncorporacion);
                fIncorporacion.show();
            }
        });
    }

    public FFichaSintomatologia(int idFicha) {
        initComponents();
        addCloseEvent();
        lblDescripcion.setText("<html>Datos ingresados por el empleado</html>");
        btnRegistrar.setVisible(false);
        cbFichaSintomatologica.setVisible(false);
        obtenerFichaSintomatologica(idFicha);
    }

    private void obtenerFichaSintomatologica(int idFicha) {
        fichaSintomatologica = fichaSintomatologicaDAO.obtenerIncorporacion(idFicha);

        if (fichaSintomatologica.getSensacionAlzaTermica()) {
            rbPregunta1Si.setSelected(true);
        } else {
            rbPregunta1No.setSelected(true);
        }
        if (fichaSintomatologica.getTosEstornudo()) {
            rbPregunta2Si.setSelected(true);
        } else {
            rbPregunta2No.setSelected(true);
        }
        if (fichaSintomatologica.getExpectoracionFlema()) {
            rbPregunta3Si.setSelected(true);
        } else {
            rbPregunta3No.setSelected(true);
        }
        if (fichaSintomatologica.getContactoPositivo()) {
            rbPregunta4Si.setSelected(true);
        } else {
            rbPregunta4No.setSelected(true);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bgPregunta1 = new javax.swing.ButtonGroup();
        bgPregunta2 = new javax.swing.ButtonGroup();
        bgPregunta3 = new javax.swing.ButtonGroup();
        bgPregunta4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbPregunta1Si = new javax.swing.JRadioButton();
        rbPregunta1No = new javax.swing.JRadioButton();
        rbPregunta2Si = new javax.swing.JRadioButton();
        rbPregunta2No = new javax.swing.JRadioButton();
        rbPregunta3Si = new javax.swing.JRadioButton();
        rbPregunta3No = new javax.swing.JRadioButton();
        rbPregunta4No = new javax.swing.JRadioButton();
        rbPregunta4Si = new javax.swing.JRadioButton();
        cbFichaSintomatologica = new javax.swing.JCheckBox();
        btnRegistrar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jLabel5.setText("jLabel5");

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ficha de sintomatología");

        lblDescripcion.setText("<html>Los datos expresados en esta ficha constituyen </br>una declaración jurada de su parte </html>");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("<html>¿Presenta alguno de los siguientes sintomas?</html>");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("<html>1-Sensación de alza térmica o fiebre mayor a 37.5° </html>");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("<html>2-Tos, estornudo o dificultad respiratorio</html>");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("<html>3-Expectoración o flema amarilla</html>");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Otros datos importantes");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("<html>4-Contacto con persona(s) con un caso confirmado de COVID-19</html>");

        bgPregunta1.add(rbPregunta1Si);
        rbPregunta1Si.setText("Sí");

        bgPregunta1.add(rbPregunta1No);
        rbPregunta1No.setText("No");

        bgPregunta2.add(rbPregunta2Si);
        rbPregunta2Si.setText("Sí");

        bgPregunta2.add(rbPregunta2No);
        rbPregunta2No.setText("No");

        bgPregunta3.add(rbPregunta3Si);
        rbPregunta3Si.setText("Sí");

        bgPregunta3.add(rbPregunta3No);
        rbPregunta3No.setText("No");

        bgPregunta4.add(rbPregunta4No);
        rbPregunta4No.setText("No");

        bgPregunta4.add(rbPregunta4Si);
        rbPregunta4Si.setText("Sí");

        cbFichaSintomatologica.setText("<html>He sido informado que de omitir o falsear información, puedo perjudicar la salud de mis compañeros o la mía propia, asumiendo las consecuencias</html>");
        cbFichaSintomatologica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFichaSintomatologicaActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbFichaSintomatologica, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(rbPregunta1Si)
                        .addGap(39, 39, 39)
                        .addComponent(rbPregunta1No))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbPregunta3Si)
                                .addGap(39, 39, 39)
                                .addComponent(rbPregunta3No))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbPregunta2Si)
                                .addGap(39, 39, 39)
                                .addComponent(rbPregunta2No))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(rbPregunta4Si)
                        .addGap(39, 39, 39)
                        .addComponent(rbPregunta4No)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPregunta1Si)
                    .addComponent(rbPregunta1No))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPregunta2Si)
                    .addComponent(rbPregunta2No))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPregunta3Si)
                    .addComponent(rbPregunta3No))
                .addGap(3, 3, 3)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPregunta4Si)
                    .addComponent(rbPregunta4No))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFichaSintomatologica, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbFichaSintomatologicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFichaSintomatologicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFichaSintomatologicaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            if (!rbPregunta1No.isSelected() && !rbPregunta1Si.isSelected()) {
                JOptionPane.showMessageDialog(null, "Seleccionar respuesta Pregunta 1", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (!rbPregunta2No.isSelected() && !rbPregunta2Si.isSelected()) {
                JOptionPane.showMessageDialog(null, "Seleccionar respuesta Pregunta 2", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (!rbPregunta3No.isSelected() && !rbPregunta3Si.isSelected()) {
                JOptionPane.showMessageDialog(null, "Seleccionar respuesta Pregunta 3", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (!rbPregunta4No.isSelected() && !rbPregunta4Si.isSelected()) {
                JOptionPane.showMessageDialog(null, "Seleccionar respuesta Pregunta 4", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (!cbFichaSintomatologica.isSelected()) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar si está de acuerdo con las condiciones", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            boolean pregunta1 = rbPregunta1Si.isSelected() ? true : false;
            boolean pregunta2 = rbPregunta2Si.isSelected() ? true : false;
            boolean pregunta3 = rbPregunta3Si.isSelected() ? true : false;
            boolean pregunta4 = rbPregunta4Si.isSelected() ? true : false;

            fichaSintomatologica.setSensacionAlzaTermica(pregunta1);
            fichaSintomatologica.setTosEstornudo(pregunta2);
            fichaSintomatologica.setExpectoracionFlema(pregunta3);
            fichaSintomatologica.setContactoPositivo(pregunta4);
            fichaSintomatologica.setIdPersonaRegistro(Principal.persona.getIdPersona());

            int idFicha = fichaSintomatologicaDAO.registrarFichaSintomatologica(fichaSintomatologica);
            if (incorporacionDAO.registrarIncorporacion(idFicha, Principal.persona.getIdPersona())) {
                JOptionPane.showMessageDialog(null, "Incorporación registrada", "Info", JOptionPane.INFORMATION_MESSAGE);

                FIncorporacion fIncorporacion = new FIncorporacion();
                dsPrincipal.add(fIncorporacion);
                Redimensionar.redimensionar(dsPrincipal, fIncorporacion);
                fIncorporacion.show();
                this.dispose();
            }

        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btnRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgPregunta1;
    private javax.swing.ButtonGroup bgPregunta2;
    private javax.swing.ButtonGroup bgPregunta3;
    private javax.swing.ButtonGroup bgPregunta4;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox cbFichaSintomatologica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JRadioButton rbPregunta1No;
    private javax.swing.JRadioButton rbPregunta1Si;
    private javax.swing.JRadioButton rbPregunta2No;
    private javax.swing.JRadioButton rbPregunta2Si;
    private javax.swing.JRadioButton rbPregunta3No;
    private javax.swing.JRadioButton rbPregunta3Si;
    private javax.swing.JRadioButton rbPregunta4No;
    private javax.swing.JRadioButton rbPregunta4Si;
    // End of variables declaration//GEN-END:variables
}
