/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.DestinataireController;
/**
 *
 * @author kakashi
 */
public class DestinatairePanel extends AbstractRubriquePanel{
    private DestinataireController destinataireController;
    
    private JPanel bottom;
    private ButtonGroup buttonGroup1;
    private JPanel center;
    private JButton btnSearch;
    private JButton jButton2;
    private JButton jButton3;
    private JButton btnQuit;
    private JButton btnMenuPrincipal;
    private JButton btnReactualiser;
    private JButton jButton7;
    private JButton jButton8;
    private JComboBox jComboBox1;
    private JLabel lblRubrique;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JSeparator jSeparator1;
    private JTable jTable2;
    private JTextArea jTextArea1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JPanel left;
    private JPanel top;
    
    public DestinatairePanel(String rubrique) {
        super(rubrique);
        initComponents();
    }
    
    public void initComponents() {
     btnMenuPrincipal = super.getBtnMenuPrincipal();
     btnMenuPrincipal.addActionListener(e -> destinataireController.revenirRubriqueClient());
     
     btnQuit = super.getBtnQuit();
     btnQuit.addActionListener(e -> destinataireController.quitFrame());
        
      jButton7 = super.getjButton7();
        jButton7.setVisible(false);
        jButton7.setEnabled(false);
        
        jButton8 = super.getjButton8();
        jButton8.setVisible(false);
        jButton8.setEnabled(false);
        
    }

    
    
    
    @Override
    public void setRubrique(String rubrique) {
        super.setRubrique(rubrique); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getRubrique() {
        return super.getRubrique(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjTextField4(JTextField jTextField4) {
        super.setjTextField4(jTextField4); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JTextField getjTextField4() {
        return super.getjTextField4(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjTextField3(JTextField jTextField3) {
        super.setjTextField3(jTextField3); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JTextField getjTextField3() {
        return super.getjTextField3(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjTextField2(JTextField jTextField2) {
        super.setjTextField2(jTextField2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JTextField getjTextField2() {
        return super.getjTextField2(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjTextField1(JTextField jTextField1) {
        super.setjTextField1(jTextField1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JTextField getjTextField1() {
        return super.getjTextField1(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjTextArea1(JTextArea jTextArea1) {
        super.setjTextArea1(jTextArea1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JTextArea getjTextArea1() {
        return super.getjTextArea1(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjTable2(JTable jTable2) {
        super.setjTable2(jTable2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JTable getjTable2() {
        return super.getjTable2(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjRadioButton3(JRadioButton jRadioButton3) {
        super.setjRadioButton3(jRadioButton3); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JRadioButton getjRadioButton3() {
        return super.getjRadioButton3(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjRadioButton2(JRadioButton jRadioButton2) {
        super.setjRadioButton2(jRadioButton2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JRadioButton getjRadioButton2() {
        return super.getjRadioButton2(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjRadioButton1(JRadioButton jRadioButton1) {
        super.setjRadioButton1(jRadioButton1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JRadioButton getjRadioButton1() {
        return super.getjRadioButton1(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjLabel3(JLabel jLabel3) {
        super.setjLabel3(jLabel3); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JLabel getjLabel3() {
        return super.getjLabel3(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjLabel2(JLabel jLabel2) {
        super.setjLabel2(jLabel2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JLabel getjLabel2() {
        return super.getjLabel2(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLblRubrique(JLabel lblRubrique) {
        super.setLblRubrique(lblRubrique); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JLabel getLblRubrique() {
        return super.getLblRubrique(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjComboBox1(JComboBox jComboBox1) {
        super.setjComboBox1(jComboBox1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JComboBox getjComboBox1() {
        return super.getjComboBox1(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBtnReactualiser(JButton btnReactualiser) {
        super.setBtnReactualiser(btnReactualiser); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton getBtnReactualiser() {
        return super.getBtnReactualiser(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBtnMenuPrincipal(JButton btnMenuPrincipal) {
        super.setBtnMenuPrincipal(btnMenuPrincipal); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton getBtnMenuPrincipal() {
        return super.getBtnMenuPrincipal(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBtnQuit(JButton btnQuit) {
        super.setBtnQuit(btnQuit); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton getBtnQuit() {
        return super.getBtnQuit(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjButton3(JButton jButton3) {
        super.setjButton3(jButton3); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton getjButton3() {
        return super.getjButton3(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjButton2(JButton jButton2) {
        super.setjButton2(jButton2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton getjButton2() {
        return super.getjButton2(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBtnSearch(JButton btnSearch) {
        super.setBtnSearch(btnSearch); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton getBtnSearch() {
        return super.getBtnSearch(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjButton8(JButton jButton8) {
        super.setjButton8(jButton8); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton getjButton8() {
        return super.getjButton8(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjButton7(JButton jButton7) {
        super.setjButton7(jButton7); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton getjButton7() {
        return super.getjButton7(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setController(DestinataireController destinataireController) {
     this.destinataireController = destinataireController;   
    }
    
    
}
