
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
import javax.swing.JOptionPane;
//
import controller.ClientController;
import controller.AdresseController;
import java.awt.Image;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import util_dao.ClientDB;
import model_db.Client;


public class ClientPanel extends AbstractRubriquePanel {
    private JPanel bottom;
    private ButtonGroup buttonGroup1;
    private JPanel center;
    private JButton btnSearch;
    private JButton jButton2;
    private JButton jButton3;
    private JButton btnQuit;
    private JButton btnMenuPrincipal;
    private JButton btnReactualiser;
    private JButton btnAdresse;
    private JButton btnDestinataire;
    private JComboBox jComboBox1;
    private JLabel lblRubrique;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JRadioButton rbClientId;
    private JRadioButton rbPrenom;
    private JRadioButton rbNom;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JSeparator jSeparator1;
    private JTable jTable2;
    private JTextArea jTextArea1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField tfClientId;
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
        
        
        
        jTable2 = super.getjTable2();
        jTable2.setModel(recupererBaseClients());
        
        
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
        
        //event buttons
        
        jButton3 = super.getjButton3();
        jButton3.addActionListener(e -> modifierChoixComboBox());
        
        jTextField4 = super.getjTextField4();
        jTextField4.setText("");
        
        jButton2 = super.getjButton2();
        jButton2.addActionListener(e -> validerChampLibre());
        
        jTextArea1 = super.getjTextArea1();
        
        btnReactualiser = super.getBtnReactualiser();
        btnReactualiser.addActionListener(e -> reactualiserTable());
        
        btnMenuPrincipal = super.getBtnMenuPrincipal();
        btnMenuPrincipal.addActionListener(e -> clientController.retourMenuPrincipal());
        
        btnQuit = super.getBtnQuit();
        btnQuit.addActionListener(e -> clientController.quitFrame());
        
        btnSearch = super.getBtnSearch();
        btnSearch.addActionListener(e -> chercherClient());
        
        btnAdresse = super.getjButton7();
        btnAdresse.setText("Adresse");
        btnAdresse.addActionListener(e -> chargerLesAdressesDuClient());
        
        btnDestinataire = super.getjButton8();
        btnDestinataire.setText("Destinataire");
        btnDestinataire.addActionListener(e -> chargerLesDestinatairesClient());
               
        
        //event radioBtn
        rbClientId = super.getjRadioButton1();
        rbClientId.setText("Id client");
        
        rbPrenom = super.getjRadioButton3();
        rbPrenom.setText("Prenom");
        
        rbNom = super.getjRadioButton2();
        rbNom.setText("Nom");
        
