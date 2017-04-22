
package view;

import controller.*;
import java.awt.Color;

import java.awt.Font;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;




public class ConnectionFrame extends JFrame {
   
    private MainController mainController;
    //
    private javax.swing.JPanel bottom;
    private javax.swing.JPanel center;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel rootPane;
    private javax.swing.JPanel top;
    
    
    public ConnectionFrame() {
        initGuiLAF();
        initComponents();
       
    }
     
    private void initComponents() {

      
        
        
        
        rootPane = new javax.swing.JPanel();
        bottom = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        top = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        center = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        rootPane.setLayout(new java.awt.BorderLayout());

        bottom.setPreferredSize(new java.awt.Dimension(500, 100));
        bottom.setLayout(null);

        jButton2.setText("Quitter");
        bottom.add(jButton2);
        jButton2.setBounds(30, 10, 100, 40);

        rootPane.add(bottom, java.awt.BorderLayout.PAGE_END);
        top.setPreferredSize(new Dimension(500, 100));
        top.setLayout(new java.awt.GridLayout());
        

        jLabel1.setFont(new java.awt.Font("Droid Sans Mono", 0, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Bienvenue ");
//        Color lblColor = Color.decode("#838B8B");
//        Color lblColor = Color.decode("#4EB1BA");
        jLabel1.setForeground(Color.GRAY);
        top.add(jLabel1);

        rootPane.add(top, java.awt.BorderLayout.NORTH);

        center.setLayout(null);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setToolTipText("login");
        center.add(jTextField2);
        jTextField2.setBounds(125, 70, 250, 40);

        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setToolTipText("password");
        
        
        
        center.add(jPasswordField1);
        jPasswordField1.setBounds(125, 150, 250, 40);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User :");
        Color usrColor = Color.decode("#838B8B");
        jLabel2.setForeground(usrColor);
        
        
        
        center.add(jLabel2);
        jLabel2.setBounds(50, 70, 60, 40);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password :");
        Color pswColor = Color.decode("#838B8B");
        jLabel3.setForeground(pswColor);
       
        
        
        center.add(jLabel3);
        jLabel3.setBounds(20, 150, 90, 40);

        jButton1.setText("Se connecter");
        center.add(jButton1);
        jButton1.setBounds(310, 220, 130, 40);
        
        center.setPreferredSize(new Dimension(500, 300));
       // center.setForeground(lblColor);
   
        rootPane.add(center, java.awt.BorderLayout.CENTER);

        getContentPane().add(rootPane);
        rootPane.setBounds(0, 0, 500, 500);

        pack();
        //rootPane.setForeground(Color.BLACK);
        this.setBounds(0, 0, 500, 500);
        this.setLocationRelativeTo(null);
    }                        

   
    public void initGuiLAF() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConnectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    
    public void setController(MainController mainController) {
        this.mainController = mainController;
    }
    
    
   
   
}
