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
        
}
