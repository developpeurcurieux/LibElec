
package package_goupe_SwingTest04;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.RootFrame;
import controller.SwingTestController;
import java.sql.Connection;


public class EditeurJPanel extends javax.swing.JPanel {
    private SwingTestController swingTestController;
    
    Statement stmtEditeur;

    private Connexion connexion;
    
    RootFrame rootFrame;
    
    public EditeurJPanel(RootFrame rootFrame) {
        this.rootFrame = rootFrame;
        initComponents();
        this.setBounds(0, 0, 600, 600);
    }

    public void setController(SwingTestController swingTestController) {
     this.swingTestController = swingTestController;   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        modificationEditeurNomTextField = new javax.swing.JTextField();
        modificationEditeurTelTextField = new javax.swing.JTextField();
        modificationEditeurEmailTextField = new javax.swing.JTextField();
        modificationStatutTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        modificationEditeurChampTextArea = new javax.swing.JTextArea();
        modifierButton = new javax.swing.JButton();
        ajoutButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        editeurTable = new javax.swing.JTable();
        afficherButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        setLayout(new java.awt.BorderLayout());

        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editeur");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addGap(237, 237, 237))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel2.setText("Nom");

        jLabel3.setText("Telephone");

        jLabel4.setText("Email");

        jLabel5.setText("Statut");

        jLabel6.setText("Champ Libre");

        modificationEditeurChampTextArea.setColumns(20);
        modificationEditeurChampTextArea.setRows(5);
        jScrollPane1.setViewportView(modificationEditeurChampTextArea);

        modifierButton.setText("modifier");
        modifierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierButtonActionPerformed(evt);
            }
        });

        ajoutButton.setText("ajouter");
        ajoutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(modifierButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ajoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(modificationEditeurEmailTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(modificationEditeurTelTextField)
                                    .addComponent(modificationStatutTextField)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(39, 39, 39)
                                .addComponent(modificationEditeurNomTextField)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificationEditeurNomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(modificationEditeurTelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificationEditeurEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificationStatutTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifierButton)
                    .addComponent(ajoutButton))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        add(jPanel2, java.awt.BorderLayout.LINE_START);

        editeurTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nom", "Telephone", "Email", "Statut", "Champ Libre"
            }
        ));
        jScrollPane2.setViewportView(editeurTable);

        afficherButton.setText("afficher");
        afficherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficherButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(afficherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(afficherButton)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setPreferredSize(new java.awt.Dimension(544, 50));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        add(jPanel4, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void modifierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierButtonActionPerformed
        
        //modification des informations des editeurs dans la base
        
        //declaration des variables des textFields et du TextArea pour la modification
        
        String nomEditeur = modificationEditeurNomTextField.getText();
        String telEditeur = modificationEditeurTelTextField.getText();
        String emailEditeur = modificationEditeurEmailTextField.getText();
        String statutEditeur = modificationStatutTextField.getText();
        String ChampEditeur = modificationEditeurChampTextArea.getText();
       
        //declaration d'une requete pour Update l'editeur
        String query = "update editeur set ediTeleF = ?, editEmail = ?, ediStatut = ?, ediChampLibre = ? where ediNom = ?";
     
        //Modification des informations de l'editeur
        try{
            PreparedStatement pstmt = Connexion.connexion.prepareStatement(query);
           
        if(nomEditeur.length() == 0 || telEditeur.length() == 0 || emailEditeur.length() == 0 || statutEditeur.length() == 0 || ChampEditeur.length() == 0){
        JOptionPane.showMessageDialog(null, "Veuillez saisir les informations dans tous les champs");
         } else{ } 
            pstmt.setString(1, telEditeur);
            pstmt.setString(2, emailEditeur);
            pstmt.setString(3, statutEditeur);
            pstmt.setString(4, ChampEditeur);
            pstmt.setString(5, nomEditeur);
            pstmt.executeUpdate();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Mise à jour de l'editeur");
            
            //vidage de la table après les modifications
            modificationEditeurNomTextField.setText("");
            modificationEditeurTelTextField.setText("");
            modificationEditeurEmailTextField.setText("");
            modificationStatutTextField.setText("");
            modificationEditeurChampTextArea.setText("");
        }
        catch(SQLException ex) {
            System.err.println("Erreur d'exécution de la requette:"+ ex.getErrorCode()+"/"+ ex.getMessage());
            JOptionPane.showMessageDialog(null, "vous m'avez pas rempli tous les champs vides");
        
    }//GEN-LAST:event_modifierButtonActionPerformed
    }
    
    private void afficherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficherButtonActionPerformed
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn ("Nom");
        model.addColumn ("Telephone");
        model.addColumn ("Email");
        model.addColumn ("Statut");
        model.addColumn ("Champ Libre");
        
      String query = "select * from editeur";  
      
        
       try{
            stmtEditeur = Connexion.connexion.createStatement();
            ResultSet result = stmtEditeur.executeQuery(query);

            while(result.next()){
                model.addRow(new Object[]{result.getString("ediNom"),result.getString("ediTeleF"),result.getString("editEmail"),result.getString("ediStatut"),result.getString("ediChampLibre")});
            }

        }
        catch (SQLException ex) {
            System.err.println("Erreur d'exécution de la requette:"+ ex.getErrorCode()+"/"+ ex.getMessage());
        }

        //On applique le modele à la Table editeur
        editeurTable.setModel(model);
        
    }//GEN-LAST:event_afficherButtonActionPerformed

    private void ajoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutButtonActionPerformed
        
        String nomEditeur = modificationEditeurNomTextField.getText();
        String telEditeur = modificationEditeurTelTextField.getText();
        String emailEditeur = modificationEditeurEmailTextField.getText();
        String statutEditeur = modificationStatutTextField.getText();
        String ChampEditeur = modificationEditeurChampTextArea.getText();
        
        String query = "insert into editeur (ediNom, ediTeleF, editEmail, ediStatut, ediChampLibre) values ('"+nomEditeur+"','"+telEditeur+"','"+emailEditeur+"','"+statutEditeur+"','"+ChampEditeur+"')";
        
        try{
            stmtEditeur = Connexion.connexion.createStatement();
            stmtEditeur.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "le nouveau editeur est ajoute");
          
        modificationEditeurNomTextField.setText("");
        modificationEditeurTelTextField.setText("");
        modificationEditeurEmailTextField.setText("");
        modificationStatutTextField.setText("");
        modificationEditeurChampTextArea.setText("");
           
            }
            catch (SQLException ex) {
            System.err.println("Erreur d'exécution de la requette:"+ ex.getErrorCode()+"/"+ ex.getMessage());
            JOptionPane.showMessageDialog(null, "erreur de saisie");
        }
        
       
    }//GEN-LAST:event_ajoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton afficherButton;
    private javax.swing.JButton ajoutButton;
    private javax.swing.JTable editeurTable;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextArea modificationEditeurChampTextArea;
    private javax.swing.JTextField modificationEditeurEmailTextField;
    private javax.swing.JTextField modificationEditeurNomTextField;
    private javax.swing.JTextField modificationEditeurTelTextField;
    private javax.swing.JTextField modificationStatutTextField;
    private javax.swing.JButton modifierButton;
    // End of variables declaration//GEN-END:variables

    private Object getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
