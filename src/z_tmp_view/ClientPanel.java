/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z_tmp_view;

/**
 *
 * @author testo
 */
public class ClientPanel extends javax.swing.JPanel {

    /**
     * Creates new form AvisPanel
     */
    public ClientPanel() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(null);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Id Client : ");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(30, 20, 103, 28);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Nom : ");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(30, 60, 76, 28);

        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(150, 20, 160, 30);

        jTextField2.setText("jTextField2");
        jPanel1.add(jTextField2);
        jTextField2.setBounds(150, 60, 160, 30);

        jButton1.setText("chercher");
        jPanel1.add(jButton1);
        jButton1.setBounds(670, 50, 110, 50);

        jTextField3.setText("jTextField2");
        jPanel1.add(jTextField3);
        jTextField3.setBounds(450, 60, 160, 30);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Prenom : ");
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(330, 60, 99, 28);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
