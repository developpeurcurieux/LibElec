
package controller;
import model.*;
import view.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainController {
  private WelcomeModel welcomeModel;
  private WelcomeFrame welcomeFrame;
  
  public MainController(WelcomeModel welcomeModel, WelcomeFrame welcomeFrame) {
      this.welcomeModel = welcomeModel;
      this.welcomeFrame = welcomeFrame;
      welcomeFrame.setController(this);
      welcomeFrame.setVisible(true);
  }
  
  
  
  
  
  
  public void quit() {
      welcomeFrame.setEnabled(false);
      welcomeFrame.setVisible(false);
      System.exit(0);
  }

  public void changeFrames() {
      welcomeFrame.setEnabled(false);
      welcomeFrame.setVisible(false);
      //
      UpdateFrame updateFrame = new UpdateFrame();
      UpdateController updateController = new UpdateController(updateFrame);
      

  }
      
  
  
  
}
