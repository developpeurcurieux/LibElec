
package controller;
import model.*;
import view.*;

public class MainController {
  private WelcomeModel welcomeModel;
  private WelcomeFrame welcomeFrame;
  
  public MainController(WelcomeModel welcomeModel, WelcomeFrame welcomeFrame) {
      this.welcomeModel = welcomeModel;
      this.welcomeFrame = welcomeFrame;
      welcomeFrame.setVisible(true);
                    
  }
  
  
  
}