        //event tf
        tfClientId = super.getjTextField3();
        jTextField2 = super.getjTextField2();
          
        
        
    }
    
    public void chargerLesAdressesDuClient() {
        long id = validerChoixTable();
        
        if(id < 0) {
            JOptionPane.showMessageDialog(this, "Aucune selection dans le tableau. \nConsultation adresse impossible", "Erreur", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            clientController.consulterLesAdresses(id);
        }
        
    }
    
    public void chargerLesDestinatairesClient() {
        long id = validerChoixTable();
        
        if(id < 0) {
            JOptionPane.showMessageDialog(this, "Aucune selection dans le tableau. \nConsultation adresse impossible", "Erreur", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            clientController.consulterLesDestinataires(id);
        }
        
    }
    
    public void chercherClient() {
        long id = -1;
        String chaine = "";
        
        if(rbClientId.isSelected()) {
            try {
                id = Long.valueOf(tfClientId.getText());
                System.out.println("id: " + id);
            }catch(NumberFormatException ex) {
          
            }
            
            if( id < 0 ) {
                     JOptionPane.showMessageDialog(this, "Aucun id inseré ou valeur incorrecte. \nrecherche impossible", "Erreur", JOptionPane.INFORMATION_MESSAGE);
       
            }
            else {
                Vector listeVectorId = clientDB.searchClient(id);
                jTable2.setModel(new DefaultTableModel(listeVectorId, attClient));
            }
            
        }else if(rbNom.isSelected()) {
            chaine = jTextField2.getText();
            if(chaine.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Aucun valeur entree. \nrecherche impossible", "Erreur", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
              
                System.out.println("tf " + jTextField2.getText());
                Vector listeVectorNom = clientDB.searchClient(chaine);
                jTable2.setModel(new DefaultTableModel(listeVectorNom, attClient));
            }
        }
        //TODO recherche par prenom
//        else if(rbNom.isSelected()) {
//            if(chaine.isEmpty()) {
//                JOptionPane.showMessageDialog(this, "Aucun valeure entree. \nrecherche impossible", "Erreur", JOptionPane.INFORMATION_MESSAGE);
//            }
//            else {
//                chaine = jTextField2.getText();
//                Vector listeVectorNom = clientDB.searchClient(chaine);
//                jTable2.setModel(new DefaultTableModel(listeVectorNom, attClient));
//            }
//        }
//    
    }
    
    public void reactualiserTable() {
        jTable2.setModel(recupererBaseClients());
        
    }
    
    public DefaultTableModel recupererBaseClients() {
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
        
        DefaultTableModel clientTable = new DefaultTableModel(listeClients, attClient);

        return clientTable;
    }
    
    public long validerChoixTable() {
        int column = 0;
        long value = -1;
        try {
            int row = jTable2.getSelectedRow();
            value = (long) jTable2.getModel().getValueAt(row, column);
        }catch(ArrayIndexOutOfBoundsException ex) {
            ex.getMessage();
        }
        return value;
    }
    
    
    public void modifierChoixComboBox() {
        
        String choix = (String) jComboBox1.getSelectedItem();
        System.out.println("combo " + jComboBox1.getSelectedItem());
        
        long id = validerChoixTable();
        
        if(id < 0) {
            JOptionPane.showMessageDialog(this, "Aucune selection dans le tableau. \nModification impossible", "Erreur", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
        System.out.println("id" + id);
        
            switch(choix) {
                case "Genre":
                    clientDB.update(id, "cliGenre", jTextField4.getText());
                    jTextField4.setText("");
                    break;
                case "Prenom":
                    clientDB.update(id, "cliPrenom", jTextField4.getText());
                    jTextField4.setText("");
                    break;
                case "Nom":
                    clientDB.update(id, "cliNom", jTextField4.getText());
                    jTextField4.setText("");
                    break;
                case "Email":
                    clientDB.update(id, "cliEmail", jTextField4.getText());
                    jTextField4.setText("");
                    break;
                case "Mot de passe":
                    clientDB.update(id, "cliMdp", jTextField4.getText());
                    jTextField4.setText("");
                    break;
                case "Date Adhesion":
                    clientDB.update(id, "cliDateAdhesion", jTextField4.getText());
                    jTextField4.setText("");
                    break;
                case "Tel F":
                    clientDB.update(id, "cliTelF", jTextField4.getText());
                    jTextField4.setText("");
                    break;
                case "Tel M":
                    clientDB.update(id, "cliTelM", jTextField4.getText());
                    jTextField4.setText("");
                    break;
                  }
        }
    }
        
        public void validerChampLibre() {
            int column = 0;
            long id = -1;
            String champ = "";
            try {
                int row = jTable2.getSelectedRow(); 
                id = (long) jTable2.getModel().getValueAt(row, column);
            }catch(ArrayIndexOutOfBoundsException ex) {
                ex.getMessage();
            }
            
            if(id < 0) {
                JOptionPane.showMessageDialog(this, "aucun client selectionne", "erreur", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                champ = jTextArea1.getText();
                if(champ.isEmpty()) {
                    JOptionPane.showMessageDialog(this, " aucune donnee detectee dans 'champ libre'", "erreur", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    clientDB.update(id, "cliChampLibre", champ);
                    jTextArea1.setText("");
                }
            }
             
        }
    
   
    
    public void setrbClientId(JRadioButton rbClientId) {
        this.rbClientId = rbClientId;
    }
    
    public void setrbPrenom(JRadioButton rbPrenom) {
        this.rbPrenom = rbPrenom;
    }
    
    public void setrbNom(JRadioButton rbNom) {
        this.rbNom = rbNom;
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
    
    public void settfClientId(JTextField tfClientId) {
        this.tfClientId = tfClientId;
    }
    
    public void setjTextField4(JTextField jTextField4) {
        this.jTextField4 = jTextField4;
    }
    
    
    
    
    public void setController(ClientController clientController) {
        this.clientController = clientController;
    }
}
