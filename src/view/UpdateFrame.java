/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package view;
import controller.UpdateController;

import javax.swing.JFrame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

public class UpdateFrame extends JFrame{
    
    private JPanel jPanel2;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JSplitPane jSplitPane1;
    private JTable jTable1;
    private JTree jTree1;
    private UpdateController updateController;
    
    public UpdateFrame() {
        initGuiLAF();
        initComponents();
    }
    
        
    private void initComponents() {
        
        jSplitPane1 = new JSplitPane();
        jScrollPane2 = new JScrollPane();
        jTree1 = new JTree();
        jPanel2 = new JPanel();
        jScrollPane3 = new JScrollPane();
        jTable1 = new JTable();
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        
        jScrollPane2.setViewportView(jTree1);
        
        jSplitPane1.setLeftComponent(jScrollPane2);
       
       
        
        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(0, 0, 810, 340);
        
        jSplitPane1.setRightComponent(jPanel2);
        
        getContentPane().add(jSplitPane1);
        jSplitPane1.setBounds(0, 0, 900, 680);
        
        setBounds(0, 0, 914, 713);
    }
    
    private void initGuiLAF() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateFrame().setVisible(true);
            }
        });
    }
    
    public void setController(UpdateController updateController) {
        this.updateController = updateController;
    }
    
}
