
package view;

import controller.*;

import java.awt.Font;
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




public class WelcomeFrame extends JFrame {
    private JButton btnValider;
    private JButton btnQuitter;
    private JLabel lblBienvenue;
    private JPanel jPanel1;
    private JPasswordField jPswField;
    private JTextField jTextField1;
    private MainController mainController;
    
    
    
    public WelcomeFrame() {
        initGuiLAF();
        initComponents();
       
    }
     
    private void initComponents() {

        jPanel1 = new JPanel();
        lblBienvenue = new JLabel();
        jTextField1 = new JTextField();
        jPswField = new JPasswordField();
        btnValider = new JButton();
        btnQuitter = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        lblBienvenue.setFont(new Font("Droid Sans Mono", 1, 18)); // NOI18N
        lblBienvenue.setHorizontalAlignment(SwingConstants.CENTER);
        lblBienvenue.setText("Bienvenue LibElec");
        jPanel1.add(lblBienvenue);
        lblBienvenue.setBounds(150, 45, 250, 40);

        jTextField1.setHorizontalAlignment(JTextField.CENTER);
        jTextField1.setText("Login");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(160, 220, 220, 40);

        jPswField.setHorizontalAlignment(JTextField.CENTER);
        jPswField.setText("*******************");
        jPanel1.add(jPswField);
        jPswField.setBounds(159, 271, 220, 40);

        btnValider.setText("valider");
        
        jPanel1.add(btnValider);
        btnValider.setBounds(310, 330, 78, 31);
        
        btnValider.addActionListener(e -> mainController.changeFrames());

        btnQuitter.setText("quitter");
        
        jPanel1.add(btnQuitter);
        btnQuitter.setBounds(30, 430, 79, 31);
        
        btnQuitter.addActionListener(e -> mainController.quit());

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 500);

        setBounds(0, 0, 510, 530);
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
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    
    public void setController(MainController mainController) {
        this.mainController = mainController;
    }
    
    
   
   
}
