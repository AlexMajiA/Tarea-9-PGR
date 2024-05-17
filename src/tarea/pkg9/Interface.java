/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tarea.pkg9;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amjpa
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigoLb = new javax.swing.JLabel();
        nombreLB = new javax.swing.JLabel();
        id_localizacionLb = new javax.swing.JLabel();
        id_managerLb = new javax.swing.JLabel();
        codigo_Tf = new javax.swing.JTextField();
        nombreTf = new javax.swing.JTextField();
        id_localizacionTf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDepartamentos = new javax.swing.JTable();
        insertarBt = new javax.swing.JButton();
        borrarBt = new javax.swing.JButton();
        mostrarBt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id_managerTf = new javax.swing.JTextField();
        limpiarBT = new javax.swing.JButton();
        salirBt = new javax.swing.JButton();
        actualizarBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codigoLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        codigoLb.setText("Código");

        nombreLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombreLB.setText("Nombre");

        id_localizacionLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        id_localizacionLb.setText("ID Localización");

        id_managerLb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        id_managerLb.setText("ID Manager");

        id_localizacionTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_localizacionTfActionPerformed(evt);
            }
        });

        tablaDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Id_Localización", "Id_Manager"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDepartamentos);

        insertarBt.setText("Insertar");
        insertarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarBtActionPerformed(evt);
            }
        });

        borrarBt.setText("Borrar");
        borrarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBtActionPerformed(evt);
            }
        });

        mostrarBt.setText("Mostrar");
        mostrarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarBtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setText("Datos del departamento");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setText("Mostrar datos del departamento");

        limpiarBT.setText("Limpiar");
        limpiarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBTActionPerformed(evt);
            }
        });

        salirBt.setText("Salir");
        salirBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtActionPerformed(evt);
            }
        });

        actualizarBt.setText("Actualizar");
        actualizarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoLb)
                    .addComponent(nombreLB)
                    .addComponent(id_localizacionLb)
                    .addComponent(id_managerLb)
                    .addComponent(insertarBt))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actualizarBt)
                        .addGap(31, 31, 31)
                        .addComponent(borrarBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreTf, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigo_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_localizacionTf, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_managerTf, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mostrarBt)
                        .addGap(28, 28, 28)
                        .addComponent(limpiarBT)
                        .addGap(229, 229, 229)
                        .addComponent(salirBt))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigoLb)
                            .addComponent(codigo_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreLB)
                            .addComponent(nombreTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_localizacionLb)
                            .addComponent(id_localizacionTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_managerLb)
                            .addComponent(id_managerTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertarBt)
                    .addComponent(mostrarBt)
                    .addComponent(limpiarBT)
                    .addComponent(salirBt)
                    .addComponent(actualizarBt)
                    .addComponent(borrarBt))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtActionPerformed
    System.exit(0);    }//GEN-LAST:event_salirBtActionPerformed

    private void actualizarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBtActionPerformed

        ConectorBaseDatos c = new ConectorBaseDatos();
        int resultado = c.actualizar(
                Integer.parseInt(this.codigo_Tf.getText()),
                this.nombreTf.getText(),
                Integer.parseInt(this.id_localizacionTf.getText()),
                Integer.parseInt(this.id_managerTf.getText()));

        if (resultado > 0) {
            Mostrar();
        }


    }//GEN-LAST:event_actualizarBtActionPerformed

    private void mostrarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarBtActionPerformed
        Mostrar();
    }//GEN-LAST:event_mostrarBtActionPerformed

    private void insertarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarBtActionPerformed

        ConectorBaseDatos c = new ConectorBaseDatos();
        int resultado = c.altas(Integer.parseInt(this.codigo_Tf.getText()), this.nombreTf.getText(),
                Integer.parseInt(this.id_localizacionTf.getText()), Integer.parseInt(this.id_managerTf.getText()));

        if (resultado > 0) {
            Mostrar();
        }


    }//GEN-LAST:event_insertarBtActionPerformed

    private void borrarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtActionPerformed

        ConectorBaseDatos c = new ConectorBaseDatos();
        int resultado = c.borrado(Integer.parseInt(this.codigo_Tf.getText()));

        if (resultado > 0) {
            Mostrar();
        }
        LimpiarTextos();


    }//GEN-LAST:event_borrarBtActionPerformed

    private void limpiarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBTActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dm = (DefaultTableModel) tablaDepartamentos.getModel();
        dm.setRowCount(0);
    }//GEN-LAST:event_limpiarBTActionPerformed

    private void id_localizacionTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_localizacionTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_localizacionTfActionPerformed

    private void Mostrar() {

        //Borrado de los datos.
        DefaultTableModel dm = (DefaultTableModel) tablaDepartamentos.getModel();
        dm.getDataVector().removeAllElements();

        //Creación de datos.
        ConectorBaseDatos c = new ConectorBaseDatos();

        ArrayList<persona> departamentos = c.mostrar();

        //Añado objetos a la tabla.
        for (int i = 0; i < departamentos.size(); i++) {
            String datosTabla[] = {Integer.toString(departamentos.get(i).getCodigo()), departamentos.get(i).getNombre(),
                Integer.toString(departamentos.get(i).getId_localizacion()), Integer.toString(departamentos.get(i).getId_manager())};

            //me traigo los datos de la tabla.
            DefaultTableModel dm1 = (DefaultTableModel) tablaDepartamentos.getModel();

            //añado una línea nueva con los datos del array.
            dm1.addRow(datosTabla);
        }
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
   public void LimpiarTextos(){
       codigo_Tf.setText("");
       nombreTf.setText("");
       id_localizacionTf.setText("");
       id_managerTf.setText("");
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarBt;
    private javax.swing.JButton borrarBt;
    private javax.swing.JLabel codigoLb;
    private javax.swing.JTextField codigo_Tf;
    private javax.swing.JLabel id_localizacionLb;
    private javax.swing.JTextField id_localizacionTf;
    private javax.swing.JLabel id_managerLb;
    private javax.swing.JTextField id_managerTf;
    private javax.swing.JButton insertarBt;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarBT;
    private javax.swing.JButton mostrarBt;
    private javax.swing.JLabel nombreLB;
    private javax.swing.JTextField nombreTf;
    private javax.swing.JButton salirBt;
    private javax.swing.JTable tablaDepartamentos;
    // End of variables declaration//GEN-END:variables
}
