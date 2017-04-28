
package package_goupe_SwingTest04;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import view.RootFrame;

public class InfoLibrairieJPanel extends javax.swing.JPanel {

    Statement stmtEditeur;

    package_goupe_SwingTest04.Connexion Connexion = new package_goupe_SwingTest04.Connexion();
    
    RootFrame rootFrame;
    
    public InfoLibrairieJPanel(RootFrame rootFrame) {
        this.rootFrame = rootFrame ;
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        infoLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nomTextField1 = new javax.swing.JTextField();
        siretTextField1 = new javax.swing.JTextField();
        numVoieTextField1 = new javax.swing.JTextField();
        typeVoieTextField1 = new javax.swing.JTextField();
        nomVoieTextField1 = new javax.swing.JTextField();
        cpTextField1 = new javax.swing.JTextField();
        villeTextField1 = new javax.swing.JTextField();
        paysTextField1 = new javax.swing.JTextField();
        modifierButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        infoToggleButton = new javax.swing.JToggleButton();
        InfoAffichagePanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        numVoieTextField2 = new javax.swing.JTextField();
        typeVoieTextField2 = new javax.swing.JTextField();
        nomVoieTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        siretTextField2 = new javax.swing.JTextField();
        nomTextField2 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(525, 325));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 50));

        infoLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        infoLabel.setText("Librairie");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(infoLabel)
                .addContainerGap(291, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(160, 250));

        jLabel2.setText("Nom");

        jLabel3.setText("N° Siret");

        jLabel4.setText("N° de voie");

        jLabel5.setText("Type de voie");

        jLabel7.setText("Nom de voie");

        jLabel8.setText("Code Postal");

        jLabel9.setText("Ville");

        jLabel10.setText("Pays");

        modifierButton1.setText("Modifier");
        modifierButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numVoieTextField1)
                            .addComponent(siretTextField1)
                            .addComponent(nomTextField1)
                            .addComponent(typeVoieTextField1)
                            .addComponent(nomVoieTextField1)
                            .addComponent(cpTextField1)
                            .addComponent(villeTextField1)
                            .addComponent(paysTextField1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(modifierButton1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nomTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addComponent(siretTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numVoieTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeVoieTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomVoieTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(villeTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paysTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(20, 20, 20)
                .addComponent(modifierButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        add(jPanel2, java.awt.BorderLayout.LINE_START);

        infoToggleButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        infoToggleButton.setText("information");
        infoToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoToggleButtonActionPerformed(evt);
            }
        });

        jLabel13.setText("Adresse :");

        numVoieTextField2.setEditable(false);
        numVoieTextField2.setBorder(null);

        typeVoieTextField2.setEditable(false);
        typeVoieTextField2.setBorder(null);

        nomVoieTextField2.setEditable(false);
        nomVoieTextField2.setBorder(null);

        jLabel11.setText("Nom :");

        jLabel12.setText("N° Siret :");

        siretTextField2.setEditable(false);
        siretTextField2.setBorder(null);
        siretTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siretTextField2ActionPerformed(evt);
            }
        });

        nomTextField2.setEditable(false);
        nomTextField2.setBorder(null);

        javax.swing.GroupLayout InfoAffichagePanelLayout = new javax.swing.GroupLayout(InfoAffichagePanel);
        InfoAffichagePanel.setLayout(InfoAffichagePanelLayout);
        InfoAffichagePanelLayout.setHorizontalGroup(
            InfoAffichagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoAffichagePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(InfoAffichagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(InfoAffichagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomTextField2)
                    .addComponent(siretTextField2)
                    .addComponent(nomVoieTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeVoieTextField2)
                    .addComponent(numVoieTextField2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(19, 19, 19))
        );
        InfoAffichagePanelLayout.setVerticalGroup(
            InfoAffichagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoAffichagePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(InfoAffichagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InfoAffichagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siretTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(InfoAffichagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numVoieTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeVoieTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomVoieTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InfoAffichagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(infoToggleButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(infoToggleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InfoAffichagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void modifierButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierButton1ActionPerformed
        
        String nomInfoLib = nomTextField1.getText();
        String siretInfoLib = siretTextField1.getText();
        String numVoieInfoLib = numVoieTextField1.getText();
        String typeVoieInfoLib = typeVoieTextField1.getText();
        String nomVoieInfoLib = nomVoieTextField1.getText();
        String cpInfoLib = cpTextField1.getText();
        String villeInfoLib = villeTextField1.getText();
        String paysInfoLib = paysTextField1.getText();
        
        
        String query = "update InfoLibrairie set infSiret = ?, infNumVoie = ?, infNomVoie = ?, infNomVoieSuite = ?, infCp = ?, infCp = ?, infVille = ?, infPays = ? where infNom = ? ";
        
        if(nomInfoLib.length() == 0 || siretInfoLib.length() == 0 || numVoieInfoLib.length() == 0 || typeVoieInfoLib.length() == 0 || nomVoieInfoLib.length() == 0 || cpInfoLib.length() == 0 || villeInfoLib.length() == 0 || paysInfoLib.length() == 0){
        JOptionPane.showMessageDialog(null, "Veuillez saisir les informations dans tous les champs");
         } else{ }  
        
        try{
            PreparedStatement pstmt = Connexion.connexion.prepareStatement(query);
           
            pstmt.setString(1, siretInfoLib);
            pstmt.setString(2, numVoieInfoLib);
            pstmt.setString(3, nomVoieInfoLib);
            pstmt.setString(4, typeVoieInfoLib);
            pstmt.setString(5, cpInfoLib);
            pstmt.setString(6, villeInfoLib);
            pstmt.setString(7, paysInfoLib);
            pstmt.setString(8, nomInfoLib);
          
            pstmt.executeUpdate();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Mise à jour de l'employe");
            
            nomTextField1.setText("");
            siretTextField1.setText("");
            numVoieTextField1.setText("");
            typeVoieTextField1.setText("");
            nomVoieTextField1.setText("");
            cpTextField1.setText("");
            villeTextField1.setText("");
            paysTextField1.setText("");
                 
        }
        catch(SQLException ex) {
            System.err.println("Erreur d'exécution de la requette:"+ ex.getErrorCode()+"/"+ ex.getMessage());
            JOptionPane.showMessageDialog(null, "erreur de saisie");
        
        }     
    }//GEN-LAST:event_modifierButton1ActionPerformed

    private void infoToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoToggleButtonActionPerformed
        
        String query = "select * from infoLibrairie ";  
      
      try{
            stmtEditeur = Connexion.connexion.createStatement();
            ResultSet result = stmtEditeur.executeQuery(query);
            
            while(result.next()) {
            nomTextField2.setText(result.getString("infNom"));
            siretTextField2.setText(result.getString("infSiret"));
            numVoieTextField2.setText(result.getString("infNumVoie")+" "+result.getString("infNomVoieSuite")+" "+result.getString("infNomVoie"));
            typeVoieTextField2.setText(result.getString("infCp")+" "+result.getString("infVille"));
            nomVoieTextField2.setText(result.getString("infPays"));
            
            }
         }
        catch (SQLException ex) {
            System.err.println("Erreur d'exécution de la requette:"+ ex.getErrorCode()+"/"+ ex.getMessage());
        }
      
      InfoAffichagePanel.setVisible(infoToggleButton.isSelected());
      
    }//GEN-LAST:event_infoToggleButtonActionPerformed

    private void siretTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siretTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siretTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InfoAffichagePanel;
    private javax.swing.JTextField cpTextField1;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JToggleButton infoToggleButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton modifierButton1;
    private javax.swing.JTextField nomTextField1;
    private javax.swing.JTextField nomTextField2;
    private javax.swing.JTextField nomVoieTextField1;
    private javax.swing.JTextField nomVoieTextField2;
    private javax.swing.JTextField numVoieTextField1;
    private javax.swing.JTextField numVoieTextField2;
    private javax.swing.JTextField paysTextField1;
    private javax.swing.JTextField siretTextField1;
    private javax.swing.JTextField siretTextField2;
    private javax.swing.JTextField typeVoieTextField1;
    private javax.swing.JTextField typeVoieTextField2;
    private javax.swing.JTextField villeTextField1;
    // End of variables declaration//GEN-END:variables
}
