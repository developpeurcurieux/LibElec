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
        ConnectionModel connectionModel = new ConnectionModel();
        RootFrame rootFrame = new RootFrame();
        
        ConnectionController connectionController = new ConnectionController(connectionModel, rootFrame);
        
        
    }
}
