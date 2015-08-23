/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import java.util.Objects;
import java.util.TreeMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author laboratorio
 */
public class OneComboHash extends javax.swing.JFrame {

    Integer numeroProvinciaSeleccionado = 0;
    TreeMap<Integer, Provincia> provinceMap = new TreeMap<Integer, Provincia>();
    TreeMap<Integer, Canton> cantonMap = new TreeMap<Integer, Canton>();
    
    
    /**
     * Creates new form OneComboOne
     */
    public OneComboHash() {
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

        jTextField1 = new javax.swing.JTextField();
        jCBProvincias = new javax.swing.JComboBox();
        jCBCantones = new javax.swing.JComboBox();
        jTFElementoAgregado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBAgregarElemento = new javax.swing.JButton();
        jTFCampo1 = new javax.swing.JTextField();
        jTFCampo2 = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCBProvincias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBProvincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBProvinciasActionPerformed(evt);
            }
        });

        jCBCantones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBCantones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCantonesActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBAgregarElemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBCantones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBProvincias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTFElementoAgregado, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jTFCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFCampo2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCampo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarElementoActionPerformed
    }//GEN-LAST:event_jBAgregarElementoActionPerformed

    private void jCBProvinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBProvinciasActionPerformed
        Item item = (Item)jCBProvincias.getSelectedItem();
        if (item != null)
        {
            numeroProvinciaSeleccionado = item.getId();
            Provincia provinciaSeleccionada = provinceMap.get(numeroProvinciaSeleccionado);
            sincronizarCBCantones(provinciaSeleccionada.getNumero());
        }
    }//GEN-LAST:event_jCBProvinciasActionPerformed

    private void jCBCantonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCantonesActionPerformed
        imprimirMensaje();
    }//GEN-LAST:event_jCBCantonesActionPerformed

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
            java.util.logging.Logger.getLogger(OneComboHash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OneComboHash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OneComboHash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OneComboHash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OneComboHash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarElemento;
    private javax.swing.JComboBox jCBCantones;
    private javax.swing.JComboBox jCBProvincias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTFCampo1;
    private javax.swing.JTextField jTFCampo2;
    private javax.swing.JTextField jTFElementoAgregado;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void cargarComboBoxes() {

        provinceMap.put(100, new Provincia(6, "Guanacaste", 0.0, "GU"));
        provinceMap.put(300, new Provincia(4, "Heredia", 0.0, "HE"));
        provinceMap.put(500, new Provincia(7, "Puntarenas", 0.0, "PU"));
        provinceMap.put(200, new Provincia(2, "San José", 0.0, "SJ"));
        provinceMap.put(400, new Provincia(1, "Limón", 0.0, "LI"));
        provinceMap.put(600, new Provincia(3, "Alajuela", 0.0, "AL"));
        provinceMap.put(700, new Provincia(5, "Cartago", 0.0, "CA"));
        cantonMap.put(52, new Canton(4, 4, "San Pablo", 6234.3043, ""));
        cantonMap.put(49, new Canton(7, 4, "Santo Domingo", 654.92, ""));
        cantonMap.put(20, new Canton(9, 4, "Santa Marta", 16324.234, ""));
        cantonMap.put(83, new Canton(14, 4, "San Joaquín", 78234.1234, ""));
        cantonMap.put(50, new Canton(2, 2, "Moravia", 769014.67, ""));
        cantonMap.put(35, new Canton(11, 2, "Santa Ana", 7657.5425, ""));
        sincronizarCBProvincias();
        sincronizarCBCantones(0);
        
}
    
    private void sincronizarCBProvincias ()
    {
        jCBProvincias.setModel(new DefaultComboBoxModel());
        for (Integer p : provinceMap.keySet())
        {
            Provincia actual = provinceMap.get(p);
            jCBProvincias.addItem(new Item(p, actual.getIniciales() + "-" + actual.getNombre()));
        }
/*
        for (Provincia p : provinceMap.values())
        {
            jCBProvincias.addItem(new Item(p.getNumero(), p.getIniciales() + "-" + p.getNombre()));
        }
*/
    }
    
    private void sincronizarCBCantones (Integer numProvincia)
    {
        jCBCantones.setModel(new DefaultComboBoxModel ());
        for (Integer c : cantonMap.keySet())
        {
            Canton actual = cantonMap.get(c);
            if (Objects.equals(actual.getProvincia(), numProvincia))
                jCBCantones.addItem(new Item(c, actual.getNombre()));
        }

/*
        for (Canton c : cantonMap.values())
        {
            if (Objects.equals(c.getProvincia(), numProvincia))
                jCBCantones.addItem(new Item(c.getNumero(), c.getNombre()));
        }
*/
    }

    private void imprimirMensaje() {
        // obtenga el objeto provincia
        Integer numProvincia = 0;
        Item provinciaSeleccionada = (Item)jCBProvincias.getSelectedItem();
        numProvincia = provinciaSeleccionada.getId();
        Provincia provinciaActual = provinceMap.get(numProvincia);
        jTFCampo1.setText(provinciaActual.getNumero().toString());
        Integer numCanton = 0;
        Item cantonSeleccionado = (Item)jCBCantones.getSelectedItem();
        numCanton = cantonSeleccionado.getId();
        Canton cantonActual = cantonMap.get(numCanton);
        jTFCampo2.setText(String.valueOf(cantonActual.getArea()));
    }
}
