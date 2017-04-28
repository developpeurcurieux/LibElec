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
import javax.swing.JFrame;

public class ClientController implements Controller{
    private RootFrame rootFrame;
    private MenuController menuController;
    private ClientPanel clientPanel;
    private ClientDB clientDB;
    
    
    public ClientController(RootFrame rootFrame, MenuController menuController) {
        this.rootFrame = rootFrame;
        this.menuController = menuController;
        updateFrame();
       
    }
    
    public void consulterLesAdresses(long id) {
        AdresseController adresseController = new AdresseController(rootFrame, id);
    }
    
    public void consulterLesDestinataires(long id) {
        DestinataireController destinataireController = new DestinataireController(rootFrame, id);
    }
    
    
    public void validerChoix() {
        
        
    }
    
    public void retourMenuPrincipal() {
     menuController.reloadMenuPrincipal();
    }
    
    @Override
    public void updateFrame() {
        String nomPanel = "Client";
        rootFrame.setVisible(false);
        
        clientPanel = new ClientPanel(nomPanel);
        clientPanel.setController(this);
        clientDB = new ClientDB();
       
        if(rootFrame.ifPanelExists(nomPanel)) {
        
        rootFrame.showPanel(nomPanel);
        rootFrame.setBounds(0, 0, 950, 800);
        rootFrame.setLocationRelativeTo(null);
        rootFrame.setResizable(false);
        rootFrame.setVisible(true);
        }
        else {
            
        rootFrame.addCard(clientPanel, nomPanel);
        rootFrame.showPanel(nomPanel);
        rootFrame.setBounds(0, 0, 950, 800);
        rootFrame.setLocationRelativeTo(null);
        rootFrame.setResizable(false);
        rootFrame.setVisible(true);
        }
        
    }
    
    @Override
    public void quitFrame() {
         rootFrame.setEnabled(false);
        rootFrame.setVisible(false);
        System.exit(0);
        
    }
    
    
}
