package Atividades;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Diego
 */
public class Atividade_02 extends javax.swing.JFrame {

    /**
     * Creates new form Atividade_02
     */
    public Atividade_02() {
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextInput = new javax.swing.JTextField();
        jBtnCalcular = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        img_1 = new javax.swing.JLabel();
        img_5 = new javax.swing.JLabel();
        img_10 = new javax.swing.JLabel();
        img_20 = new javax.swing.JLabel();
        img_50 = new javax.swing.JLabel();
        img_100 = new javax.swing.JLabel();
        real_1 = new javax.swing.JLabel();
        real_100 = new javax.swing.JLabel();
        real_5 = new javax.swing.JLabel();
        real_10 = new javax.swing.JLabel();
        real_20 = new javax.swing.JLabel();
        real_50 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Valor:");

        jBtnCalcular.setText("Calcular");
        jBtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalcularActionPerformed(evt);
            }
        });

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        img_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1-real.jpg"))); // NOI18N

        img_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5-reais.jpg"))); // NOI18N

        img_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/10-reais.jpg"))); // NOI18N

        img_20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/20-reais.jpg"))); // NOI18N

        img_50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/50-reais.jpg"))); // NOI18N

        img_100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/100-reais.jpg"))); // NOI18N

        real_1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        real_1.setText("0");

        real_100.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        real_100.setText("0");

        real_5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        real_5.setText("0");

        real_10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        real_10.setText("0");

        real_20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        real_20.setText("0");

        real_50.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        real_50.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(img_100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(real_100))
                    .addComponent(img_50)
                    .addComponent(img_20)
                    .addComponent(img_10)
                    .addComponent(img_5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(img_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(real_1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(real_5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(real_10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(real_20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(real_50, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(jTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBtnCalcular)
                                            .addComponent(jButton2))
                                        .addGap(18, 18, 18)
                                        .addComponent(img_1))
                                    .addComponent(real_1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(img_5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(real_5, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(img_10))
                                    .addComponent(real_10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(img_20))
                            .addComponent(real_20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(img_50))
                    .addComponent(real_50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(img_100)
                    .addComponent(real_100))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalcularActionPerformed
        
        int value = Integer.parseUnsignedInt(jTextInput.getText());
        int n100 = (int) value/100; value -= 100*n100;
        int n50 = (int) value/50; value -= 50*n50;
        int n20 = (int) value/20; value -= 20*n20;
        int n10 = (int) value/10; value -= 10*n10;
        int n5 = (int) value/5; value -= 5*n5;
        int n1 = (int) value/1; value -= 1*n1;
        real_1.setText(""+n1);
        real_5.setText(""+n5);
        real_10.setText(""+n10);
        real_20.setText(""+n20);
        real_50.setText(""+n50);
        real_100.setText(""+n100);
    }//GEN-LAST:event_jBtnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Atividade_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Atividade_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Atividade_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Atividade_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Atividade_02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img_1;
    private javax.swing.JLabel img_10;
    private javax.swing.JLabel img_100;
    private javax.swing.JLabel img_20;
    private javax.swing.JLabel img_5;
    private javax.swing.JLabel img_50;
    private javax.swing.JButton jBtnCalcular;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextInput;
    private javax.swing.JLabel real_1;
    private javax.swing.JLabel real_10;
    private javax.swing.JLabel real_100;
    private javax.swing.JLabel real_20;
    private javax.swing.JLabel real_5;
    private javax.swing.JLabel real_50;
    // End of variables declaration//GEN-END:variables
}