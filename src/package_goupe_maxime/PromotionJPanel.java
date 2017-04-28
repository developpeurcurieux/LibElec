
package package_goupe_maxime;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.RootFrame;

public class PromotionJPanel extends javax.swing.JPanel {
    
    Statement stmtEditeur;

    package_goupe_maxime.Connexion Connexion = new package_goupe_maxime.Connexion();
    
    RootFrame rootFrame;
    
    public PromotionJPanel(RootFrame rootFrame) {
        this.rootFrame = rootFrame;
        initComponents();
        this.setBounds(0, 0, this.rootFrame.getWidth(), this.getHeight());
       
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PromotionIdTextField = new javax.swing.JTextField();
        PromoNomTextField = new javax.swing.JTextField();
        dateDebutTextField = new javax.swing.JTextField();
        dateFinTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        champLibreTextArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        reductionTextField = new javax.swing.JTextField();
        statutTextField = new javax.swing.JTextField();
        imageTextField = new javax.swing.JTextField();
        ajouterButton = new javax.swing.JButton();
        modifierButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        promotionTable = new javax.swing.JTable();
        afficherButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(840, 480));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Promotion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(jLabel1)
                .addContainerGap(365, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setPreferredSize(new java.awt.Dimension(180, 270));

        jLabel2.setText("Promotion Id");

        jLabel3.setText("Promo Nom");

        jLabel4.setText("Date de debut");

        jLabel5.setText("Date de fin");

        jLabel6.setText("Description");

        jLabel7.setText("Reduction");

        jLabel8.setText("Image");

        jLabel9.setText("Statut");

        jLabel10.setText("Champ Libre");

        champLibreTextArea.setColumns(20);
        champLibreTextArea.setRows(5);
        jScrollPane2.setViewportView(champLibreTextArea);

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

        ajouterButton.setText("ajouter");
        ajouterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterButtonActionPerformed(evt);
            }
        });

        modifierButton.setText("modifier");
        modifierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ajouterButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modifierButton))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateDebutTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(dateFinTextField)))
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(PromoNomTextField))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(PromotionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(imageTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(reductionTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(statutTextField))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PromotionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PromoNomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateDebutTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dateFinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(reductionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(imageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(statutTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouterButton)
                    .addComponent(modifierButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(0, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        promotionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Promotion Id", "Promo Nom", "Date de debut", "Date de fin", "Reduction", "Image", "Statut", "Description", "Champ Libre"
            }
        ));
        jScrollPane3.setViewportView(promotionTable);

        afficherButton.setText("afficher");
        afficherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficherButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(458, 458, 458))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(afficherButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(afficherButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel4, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterButtonActionPerformed
     
        String PromoNom = PromoNomTextField.getText();
        String dateDebut = dateDebutTextField .getText();
        String dateFin = dateFinTextField .getText();
        String reduction = reductionTextField.getText();
        String image = imageTextField.getText();
        String statut = statutTextField.getText();
        String description = descriptionTextArea.getText();
        String champLibre = champLibreTextArea.getText();
      
        String query = "insert into promotion (proNom,proDateDebut,proDateFin,proDescription,proReduction,proImage,proStatut,proChampLibre) "
                + "values ('"+PromoNom+"','"+dateDebut+"','"+dateFin+"','"+reduction+"','"+image+"','"+statut+"','"+description+"','"+champLibre+"')";
        
        try{
            stmtEditeur = Connexion.connexion.createStatement();
            stmtEditeur.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "la nouvelle promo est ajoutee");
        
        PromoNomTextField.setText("");
        dateDebutTextField .setText("");
        dateFinTextField .setText("");
        reductionTextField.setText("");
        imageTextField.setText("");
        statutTextField.setText("");
        descriptionTextArea.setText("");
        champLibreTextArea.setText("");
        
          }
            catch (SQLException ex) {
            System.err.println("Erreur d'exécution de la requette:"+ ex.getErrorCode()+"/"+ ex.getMessage());
            JOptionPane.showMessageDialog(null, "erreur de saisie");
        }
        
    }//GEN-LAST:event_ajouterButtonActionPerformed

    private void modifierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierButtonActionPerformed
        
        String PromotionId = PromotionIdTextField.getText();
        String PromoNom = PromoNomTextField.getText();
        String dateDebut = dateDebutTextField .getText();
        String dateFin = dateFinTextField .getText();
        String reduction = reductionTextField.getText();
        String image = imageTextField.getText();
        String statut = statutTextField.getText();
        String description = descriptionTextArea.getText();
        String champLibre = champLibreTextArea.getText();
        
        
        String query = "update employe set proNom = ?,proDateDebut = ?,proDateFin = ?,proDescription = ?,proReduction = ?,proImage = ?,proStatut = ?,proChampLibre = ? where proId = ?";
        
        try{
            PreparedStatement pstmt = Connexion.connexion.prepareStatement(query);
         
        if(PromotionId.length() == 0 || PromoNom.length() == 0 || dateDebut.length() == 0 || dateFin.length() == 0 || reduction.length() == 0 || image.length() == 0 || statut.length() == 0 || description.length() == 0 || champLibre.length() == 0){
        JOptionPane.showMessageDialog(null, "Veuillez saisir les informations dans tous les champs");
         } else{ }  
        
            pstmt.setString(1, PromoNom);
            pstmt.setString(2, dateDebut);
            pstmt.setString(3, dateFin);
            pstmt.setString(4, reduction);
            pstmt.setString(5, image);
            pstmt.setString(6, statut);
            pstmt.setString(7, description);
            pstmt.setString(8, champLibre);
            pstmt.setString(9, PromotionId);
       
            pstmt.executeUpdate();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Mise à jour de la promotion");
        
            PromotionIdTextField.setText("");
            PromoNomTextField.setText("");
            dateDebutTextField .setText("");
            dateFinTextField .setText("");
            reductionTextField.setText("");
            imageTextField.setText("");
            statutTextField.setText("");
            descriptionTextArea.setText("");
            champLibreTextArea.setText("");
            
            }
        catch(SQLException ex) {
            System.err.println("Erreur d'exécution de la requette:"+ ex.getErrorCode()+"/"+ ex.getMessage());
            JOptionPane.showMessageDialog(null, "erreur de saisie");
        
    }     
    }//GEN-LAST:event_modifierButtonActionPerformed

    private void afficherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficherButtonActionPerformed
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn ("Promotiom Id");
        model.addColumn ("Promo Nom");
        model.addColumn ("Date de debut");
        model.addColumn ("Date de fin");
        model.addColumn ("Reduction");
        model.addColumn ("Image");
        model.addColumn ("Statut");
        model.addColumn ("Description");
        model.addColumn ("Champ Libre");
        
      String query = "select * from promotion";  
        
      try{
            stmtEditeur = Connexion.connexion.createStatement();
            ResultSet result = stmtEditeur.executeQuery(query);

            while(result.next()){
                model.addRow(new Object[]{result.getString("proId"),result.getString("proNom"),result.getString("proDateDebut"),result.getString("proDateFin"),result.getString("proDescription"),result.getString("proReduction"),result.getString("proImage"),result.getString("proStatut"),result.getString("proChampLibre")});
            }

        }
        catch (SQLException ex) {
            System.err.println("Erreur d'exécution de la requette:"+ ex.getErrorCode()+"/"+ ex.getMessage());
        }

        //On applique le modele à la Table promotion
        promotionTable.setModel(model);
    }//GEN-LAST:event_afficherButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PromoNomTextField;
    private javax.swing.JTextField PromotionIdTextField;
    private javax.swing.JButton afficherButton;
    private javax.swing.JButton ajouterButton;
    private javax.swing.JTextArea champLibreTextArea;
    private javax.swing.JTextField dateDebutTextField;
    private javax.swing.JTextField dateFinTextField;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JTextField imageTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton modifierButton;
    private javax.swing.JTable promotionTable;
    private javax.swing.JTextField reductionTextField;
    private javax.swing.JTextField statutTextField;
    // End of variables declaration//GEN-END:variables
}
