
package controller;
import model.*;
import view.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConnectionController implements Controller {
  private ConnectionModel connectionModel;
  private RootFrame rootFrame;
  
  public ConnectionController(ConnectionModel connectionModel, RootFrame rootFrame) {
      this.connectionModel = connectionModel;
      this.rootFrame = rootFrame;
      rootFrame.setController(this);
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
//      rootFrame.setEnabled(false);
      //getContentPane().removeAll();
//getContentPane().repaint();

      MenuController menuController = new MenuController(rootFrame);
      

  }
  
}
