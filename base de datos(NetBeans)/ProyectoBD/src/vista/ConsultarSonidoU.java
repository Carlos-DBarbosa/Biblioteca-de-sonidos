/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlSonidos;
import java.awt.Image;
import java.util.LinkedList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import modelo.Sonidos;

/**
 *
 * @author Carlos
 */
public class ConsultarSonidoU extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarSonidoU
     */
    LinkedList<Sonidos> listaSonidos;
    
    public ConsultarSonidoU() {
        initComponents();
        listaSonidos = new LinkedList<>();
        imagen();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Consultar Sonidos");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Volver");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Mostrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Nombre");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Fecha");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Elija una opcion para buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(219, 219, 219)
                            .addComponent(jButton2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(174, 174, 174)
                                        .addComponent(jRadioButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jRadioButton1)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(124, 124, 124)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(jButton1)
                            .addGap(96, 96, 96)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ControlSonidos objCs = new ControlSonidos();
        int ncol;
        Object[] fila;
        if(jRadioButton1.isSelected()){
            String nombre = jTextField4.getText();
            listaSonidos = objCs.SonidosPorUsuario(nombre);

            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);

            modelo.addColumn("idSonido");
            modelo.addColumn("Visualizacion");
            modelo.addColumn("Duracion");
            modelo.addColumn("Usuario");
            modelo.addColumn("Sonido");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Fecha");
            modelo.addColumn("Precio");
            modelo.addColumn("idLibreria");
            modelo.addColumn("idCategoria");
            modelo.addColumn("Cedula");
            ncol = modelo.getColumnCount();


            for (int i = 0; i < listaSonidos.size(); i++) {
                fila = new Object[ncol];
                fila[0] = listaSonidos.get(i).getIdSonido();
                fila[1] = listaSonidos.get(i).isSonidoPublicoPrivado();
                
                if(listaSonidos.get(i).isSonidoPublicoPrivado() == true){
                    fila[1] = "Publico";
                }else{
                    fila[1] = "Privado";
                }
                
                fila[2] = listaSonidos.get(i).getDuracionSonido();
                fila[3] = listaSonidos.get(i).getSubidoPor();
                fila[4] = listaSonidos.get(i).getArchivoSonido();
                fila[5] = listaSonidos.get(i).getDescripcionSonido();
                fila[6] = listaSonidos.get(i).getFechaCreacion();
                fila[7] = listaSonidos.get(i).getPrecioS();
                fila[8] = listaSonidos.get(i).getIdLibreriaf();
                fila[9] = listaSonidos.get(i).getIdCategoriaf();
                fila[10] = listaSonidos.get(i).getCedulaf();

                modelo.addRow(fila);
                
            }
        } else if(jRadioButton2.isSelected()){
            String fecha = jTextField4.getText();
            listaSonidos = objCs.SonidosPorFecha(fecha);

            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);

            modelo.addColumn("idSonido");
            modelo.addColumn("Visualizacion");
            modelo.addColumn("Duracion");
            modelo.addColumn("Usuario");
            modelo.addColumn("Sonido");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Fecha");
            modelo.addColumn("Precio");
            modelo.addColumn("idLibreria");
            modelo.addColumn("idCategoria");
            modelo.addColumn("Cedula");
            ncol = modelo.getColumnCount();

            for (int i = 0; i < listaSonidos.size(); i++) {
                fila = new Object[ncol];
                fila[0] = listaSonidos.get(i).getIdSonido();
                fila[1] = listaSonidos.get(i).isSonidoPublicoPrivado();
                
                if(listaSonidos.get(i).isSonidoPublicoPrivado() == true){
                    fila[1] = "Publico";
                }else{
                    fila[1] = "Privado";
                }
                
                fila[2] = listaSonidos.get(i).getDuracionSonido();
                fila[3] = listaSonidos.get(i).getSubidoPor();
                fila[4] = listaSonidos.get(i).getArchivoSonido();
                fila[5] = listaSonidos.get(i).getDescripcionSonido();
                fila[6] = listaSonidos.get(i).getFechaCreacion();
                fila[7] = listaSonidos.get(i).getPrecioS();
                fila[8] = listaSonidos.get(i).getIdLibreriaf();
                fila[9] = listaSonidos.get(i).getIdCategoriaf();
                fila[10] = listaSonidos.get(i).getCedulaf();

                modelo.addRow(fila);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        MenuUsuario Mu = new MenuUsuario();
        this.setVisible(false);
        Mu.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ControlSonidos objCs = new ControlSonidos();
        int ncol;
        Object[] fila;
 
            listaSonidos = objCs.buscarSonidos();

            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);

            modelo.addColumn("idSonido");
            modelo.addColumn("Visualizacion");
            modelo.addColumn("Duracion");
            modelo.addColumn("Usuario");
            modelo.addColumn("Sonido");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Fecha");
            modelo.addColumn("Precio");
            modelo.addColumn("idLibreria");
            modelo.addColumn("idCategoria");
            modelo.addColumn("Cedula");
            ncol = modelo.getColumnCount();


            for (int i = 0; i < listaSonidos.size(); i++) {
                fila = new Object[ncol];
                fila[0] = listaSonidos.get(i).getIdSonido();
                fila[1] = listaSonidos.get(i).isSonidoPublicoPrivado();
                
                if(listaSonidos.get(i).isSonidoPublicoPrivado() == true){
                    fila[1] = "Publico";
                }else{
                    fila[1] = "Privado";
                }
                
                fila[2] = listaSonidos.get(i).getDuracionSonido();
                fila[3] = listaSonidos.get(i).getSubidoPor();
                fila[4] = listaSonidos.get(i).getArchivoSonido();
                fila[5] = listaSonidos.get(i).getDescripcionSonido();
                fila[6] = listaSonidos.get(i).getFechaCreacion();
                fila[7] = listaSonidos.get(i).getPrecioS();
                fila[8] = listaSonidos.get(i).getIdLibreriaf();
                fila[9] = listaSonidos.get(i).getIdCategoriaf();
                fila[10] = listaSonidos.get(i).getCedulaf();

                modelo.addRow(fila);
                
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    public void imagen(){
        ImageIcon imagen = new ImageIcon("src/Imagen/back-button.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
        jLabel7.setIcon(icono);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultarSonidoU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarSonidoU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarSonidoU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarSonidoU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarSonidoU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}