/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.BackendMenu;
/**
 *
 * @author kakashi
 */
public class UpdateController {
    private BackendMenu updateFrame;
    
    
    public UpdateController(BackendMenu updateFrame) {
        this.updateFrame = updateFrame;
        updateFrame.setController(this);
        updateFrame.setVisible(true);
    }
}
