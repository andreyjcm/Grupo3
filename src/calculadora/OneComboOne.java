/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author laboratorio
 */
public class OneComboOne extends javax.swing.JFrame {

    ArrayList<String> arrProvincias = new ArrayList<String> ();
    ArrayList<String> arrCantones = new ArrayList<String> ();
    ArrayList<String> arrProvinciasMayusculas = new ArrayList<String> ();
    ArrayList<String> arrCantonesMayusculas = new ArrayList<String> ();
    ArrayList<String> arrCantonesSJ = new ArrayList<String> ();
    ArrayList<String> arrCantonesHeredia = new ArrayList<String> ();
    
    /**
     * Creates new form OneComboOne
     */
    public OneComboOne() {
        initComponents();
        cargarComboBoxes ();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCBProvincias = new javax.swing.JComboBox();
        jCBCantones = new javax.swing.JComboBox();
        jTFElementoAgregado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBAgregarElemento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCBProvincias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBProvincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBProvinciasActionPerformed(evt);
            }
        });

        jCBCantones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTFElementoAgregado.setName(""); // NOI18N

        jLabel1.setText("Elemento agregado");

        jBAgregarElemento.setText("Agregar elemento");
        jBAgregarElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarElementoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBAgregarElemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jCBCantones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCBProvincias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jTFElementoAgregado, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jCBProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jCBCantones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFElementoAgregado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addComponent(jBAgregarElemento)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarElementoActionPerformed
        if (! arrProvinciasMayusculas.contains(jTFElementoAgregado.getText().toUpperCase()))
        {
            arrProvincias.add(jTFElementoAgregado.getText());
            arrProvinciasMayusculas.add(jTFElementoAgregado.getText().toUpperCase());
            sincronizarCBProvincias();
        }
    }//GEN-LAST:event_jBAgregarElementoActionPerformed

    private void jCBProvinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBProvinciasActionPerformed
        sincronizarCBCantones();
    }//GEN-LAST:event_jCBProvinciasActionPerformed

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
            java.util.logging.Logger.getLogger(OneComboOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OneComboOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OneComboOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OneComboOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OneComboOne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarElemento;
    private javax.swing.JComboBox jCBCantones;
    private javax.swing.JComboBox jCBProvincias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTFElementoAgregado;
    // End of variables declaration//GEN-END:variables

    private void cargarComboBoxes() {
        arrProvincias.add("Heredia");
        arrProvincias.add("San José");
        arrProvincias.add("Limón");
        arrProvincias.add("Puntarenas");
        arrCantonesSJ.add("Curridabat");
        arrCantonesSJ.add("Santa Ana");
        arrCantonesSJ.add("Alajuelita");
        arrCantonesSJ.add("Moravia");
        arrCantonesHeredia.add("San Joaquín");
        arrCantonesHeredia.add("San Pablo");
        arrCantonesHeredia.add("Santo Domingo");
        sincronizarArrProvinciasMayusculas();
        sincronizarCBProvincias();
        sincronizarCBCantones();
    }
    
    private void sincronizarArrProvinciasMayusculas ()
    {
        for (String elemento : arrProvincias )
        {
            arrProvinciasMayusculas.add(elemento.toUpperCase());
        }
        sincronizarCBProvincias();
        
    }
    
    private void sincronizarCBProvincias ()
    {
        jCBProvincias.setModel(new DefaultComboBoxModel (arrProvincias.toArray()));
    }
    
    private void sincronizarCBCantones ()
    {
        jCBCantones.setModel(new DefaultComboBoxModel ());
        if (jCBProvincias.getSelectedItem() == "San José")
            jCBCantones.setModel(new DefaultComboBoxModel (arrCantonesSJ.toArray()));
        if (jCBProvincias.getSelectedItem() == "Heredia")
            jCBCantones.setModel(new DefaultComboBoxModel (arrCantonesHeredia.toArray()));
    }
}