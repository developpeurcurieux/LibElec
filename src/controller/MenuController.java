/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package controller;

import view.*;
/**
 *
 * @author kakashi
 */

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import package_groupe_ghislain.*;

public class MenuController implements Controller{
    String nomPanel = "Menu Principal";
    private MenuPanel menuPanel;
    private RootFrame rootFrame;
    
    public MenuController(RootFrame rootFrame) {
        this.rootFrame = rootFrame;
        updateFrame();
    }
    
    @Override
    public void updateFrame() {
        
        rootFrame.setVisible(false);
        
        menuPanel = new MenuPanel();
        menuPanel.setController(this);
        
        if(rootFrame.ifPanelExists(nomPanel)) {
            rootFrame.showPanel(nomPanel);
            rootFrame.setBounds(0, 0, 750, 500);
            rootFrame.setLocationRelativeTo(null);
            rootFrame.setResizable(false);
            rootFrame.setVisible(true);
        }
        else {
        rootFrame.addCard(menuPanel, nomPanel);
        rootFrame.showPanel(nomPanel);
        rootFrame.setBounds(0, 0, 750, 500);
        rootFrame.setLocationRelativeTo(null);
        rootFrame.setResizable(false);
        rootFrame.setVisible(true);
        }
    }
    
    public void consulterClient() {
        ClientController clientController = new ClientController(rootFrame, this);
    }
    
    public void consulterEditeur() {
     SwingTestController editeurController = new SwingTestController(rootFrame, "Editeur");   
    }
    
    public void consulterEmploye() {
     SwingTestController employeController = new SwingTestController(rootFrame, "Employe");   
    }
    
    
    public void consulterInfoLibrairie() {
     SwingTestController infoLibrairieController = new SwingTestController(rootFrame, "Infos Librairie");   
    }
    
    public void consulterPromotion() {
     SwingTestController PromotionController = new SwingTestController(rootFrame, "Promotion");   
    }
    
    
    public void consulterTva() {
    SwingTestController tvaController = new SwingTestController(rootFrame, "Tva");   
    }
    
    
//ghislain
    
    public void consulterTransporteur() {
        rootFrame.setVisible(false);
        rootFrame.setEnabled(false);
        
       Jf_Transporteur jf = new Jf_Transporteur();
       jf.setVisible(true);
    }
    
    
    public void consulterFraisPort() {
        consulterTransporteur();
    }
    
    
    
    
    
    @Override
    public void quitFrame() {
        rootFrame.setEnabled(false);
        rootFrame.setVisible(false);
        System.exit(0);
        
    }
    
    public void reloadMenuPrincipal() {
        rootFrame.setVisible(false);
        
        
        menuPanel.setController(this);
        
        
        rootFrame.showPanel(nomPanel);
        rootFrame.setBounds(0, 0, 750, 500);
        rootFrame.setLocationRelativeTo(null);
        rootFrame.setResizable(false);
        rootFrame.setVisible(true);
    }
    
    public RootFrame getRootFrame() {
        return this.rootFrame;
    }
        
}
