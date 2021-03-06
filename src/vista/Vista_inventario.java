/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import logica_inventario.Controlador_inventario;
import logica_proyecto.Inventario;

/**
 *
 * @author j
 */
public class Vista_inventario extends javax.swing.JPanel {

    /**
     * Creates new form inventario
     * @param inventario
     * @param aleatorios_demanda
     * @param aleatorios_entrega
     * @param aleatorios_espera
     * @param aleatorios_clientes
     */
    public Vista_inventario() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_reorden_min = new javax.swing.JTextField();
        jTextField_orden_min = new javax.swing.JTextField();
        jTextField_orden_max = new javax.swing.JTextField();
        jTextField_reorden_max = new javax.swing.JTextField();
        jButton_iniciar = new javax.swing.JButton();

        jLabel1.setText("Punto de orden minimo");

        jLabel2.setText("Punto de orden maximo");

        jLabel3.setText("Cantidad de reorden minima");

        jLabel4.setText("Cantidad de reorden maxima");

        jButton_iniciar.setText("Iniciar");
        jButton_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_iniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_orden_min, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_reorden_min, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_orden_max)
                            .addComponent(jTextField_reorden_max)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jButton_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_orden_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_orden_max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_reorden_max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_reorden_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton_iniciar)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_iniciarActionPerformed
        try{
           
            Ventana_principal.inventario.setOrden_min(Integer.parseInt(jTextField_orden_min.getText()));
            Ventana_principal.inventario.setOrden_max(Integer.parseInt(jTextField_orden_max.getText()));
            Ventana_principal.inventario.setReorden_min(Integer.parseInt(jTextField_reorden_min.getText()));
            Ventana_principal.inventario.setReorden_max(Integer.parseInt(jTextField_reorden_max.getText()));
            Ventana_principal.inventario.setCorrida(260);
            Controlador_inventario.demandas(Ventana_principal.inventario, Ventana_principal.aleatorios_demandas, Ventana_principal.aleatorios_demandas, Ventana_principal.aleatorios_demandas);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "los parametros deben ser solo numericos");
        }
        
        
    }//GEN-LAST:event_jButton_iniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField_orden_max;
    private javax.swing.JTextField jTextField_orden_min;
    private javax.swing.JTextField jTextField_reorden_max;
    private javax.swing.JTextField jTextField_reorden_min;
    // End of variables declaration//GEN-END:variables
}
