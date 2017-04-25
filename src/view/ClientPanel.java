
package view;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
//
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
//
import controller.ClientController;
import java.util.Vector;
import util_db.ClientDB;
import model_db_tables.Client;


public class ClientPanel extends AbstractRubriquePanel {
 private JPanel bottom;
    private ButtonGroup buttonGroup1;
    private JPanel center;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
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
    //
    private String rubrique;
    private ClientController clientController;
    private ClientDB clientDB;
    private Client client;
    //
    private Vector listeClients;
    private Vector attClient;
    
    
    public ClientPanel(String rubrique) {
        super(rubrique);
        initComponents();
    }
    
    public void initComponents() {
        client = new Client();
        clientDB = new ClientDB();
       
        attClient = new Vector();
        attClient.add("cliGenre");
        attClient.add(" cliPrenom");
        attClient.add("cliNom");
        attClient.add(" cliEmail");
        attClient.add(" cliMdp");
        attClient.add( " cliDateAdhesion");
        attClient.add(" cliTelF");
        attClient.add(" cliTelM");
        attClient.add("cliStatut");
        attClient.add("cliChampLibre"); 
        
        listeClients = clientDB.loadClientOfDB();
        
                
        attClient.add(listeClients);
        
//        Vector v = new Vector;
        
      
        
        DefaultTableModel clientTable = new DefaultTableModel(listeClients, attClient);
        
        jTable2 = getjTable2();
        jTable2.setModel(clientTable);
        
        
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
    public void setjButton5(JButton jButton5) {
        super.setjButton5(jButton5); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton getjButton5() {
        return super.getjButton5(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setjButton4(JButton jButton4) {
        super.setjButton4(jButton4); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton getjButton4() {
        return super.getjButton4(); //To change body of generated methods, choose Tools | Templates.
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
    public void setjButton1(JButton jButton1) {
        super.setjButton1(jButton1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton getjButton1() {
        return super.getjButton1(); //To change body of generated methods, choose Tools | Templates.
    }
    
  
    
    public void setController(ClientController clientController) {
        this.clientController = clientController;
    }
}
            