/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Incorporacion;
import Util.Render;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import Data.IncorporacionDAO;
import Util.Redimensionar;
import static Vista.Principal.dsPrincipal;
import javax.swing.JOptionPane;

public class FIncorporacion extends javax.swing.JInternalFrame {

    IncorporacionDAO incorporacionDAO = new IncorporacionDAO();
    DefaultTableModel dtblIncorporacion = null;
    JButton btnAVer = new JButton("Ver");
    SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd");

    public FIncorporacion() {
        initComponents();

        EstablecerFecha();
        listarIncorporacion();
    }

    private void EstablecerFecha() {
        Calendar calendarToday = Calendar.getInstance();
        Date dateObjToday = calendarToday.getTime();

        Calendar calendarBefore = Calendar.getInstance();
        calendarBefore.setTime(dateObjToday);
        calendarBefore.add(Calendar.MONTH, -1);

        Date dateObjBefore = calendarBefore.getTime();

        String today = dtf.format(dateObjToday);
        String before = dtf.format(dateObjBefore);
        try {
            Date fechaInicio = dtf.parse(before);
            Date fechaFin = dtf.parse(today);
        } catch (Exception ex) {

        }
    }

    public void inicializarIncorporacion() {
        btnAVer.setName("btnVer");

        tblIncorporacion.setDefaultRenderer(Object.class, new Render());
        dtblIncorporacion = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dtblIncorporacion.addColumn("IdIncorporacion");
        dtblIncorporacion.addColumn("Empleado");
        dtblIncorporacion.addColumn("Fecha Registro");
        dtblIncorporacion.addColumn("Estado");
        dtblIncorporacion.addColumn("");
        tblIncorporacion.setModel(dtblIncorporacion);
        tblIncorporacion.getTableHeader().setReorderingAllowed(false);
        tblIncorporacion.getColumnModel().getColumn(0).setMaxWidth(0);
        tblIncorporacion.getColumnModel().getColumn(0).setMinWidth(0);
        tblIncorporacion.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblIncorporacion.getColumnModel().getColumn(0).setResizable(false);
        tblIncorporacion.setRowHeight(30);
    }

    public void listarIncorporacion() {

        inicializarIncorporacion();
        List<Incorporacion> lstIncorporacion = incorporacionDAO.ListarIncorporacion(1);

        for (int i = 0; i < lstIncorporacion.size(); i++) {
            dtblIncorporacion.addRow(new Object[]{
                lstIncorporacion.get(i).getIdIncorporacion(),
                lstIncorporacion.get(i).getoPersonaRegistro().getNombres() + " "
                + lstIncorporacion.get(i).getoPersonaRegistro().getApellidoPaterno() + " "
                + lstIncorporacion.get(i).getoPersonaRegistro().getApellidoMaterno(),
                lstIncorporacion.get(i).getFechaRegistro(),
                lstIncorporacion.get(i).getoEstadoIncorporacion().getNombre(),
                //lstIncorporacion.get(i).getoEstadoIncorporacion().getNombre(),
                btnAVer
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        spIncorporacion = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIncorporacion = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Incorporación");

        spIncorporacion.setPreferredSize(new java.awt.Dimension(300, 404));

        tblIncorporacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIncorporacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblIncorporacion);

        spIncorporacion.setViewportView(jScrollPane1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Incorporaciones pendientes:");

        jLabel3.setText("<html>Se puede visualizar todos los empleados que han registrado su ficha de sintomatologia </br>y estan con una incorporación pendiente</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(spIncorporacion, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spIncorporacion, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblIncorporacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIncorporacionMouseClicked
        int column = tblIncorporacion.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tblIncorporacion.getRowHeight();

        if (row < tblIncorporacion.getRowCount() && row >= 0 && column < tblIncorporacion.getColumnCount() && column >= 0) {
            Object value = tblIncorporacion.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                int idIncorporacion = Integer.parseInt(tblIncorporacion.getValueAt(row, 0).toString());
                if (boton.getName().equals("btnVer")) {
                    FMantenedorIncorporacion fMantenedorIncorporacion = new FMantenedorIncorporacion(idIncorporacion);
                    Principal.dsPrincipal.add(fMantenedorIncorporacion);
                    Redimensionar.redimensionar(dsPrincipal, fMantenedorIncorporacion);
                    fMantenedorIncorporacion.show();
                    //this.dispose();
                }
            }
        }
    }//GEN-LAST:event_tblIncorporacionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane spIncorporacion;
    private javax.swing.JTable tblIncorporacion;
    // End of variables declaration//GEN-END:variables
}
