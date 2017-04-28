/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import package_goupe_maxime.PromotionJPanel;
import package_goupe_maxime.TvaJPanel;
import package_goupe_maxime.EditeurJPanel;
import package_goupe_maxime.InfoLibrairieJPanel;
import package_goupe_maxime.EmployeJPanel;
import javax.swing.JFrame;
import view.RootFrame;

/**
 *
 * @author kakashi
 */
public class SwingTestController implements Controller{
    private RootFrame rootFrame;
    private String nomPanel;
    
    public SwingTestController(RootFrame rootFrame, String nomPanel) {
        this.rootFrame = rootFrame;
        this.nomPanel = nomPanel;
        
        callPanel(nomPanel);
             
        
    }
    
    public void callPanel(String nomPanel) {
     switch(nomPanel) {
         case "Editeur": panelEditeur();
         break;
         case "Employe": panelEmploye();
         break;
         case "Infos Librairie": panelInfoLibrairie();
         break;
         case "Promotion": panelPromotion();
         break;
         case "Tva": panelTva();
         break;
     }
        
        
    }
    
    public void panelEditeur() {
        rootFrame.setVisible(false);
        
        EditeurJPanel editorJPanel = new EditeurJPanel(rootFrame);
        editorJPanel.setController(this);
        
        if(rootFrame.ifPanelExists(nomPanel)) {
            rootFrame.showPanel(nomPanel);
            rootFrame.setBounds(0, 0, 950, 800);
            rootFrame.setLocationRelativeTo(null);
            rootFrame.setResizable(false);
            rootFrame.setVisible(true);
        }
        else {
        rootFrame.addCard(editorJPanel, nomPanel);
        rootFrame.showPanel(nomPanel);
        rootFrame.setBounds(0, 0, 950, 800);
        rootFrame.setLocationRelativeTo(null);
        rootFrame.setResizable(false);
        rootFrame.setVisible(true);
        }
    }
     
    public void panelEmploye() {
        rootFrame.setVisible(false);
        
        EmployeJPanel employeJPanel = new EmployeJPanel(rootFrame);
//        employeJPanel.setController(this);
        
        if(rootFrame.ifPanelExists(nomPanel)) {
            rootFrame.showPanel(nomPanel);
            rootFrame.setBounds(0, 0, 950, 800);
            rootFrame.setLocationRelativeTo(null);
            rootFrame.setResizable(false);
            rootFrame.setVisible(true);
        }
        else {
        rootFrame.addCard(employeJPanel, nomPanel);
        rootFrame.showPanel(nomPanel);
        rootFrame.setBounds(0, 0, 950, 800);
        rootFrame.setLocationRelativeTo(null);
        rootFrame.setResizable(false);
        rootFrame.setVisible(true);
        }
    }
    
    public void panelInfoLibrairie() {
        rootFrame.setVisible(false);
        
        InfoLibrairieJPanel infoJPanel = new InfoLibrairieJPanel(rootFrame);
//        InfoLibrairieJPanel.setController(this);
        
        if(rootFrame.ifPanelExists(nomPanel)) {
            rootFrame.showPanel(nomPanel);
            rootFrame.setBounds(0, 0, 950, 800);
            rootFrame.setLocationRelativeTo(null);
            rootFrame.setResizable(false);
            rootFrame.setVisible(true);
        }
        else {
        rootFrame.addCard(infoJPanel, nomPanel);
        rootFrame.showPanel(nomPanel);
        rootFrame.setBounds(0, 0, 950, 800);
        rootFrame.setLocationRelativeTo(null);
        rootFrame.setResizable(false);
        rootFrame.setVisible(true);
        }
    }
    
    public void panelPromotion() {
        rootFrame.setVisible(false);
        
        PromotionJPanel promotionJPanel = new PromotionJPanel(rootFrame);
//        PromotionJPanel.setController(this);
        
        if(rootFrame.ifPanelExists(nomPanel)) {
            rootFrame.showPanel(nomPanel);
            rootFrame.setBounds(0, 0, 950, 800);
            rootFrame.setLocationRelativeTo(null);
            rootFrame.setResizable(false);
            rootFrame.setVisible(true);
        }
        else {
        rootFrame.addCard(promotionJPanel, nomPanel);
        rootFrame.showPanel(nomPanel);
        rootFrame.setBounds(0, 0, 950, 800);
        rootFrame.setLocationRelativeTo(null);
        rootFrame.setResizable(false);
        rootFrame.setVisible(true);
        }
    }
    
    public void panelTva() {
        rootFrame.setVisible(false);
        
        TvaJPanel tvaJPanel = new TvaJPanel(rootFrame);
//        TvaJPanel.setController(this);
        
        if(rootFrame.ifPanelExists(nomPanel)) {
            rootFrame.showPanel(nomPanel);
            rootFrame.setBounds(0, 0, 950, 800);
            rootFrame.setLocationRelativeTo(null);
            rootFrame.setResizable(false);
            rootFrame.setVisible(true);
        }
        else {
        rootFrame.addCard(tvaJPanel, nomPanel);
        rootFrame.showPanel(nomPanel);
        rootFrame.setBounds(0, 0, 950, 800);
        rootFrame.setLocationRelativeTo(null);
        rootFrame.setResizable(false);
        rootFrame.setVisible(true);
        }
    }
    
    
     
     
     
     
     
     
     
     
    @Override
    public void updateFrame() {
        
        rootFrame.setVisible(false);
        
        EditeurJPanel editorJPanel = new EditeurJPanel(rootFrame);
        editorJPanel.setController(this);
        
        if(rootFrame.ifPanelExists(nomPanel)) {
            rootFrame.showPanel(nomPanel);
            rootFrame.setBounds(0, 0, 950, 800);
            rootFrame.setLocationRelativeTo(null);
            rootFrame.setResizable(false);
            rootFrame.setVisible(true);
        }
        else {
        rootFrame.addCard(editorJPanel, nomPanel);
        rootFrame.showPanel(nomPanel);
        rootFrame.setBounds(0, 0, 950, 800);
        rootFrame.setLocationRelativeTo(null);
        rootFrame.setResizable(false);
        rootFrame.setVisible(true);
        }
    }

    @Override
    public void quitFrame() {
      
    }
    
}
