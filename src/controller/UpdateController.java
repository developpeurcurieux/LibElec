/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.UpdateFrame;
/**
 *
 * @author kakashi
 */
public class UpdateController {
    private UpdateFrame updateFrame;
    
    
    public UpdateController(UpdateFrame updateFrame) {
        this.updateFrame = updateFrame;
        updateFrame.setController(this);
        updateFrame.setVisible(true);
    }
}
