
package SwingTest04;

import SwingTest04.Connexion;



public class JFrameTest extends javax.swing.JFrame {

    
    public JFrameTest() {
        initComponents();
        this.setSize(getToolkit().getScreenSize());
        this.setSize((int)getToolkit().getScreenSize().getWidth(), ((int)getToolkit().getScreenSize().getHeight() - 40));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        tvaButton = new javax.swing.JButton();
        editeurButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        employeButton = new javax.swing.JButton();
        infoLibrairieButton = new javax.swing.JButton();
        PromotionButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(525, 325));

        tvaButton.setText("TVA");
        tvaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tvaButtonActionPerformed(evt);
            }
        });

        editeurButton.setText("Editeur");
        editeurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editeurButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Max JFrame Test");

        employeButton.setText("Employe");
        employeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeButtonActionPerformed(evt);
            }
        });

        infoLibrairieButton.setText("Info Librairie");
        infoLibrairieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoLibrairieButtonActionPerformed(evt);
            }
        });

        PromotionButton.setText("Promotion");
        PromotionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromotionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editeurButton)
                            .addComponent(tvaButton)
                            .addComponent(employeButton)
                            .addComponent(infoLibrairieButton)
                            .addComponent(PromotionButton))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tvaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editeurButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(employeButton)
                .addGap(18, 18, 18)
                .addComponent(infoLibrairieButton)
                .addGap(18, 18, 18)
                .addComponent(PromotionButton)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tvaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tvaButtonActionPerformed
        
        jPanel3.setVisible(false);
        TvaJPanel tvaJP = new TvaJPanel(this);
        this.getContentPane().add(tvaJP);
        tvaJP.setVisible(true);
        ;
    }//GEN-LAST:event_tvaButtonActionPerformed

    private void editeurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editeurButtonActionPerformed
        
        jPanel3.setVisible(false);
        EditeurJPanel EditeurJP = new EditeurJPanel(this);
        this.getContentPane().add(EditeurJP);
        EditeurJP.setVisible(true);
    }//GEN-LAST:event_editeurButtonActionPerformed

    private void employeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeButtonActionPerformed
        
        jPanel3.setVisible(false);
        EmployeJPanel EmployeJP = new EmployeJPanel(this);
        this.getContentPane().add(EmployeJP);
        EmployeJP.setVisible(true);
    }//GEN-LAST:event_employeButtonActionPerformed

    private void infoLibrairieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoLibrairieButtonActionPerformed
        
        jPanel3.setVisible(false);
        InfoLibrairieJPanel infoLibrairieJP = new InfoLibrairieJPanel(this);
        this.getContentPane().add(infoLibrairieJP);
        infoLibrairieJP.setVisible(true);
        
    }//GEN-LAST:event_infoLibrairieButtonActionPerformed

    private void PromotionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromotionButtonActionPerformed
       
        jPanel3.setVisible(false);
        PromotionJPanel PromotiomJP = new PromotionJPanel(this);
        this.getContentPane().add(PromotiomJP);
        PromotiomJP.setVisible(true);
    }//GEN-LAST:event_PromotionButtonActionPerformed

    public static void main(String args[]) {
        
        Connexion.toConnect();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PromotionButton;
    private javax.swing.JButton editeurButton;
    private javax.swing.JButton employeButton;
    private javax.swing.JButton infoLibrairieButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton tvaButton;
    // End of variables declaration//GEN-END:variables
}
