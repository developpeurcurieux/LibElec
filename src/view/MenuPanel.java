/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package view;

import controller.MenuController;
//
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
//
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class MenuPanel extends JPanel{
    private MenuController menuController;
    //
    private JPanel Bottom;
    private JPanel Center;
    private JPanel Left;
    private JPanel Right;
    
    private JPanel Top;
    private JButton btnQuit;
    private JButton btnQuit0;
    private JButton btnQuit1;
    private JButton btnQuit2;
    private JButton btnQuit3;
    private JButton btnQuit4;
    private JButton btnQuit5;
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
    
    
    public MenuPanel() {
        initComponents();
       
    }

    
    private void initComponents() {

        
        Right = new JPanel();
        jLabel2 = new JLabel();
        jButton6 = new JButton();
        jButton8 = new JButton();
        jButton7 = new JButton();
        btnQuit4 = new JButton();
        btnQuit5 = new JButton();
        btnQuit3 = new JButton();
        jButton9 = new JButton();
        Left = new JPanel();
        jLabel4 = new JLabel();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton5 = new JButton();
        jButton4 = new JButton();
        btnQuit0 = new JButton();
        btnQuit1 = new JButton();
        btnQuit2 = new JButton();
        Top = new JPanel();
        jLabel1 = new JLabel();
        Bottom = new JPanel();
        btnQuit = new JButton();
        Center = new JPanel();
        jLabel3 = new JLabel();

        this.setPreferredSize(new Dimension(600, 600));
        this.setLayout(new BorderLayout());

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

        btnQuit4.setText("Editeur");
        Right.add(btnQuit4);

        btnQuit5.setText("Mot-cles");
        Right.add(btnQuit5);

        btnQuit3.setText("Employe");
        Right.add(btnQuit3);

        jButton9.setText("Tva");
        Right.add(jButton9);

        this.add(Right, BorderLayout.LINE_END);

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

        btnQuit0.setText("Frais de port");
        Left.add(btnQuit0);

        btnQuit1.setText("Transporteur");
        Left.add(btnQuit1);

        btnQuit2.setText("Adresse");
        Left.add(btnQuit2);

        this.add(Left, BorderLayout.LINE_START);

        Top.setPreferredSize(new Dimension(850, 60));
        Top.setLayout(null);

        jLabel1.setFont(new Font("Droid Sans Mono", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("MENU PRINCIPAL");
        Top.add(jLabel1);
        jLabel1.setBounds(-1, 5, 750, 40);

        this.add(Top, BorderLayout.PAGE_START);

        Bottom.setPreferredSize(new Dimension(850, 40));
        Bottom.setLayout(new GridLayout());

        btnQuit.setText("Quitter");
        btnQuit.addActionListener(e -> quitter());
        Bottom.add(btnQuit);

        this.add(Bottom, BorderLayout.PAGE_END);

        Center.setLayout(null);

        jLabel3.setIcon(new ImageIcon("/home/kakashi/LibElec/res/backendMenu.jpg"));
        Center.add(jLabel3);
        jLabel3.setBounds(30, 0, 430, 350);

        this.add(Center, BorderLayout.CENTER);

       
        this.setBounds(0, 0, 750, 500);
      
                          
    }

    
    public void setController(MenuController menuController) {
        this.menuController = menuController;
    }
    
    public void quitter() {
        menuController.quitFrame();
    }
}
