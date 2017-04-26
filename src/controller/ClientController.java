/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author testo
 */

import view.RootFrame;
import view.ClientPanel;
import util_dao.ClientDB;


public class ClientController implements Controller{
    private RootFrame rootFrame;
    private ClientPanel clientPanel;
    private ClientDB clientDB;
    
    public ClientController(RootFrame rootFrame) {
        this.rootFrame = rootFrame;
        updateFrame();
       
    }
    
    public void validerChoix() {
        
        
    }
    
    @Override
    public void updateFrame() {
      
        rootFrame.setVisible(false);
        
        clientPanel = new ClientPanel("RubriqueClient");
        clientPanel.setController(this);
        
        rootFrame.addCard(clientPanel, "rubrique client");
        rootFrame.showPanel("rubrique client");
        rootFrame.setBounds(0, 0, 950, 800);
        rootFrame.setLocationRelativeTo(null);
        rootFrame.setResizable(false);
        rootFrame.setVisible(true);
    }
    
    @Override
    public void quitFrame() {
         rootFrame.setEnabled(false);
        rootFrame.setVisible(false);
        System.exit(0);
        
    }
}
