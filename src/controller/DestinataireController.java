/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model_db.Destinataire;
import util_dao.DestinataireDB;
import view.DestinatairePanel;
import view.RootFrame;

/**
 *
 * @author kakashi
 */
public class DestinataireController implements Controller {
     private RootFrame rootFrame;
    private MenuController menuController;
    private DestinatairePanel destinatairePanel;
    private DestinataireDB destinataireDB;
    private Destinataire destinataire;
    private long clientId;
    
    public DestinataireController(RootFrame rootFrame, long clientId) {
        this.rootFrame = rootFrame;
        this.clientId = clientId;
        updateFrame();
        
    }
    
    public void revenirRubriqueClient() {
        menuController = new MenuController(rootFrame);
        menuController.consulterClient();
    }
    
    @Override
    public void updateFrame() {
       
        String nomPanel = "Destinataire";
        rootFrame.setVisible(false);
        
        destinatairePanel = new DestinatairePanel(nomPanel);
        destinatairePanel.setController(this);
        destinataireDB = new DestinataireDB();
        
        rootFrame.addCard(destinatairePanel, nomPanel);
        rootFrame.showPanel(nomPanel);
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
