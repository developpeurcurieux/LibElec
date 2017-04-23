
package view;

import controller.*;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;




public class RootFrame extends JFrame {
    
    private Controller controller;
    private ConnectionPanel connectionPanel;
    //
    private CardLayout cards;
    private JPanel cardPanel;
    
    public RootFrame() {
        initGuiLAF();
        initialize();
        
        
    }
    
    public void initialize() {
        
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        
        cards = new CardLayout();
        cardPanel = new JPanel();
        cardPanel.setLayout(cards);
        
       
        this.add(cardPanel, BorderLayout.CENTER);
        pack();
        
        this.setBounds(0, 0, 500, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
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
            java.util.logging.Logger.getLogger(RootFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RootFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RootFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RootFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    
        
    public void addCard(JPanel jPanel, String namePanel) {
                
        cardPanel.add(jPanel, namePanel);
       
    }
    
    public void showPanel() {
        cards.show(cardPanel, "menu principal");
        
    }
    
}
