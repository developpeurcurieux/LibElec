
package controller;

import view.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConnectionController implements Controller {

  private RootFrame rootFrame;
  private ConnectionPanel connectionPanel;
  
  public ConnectionController(RootFrame rootFrame) {
           this.rootFrame = rootFrame;
           connectionPanel = new ConnectionPanel();
           connectionPanel.setController(this);
      
           rootFrame.addCard(connectionPanel, "connection");
           rootFrame.setVisible(true);
  }
  

  @Override
  public void quitFrame() {
      rootFrame.setEnabled(false);
      rootFrame.setVisible(false);
      System.exit(0);
  }

  @Override
  public void updateFrame() {
     
      MenuController menuController = new MenuController(rootFrame);
      

  }
  
}
