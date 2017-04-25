
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
        
        DefaultTableModel clientTable = new DefaultTableModel(listeClients, attClient);
        
        jTable2.setModel(clientTable);
        
        
    }
    
  
    
    public void setController(ClientController clientController) {
        this.clientController = clientController;
    }
}
            