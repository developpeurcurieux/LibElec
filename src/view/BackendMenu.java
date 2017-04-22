/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package view;
import ztmpview.MenuFrame;
import controller.UpdateController;
//
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
//
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

public class BackendMenu extends JFrame{
    private UpdateController updateController;
    //
    private JPanel Bottom;
    private JPanel Center;
    private JPanel Left;
    private JPanel Right;
    private JPanel RootPane;
    private JPanel Top;
    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton15;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    
    
    public BackendMenu() {
        initComponents();
        initGuiLAF();
    }

    
    private void initComponents() {

        RootPane = new JPanel();
        Right = new JPanel();
        jLabel2 = new JLabel();
        jButton6 = new JButton();
        jButton8 = new JButton();
        jButton7 = new JButton();
        jButton14 = new JButton();
        jButton15 = new JButton();
        jButton13 = new JButton();
        jButton9 = new JButton();
        Left = new JPanel();
        jLabel4 = new JLabel();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton5 = new JButton();
        jButton4 = new JButton();
        jButton10 = new JButton();
        jButton11 = new JButton();
        jButton12 = new JButton();
        Top = new JPanel();
        jLabel1 = new JLabel();
        Bottom = new JPanel();
        jButton1 = new JButton();
        Center = new JPanel();
        jLabel3 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        RootPane.setPreferredSize(new Dimension(600, 600));
        RootPane.setLayout(new BorderLayout());

        Right.setPreferredSize(new Dimension(130, 300));
        Right.setLayout(new GridLayout(10, 0));

        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Gestion Interne");
        Right.add(jLabel2);

        jButton6.setText("Livre");
        Right.add(jButton6);

        jButton8.setText("Auteur");
        Right.add(jButton8);

        jButton7.setText("Theme");
        Right.add(jButton7);

        jButton14.setText("Editeur");
        Right.add(jButton14);

        jButton15.setText("Mot-cles");
        Right.add(jButton15);

        jButton13.setText("Employe");
        Right.add(jButton13);

        jButton9.setText("Tva");
        Right.add(jButton9);

        RootPane.add(Right, BorderLayout.LINE_END);

        Left.setPreferredSize(new Dimension(130, 300));
        Left.setLayout(new GridLayout(10, 0, 5, 0));

        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("Gestion externe");
        Left.add(jLabel4);

        jButton2.setText("Avis");
        jButton2.setMinimumSize(new Dimension(58, 40));
        jButton2.setPreferredSize(new Dimension(58, 35));
        Left.add(jButton2);

        jButton3.setText("Promotion");
        Left.add(jButton3);

        jButton5.setText("Commande");
        Left.add(jButton5);

        jButton4.setText("Client");
        Left.add(jButton4);

        jButton10.setText("Frais de port");
        Left.add(jButton10);

        jButton11.setText("Transporteur");
        Left.add(jButton11);

        jButton12.setText("Adresse");
        Left.add(jButton12);

        RootPane.add(Left, BorderLayout.LINE_START);

        Top.setPreferredSize(new Dimension(850, 60));
        Top.setLayout(null);

        jLabel1.setFont(new Font("Droid Sans Mono", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("MENU PRINCIPAL");
        Top.add(jLabel1);
        jLabel1.setBounds(-1, 5, 750, 40);

        RootPane.add(Top, BorderLayout.PAGE_START);

        Bottom.setPreferredSize(new Dimension(850, 60));
        Bottom.setLayout(new GridLayout());

        jButton1.setText("Quitter");
        Bottom.add(jButton1);

        RootPane.add(Bottom, BorderLayout.PAGE_END);

        Center.setLayout(null);

        jLabel3.setIcon(new ImageIcon("/home/kakashi/LibElec/res/backendMenu.jpg"));
        Center.add(jLabel3);
        jLabel3.setBounds(30, 0, 430, 350);

        RootPane.add(Center, BorderLayout.CENTER);

        getContentPane().add(RootPane);
        RootPane.setBounds(0, 0, 750, 500);
        pack();
        this.setBounds(0, 0, 750, 500);
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
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    
    public void setController(UpdateController updateController) {
        this.updateController = updateController;
    }
    
}
