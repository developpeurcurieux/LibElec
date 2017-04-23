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
        
        rootFrame.addCard(menuPanel, "menu principal");
        rootFrame.showPanel("menu principal");
        rootFrame.setBounds(0, 0, 750, 500);
        rootFrame.setLocationRelativeTo(null);
        rootFrame.setResizable(false);
        rootFrame.setVisible(true);
    }
    
    public void consulterClient() {
        ClientController clientController = new ClientController(rootFrame);
    }
    
    
    
    @Override
    public void quitFrame() {
        rootFrame.setEnabled(false);
        rootFrame.setVisible(false);
        System.exit(0);
        
    }
}
