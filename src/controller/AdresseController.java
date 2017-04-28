package controller;

/**
 *
 * @author testo
 */

import view.RootFrame;
import view.AdressePanel;
import util_dao.AdresseDB;
import view.AdressePanel;
import model_db.Adresse;


public class AdresseController implements Controller{
    private RootFrame rootFrame;
    private MenuController menuController;
    private AdressePanel adressePanel;
    private AdresseDB adresseDB;
    private Adresse adresse;
    private long clientId;
    
    
    public AdresseController(RootFrame rootFrame, long clientId) {
        this.rootFrame = rootFrame;
        this.clientId = clientId;
        updateFrame();
    }
    
    
    
    @Override
    public void updateFrame() {
        String nomPanel = "Adresses";
        
        rootFrame.setVisible(false);
        
        adressePanel = new AdressePanel(nomPanel, clientId);
        adressePanel.setController(this);
        
        
        if(rootFrame.ifPanelExists(nomPanel)) {
        
        rootFrame.showPanel(nomPanel);
        rootFrame.setBounds(0, 0, 950, 800);
        rootFrame.setLocationRelativeTo(null);
        rootFrame.setResizable(false);
        rootFrame.setVisible(true);
        }
        else {
            
        rootFrame.addCard(adressePanel, nomPanel);
        rootFrame.showPanel(nomPanel);
        rootFrame.setBounds(0, 0, 950, 800);
        rootFrame.setLocationRelativeTo(null);
        rootFrame.setResizable(false);
        rootFrame.setVisible(true);
        }
        
        
        
    }
    
    
    public void revenirRubriqueClient() {
        menuController = new MenuController(rootFrame);
        menuController.consulterClient();
    }
    
    @Override
    public void quitFrame() {
           rootFrame.setEnabled(false);
        rootFrame.setVisible(false);
        System.exit(0);
    }
}