/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package view;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.Color;


import java.awt.Font;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class ConnectionPanel extends JPanel {
    private Controller controller;
    //
    private JPanel bottom;
    private JPanel center;
    private JButton jButton1;
    private JButton btnQuit;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPasswordField jPasswordField1;
    private JTextField jTextField2;
    private JPanel top;
    
    
    public ConnectionPanel() {
        
        initComponents();
        
    }
    
    private void initComponents() {
        this.setLayout(new BorderLayout());
        
        bottom = new JPanel();
        btnQuit = new JButton();
        top = new JPanel();
        jLabel1 = new JLabel();
        center = new JPanel();
        jTextField2 = new JTextField();
        jPasswordField1 = new JPasswordField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jButton1 = new JButton();
        
        
        
        bottom.setPreferredSize(new Dimension(500, 100));
        bottom.setLayout(null);
        
        btnQuit.setText("Quitter");
        bottom.add(btnQuit);
        btnQuit.addActionListener(e -> quitter());
        
        btnQuit.setBounds(30, 10, 100, 40);
        
        this.add(bottom, BorderLayout.PAGE_END);
        top.setPreferredSize(new Dimension(500, 100));
        top.setLayout(new GridLayout());
        
        
        jLabel1.setFont(new Font("Droid Sans Mono", 0, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText(" Bienvenue ");
        
        Color lblColor = Color.decode("#4EB1BA");
        jLabel1.setForeground(lblColor);
        top.add(jLabel1);
        
        this.add(top, BorderLayout.NORTH);
        
        center.setLayout(null);
        
        jTextField2.setHorizontalAlignment(JTextField.CENTER);
        jTextField2.setToolTipText("login");
        center.add(jTextField2);
        jTextField2.setBounds(125, 70, 250, 40);
        
        jPasswordField1.setHorizontalAlignment(JTextField.CENTER);
        jPasswordField1.setToolTipText("password");
        
        
        
        center.add(jPasswordField1);
        jPasswordField1.setBounds(125, 150, 250, 40);
        
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("User :");
        Color usrColor = Color.decode("#838B8B");
        jLabel2.setForeground(usrColor);
        
        
        
        center.add(jLabel2);
        jLabel2.setBounds(50, 70, 60, 40);
        
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Password :");
        Color pswColor = Color.decode("#838B8B");
        jLabel3.setForeground(pswColor);
        
        
        
        center.add(jLabel3);
        jLabel3.setBounds(20, 150, 90, 40);
        
        jButton1.setText("Se connecter");
        jButton1.addActionListener(e -> seConnecter());
        center.add(jButton1);
        jButton1.setBounds(310, 220, 130, 40);
        
        center.setPreferredSize(new Dimension(500, 300));
        
        
        this.add(center, BorderLayout.CENTER);
        
        
        this.setBounds(0, 0, 500, 500);
        
        
    }
    public void setController(Controller controller) {
        this.controller = controller;
    }
        
    public void seConnecter() {
        controller.updateFrame();
    }
    
    public void quitter() {
        controller.quitFrame();
    }
}