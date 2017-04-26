
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
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import util_dao.ClientDB;
import model_db.Client;


public class ClientPanel extends AbstractRubriquePanel {
 private JPanel bottom;
    private ButtonGroup buttonGroup1;
    private JPanel center;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton btnReactualiser;
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
        attClient.add("Id");
        attClient.add("Genre");
        attClient.add("Prenom");
        attClient.add("Nom");
        attClient.add("Email");
        attClient.add("Mot de passe");
        attClient.add( "Date Adhesion");
        attClient.add("Tel F");
        attClient.add("Tel M");
        attClient.add("Statut");
        attClient.add("Champ Libre"); 
        
        
        
        listeClients = clientDB.loadClientOfDB();
        
                
        attClient.add(listeClients);
        
//        Vector v = new Vector;
        
      
        
        DefaultTableModel clientTable = new DefaultTableModel(listeClients, attClient);
        
        jTable2 = getjTable2();
        jTable2.setModel(clientTable);
        
        jComboBox1 = super.getjComboBox1();
        jComboBox1.setModel(new DefaultComboBoxModel(new String[] { 
            "Genre",
            "Prenom",
            "Nom",
            "Email",
            "Mot de passe",
            "Date Adhesion",
            "Tel F",
            "Tel M",
            "Champ Libre"
        }));
        
        jButton3 = super.getjButton3();
        
        jButton3.addActionListener(e -> validerChoixComboBox());
        jTextField4 = super.getjTextField4();
        jTextField4.setText("");
        
        btnReactualiser = super.getBtnReactualiser();
      // btnReactualiser.setIcon(new ImageIcon(getClass().getResource("/res/dataDownload_32.png")));
        
        
    }
    
    public void validerChoixComboBox() {
     String choix = (String) jComboBox1.getSelectedItem();
        switch(choix) {
            case "Genre":
                clientDB.update("Genre", jTextField4.getText());
                break;
            case "Prenom":
                clientDB.update("Prenom", jTextField4.getText());
                break;
            case "Nom":
                clientDB.update("Nom", jTextField4.getText());
                jTextField4.setText("");
                break;
            case "Email":
                clientDB.update("Email", jTextField4.getText());
                break;
            case "Mot de passe": 
                clientDB.update("Mot de passe", jTextField4.getText());
                break;
            case "Date Adhesion":
                clientDB.update("Date Adhesion", jTextField4.getText());
                break;
            case "Tel F": 
                clientDB.update("Tel F", jTextField4.getText());
                break;
            case "Tel M":
                clientDB.update("Tel M", jTextField4.getText());
                break;
            case "Champ Libre":
                clientDB.update("Champ Libre", jTextField4.getText());
                break;
        }
                        
    }
    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public void setjButton4(JButton jButton4) {
        this.jButton4 = jButton4;
    }

    public void setjButton5(JButton jButton5) {
        this.jButton5 = jButton5;
    }

    public void setjComboBox1(JComboBox jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public void setLblRubrique(JLabel lblRubrique) {
        this.lblRubrique = lblRubrique;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public void setjRadioButton1(JRadioButton jRadioButton1) {
        this.jRadioButton1 = jRadioButton1;
    }

    public void setjRadioButton2(JRadioButton jRadioButton2) {
        this.jRadioButton2 = jRadioButton2;
    }

    public void setjRadioButton3(JRadioButton jRadioButton3) {
        this.jRadioButton3 = jRadioButton3;
    }

    public void setjTable2(JTable jTable2) {
        this.jTable2 = jTable2;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public void setjTextField2(JTextField jTextField2) {
        this.jTextField2 = jTextField2;
    }

    public void setjTextField3(JTextField jTextField3) {
        this.jTextField3 = jTextField3;
    }

    public void setjTextField4(JTextField jTextField4) {
        this.jTextField4 = jTextField4;
    }

    
  
    
    public void setController(ClientController clientController) {
        this.clientController = clientController;
    }
}
            