/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;
import model.*;
import view.*;
import controller.*;
/**
 *
 * @author testo
 */
public class Main {
    public static void main(String[] args) {
        WelcomeModel welcomeModel = new WelcomeModel();
        WelcomeFrame welcomeFrame = new WelcomeFrame();
        
        MainController mainController = new MainController(welcomeModel, welcomeFrame);
        
        
    }
}