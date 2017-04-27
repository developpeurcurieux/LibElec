
package SwingTest04;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TvaJPanel extends javax.swing.JPanel {

    Statement stmtTva;

    SwingTest04.Connexion Connexion = new SwingTest04.Connexion();
    
    JFrameTest jf;  
    
    public TvaJPanel(JFrameTest jf) {
        this.jf = jf;
        initComponents();
        this.setBounds(0, 0, this.jf.getWidth(), this.getHeight());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TvaTitre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tvaIdTextField = new javax.swing.JTextField();
        modificationTvaTextField = new javax.swing.JTextField();
        modifierButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tvaTable = new javax.swing.JTable();
        afficherButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nouveauTvaTextField = new javax.swing.JTextField();
        ajouterButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 50));

        TvaTitre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TvaTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TvaTitre.setText("Tva");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(TvaTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(255, 255, 255))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TvaTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(204, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Modification d'une valeur de la Tva");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("tva Id");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("nouvelle tvaTaux");

        modifierButton.setText("modifier");
        modifierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modifierButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificationTvaTextField)
                    .addComponent(tvaIdTextField))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modificationTvaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tvaIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifierButton)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        add(jPanel2, java.awt.BorderLayout.LINE_START);

        tvaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "tvaId", "tvaTaux"
            }
        ));
        jScrollPane1.setViewportView(tvaTable);

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
                .addGap(79, 79, 79)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(afficherButton)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(afficherButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setPreferredSize(new java.awt.Dimension(500, 80));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nouvelle TVA");

        nouveauTvaTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ajouterButton.setText("ajouter");
        ajouterButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajouterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nouveauTvaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(ajouterButton)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nouveauTvaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ajouterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );

        add(jPanel4, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterButtonActionPerformed
        
        String tvaTaux = nouveauTvaTextField.getText();
        
        String query = "insert into tva (tvaTaux) values ('"+tvaTaux+"')";
        
        try{
            stmtTva = Connexion.connexion.createStatement();
            stmtTva.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "La nouvelle TVA est ajoutee");
       
        nouveauTvaTextField.setText("");
        } catch (SQLException ex) {
            System.err.println("Erreur d'exécution de la requette:"+ ex.getErrorCode()+"/"+ ex.getMessage());
            JOptionPane.showMessageDialog(null, "erreur de saisie");
        }
        
    }//GEN-LAST:event_ajouterButtonActionPerformed

    private void afficherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficherButtonActionPerformed
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn ("TvaId");
        model.addColumn ("tvaTaux");
        
        String query = "select * from Tva";
        
        try{
            stmtTva = Connexion.connexion.createStatement();
            ResultSet result = stmtTva.executeQuery(query);

            while(result.next()){
                model.addRow(new Object[]{result.getString("tvaId"),result.getString("tvaTaux")});
            }

        }
        catch (SQLException ex) {
            System.err.println("Erreur d'exécution de la requette:"+ ex.getErrorCode()+"/"+ ex.getMessage());
        }

        //On applique le modele à la Table tva
        tvaTable.setModel(model);        
        
    }//GEN-LAST:event_afficherButtonActionPerformed

    private void modifierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierButtonActionPerformed
        
        
        String tvaId = tvaIdTextField.getText();
        String tvaTaux = modificationTvaTextField.getText();
       
        
        String query = "update tva set tvaTaux = ? where tvaId = ?";
        
        try{
            PreparedStatement pstmt = Connexion.connexion.prepareStatement(query);
            
            if(tvaId.length() == 0 || tvaTaux.length() == 0){
                JOptionPane.showMessageDialog(null, "Veuillez saisir les informations dans tous les champs");
         } else{ }  
            
            pstmt.setString(1, tvaTaux);
            pstmt.setString(2, tvaId);
            pstmt.executeUpdate();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Mis à jour du taux de TVA");
            
            //vider la table après l'ajout
            tvaIdTextField.setText("");
            modificationTvaTextField.setText("");
        }
        catch(SQLException ex) {
            System.err.println("Erreur d'exécution de la requette:"+ ex.getErrorCode()+"/"+ ex.getMessage());
            JOptionPane.showMessageDialog(null, "erreur de saisie");
            
        }
    }//GEN-LAST:event_modifierButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TvaTitre;
    private javax.swing.JButton afficherButton;
    private javax.swing.JButton ajouterButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField modificationTvaTextField;
    private javax.swing.JButton modifierButton;
    private javax.swing.JTextField nouveauTvaTextField;
    private javax.swing.JTextField tvaIdTextField;
    private javax.swing.JTable tvaTable;
    // End of variables declaration//GEN-END:variables
}
