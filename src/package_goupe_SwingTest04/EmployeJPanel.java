
package package_goupe_SwingTest04;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.RootFrame;

public class EmployeJPanel extends javax.swing.JPanel {

   Statement stmtEditeur;

    package_goupe_SwingTest04.Connexion Connexion = new package_goupe_SwingTest04.Connexion();
    RootFrame rootFrame;
   
    
    public EmployeJPanel(RootFrame rootFrame) {
        this.rootFrame = rootFrame;
        initComponents();
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        jLabel11 = new javax.swing.JLabel();
        employeIdTextField = new javax.swing.JTextField();
        mpTextField = new javax.swing.JTextField();
        nomTextField = new javax.swing.JTextField();
        prenomTextField = new javax.swing.JTextField();
        dateEntreeTextField = new javax.swing.JTextField();
        dateSortieTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        gradeTextField = new javax.swing.JTextField();
        statutTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        champLibreTextArea = new javax.swing.JTextArea();
        ajouterButton = new javax.swing.JButton();
        modifierButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeTable = new javax.swing.JTable();
        afficherButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Employe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(180, 250));

        jLabel2.setText("Employe Id");

        jLabel3.setText("Mot de passe");

        jLabel4.setText("Nom");

        jLabel5.setText("Prenom");

        jLabel6.setText("Date d'entree");

        jLabel7.setText("Date de sortie");

        jLabel8.setText("Email");

        jLabel9.setText("Grade");

        jLabel10.setText("Statut");

        jLabel11.setText("Champ Libre");

        champLibreTextArea.setColumns(20);
        champLibreTextArea.setRows(5);
        jScrollPane2.setViewportView(champLibreTextArea);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(41, 41, 41)
                        .addComponent(statutTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(42, 42, 42)
                        .addComponent(gradeTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(47, 47, 47)
                        .addComponent(emailTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(3, 3, 3)
                        .addComponent(dateSortieTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5)
                        .addComponent(dateEntreeTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(35, 35, 35)
                        .addComponent(prenomTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50)
                        .addComponent(nomTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addComponent(mpTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(employeIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ajouterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modifierButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(prenomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dateEntreeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(employeIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(mpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addGap(36, 36, 36)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateSortieTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gradeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addComponent(statutTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouterButton)
                    .addComponent(modifierButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(0, 50));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        EmployeTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "Employe Id", "Nom", "Prenom", "Date d'entree", "Date de sortie", "Email", "Grade", "Statut", "Champ Libre"
            }
        ));
        jScrollPane1.setViewportView(EmployeTable);

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
                .addGap(172, 172, 172)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(afficherButton)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(afficherButton)
                .addGap(92, 92, 92)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterButtonActionPerformed
       
        
        String mpEmploye = mpTextField.getText();
        String nomEmploye = nomTextField.getText();
        String prenomEmploye = prenomTextField.getText();
        String dateEntreeEmploye = dateEntreeTextField.getText();
        String dateSortieEmploye = dateSortieTextField.getText();
        String emailEmploye = emailTextField.getText();
        String gradeEmploye = gradeTextField.getText();
        String statutEmploye = statutTextField.getText();
        String champEmploye = champLibreTextArea.getText();
      
        String query = "insert into employe (empMdp,empNom,empPrenom,empDateEntree,empDateSortie,empEmail,empGrade,empStatut,empChampLibre) "
                + "values ('"+mpEmploye+"','"+nomEmploye+"','"+prenomEmploye+"','"+dateEntreeEmploye+"','"+dateSortieEmploye+"','"+emailEmploye+"','"+gradeEmploye+"','"+statutEmploye+"','"+champEmploye+"')";
        
        try{
            stmtEditeur = Connexion.connexion.createStatement();
            stmtEditeur.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "le nouveau editeur est ajoute");
        
        mpTextField.setText("");
        nomTextField.setText("");
        prenomTextField.setText("");
        dateEntreeTextField.setText("");
        dateSortieTextField.setText("");
        emailTextField.setText("");
        gradeTextField.setText("");
        statutTextField.setText("");
        champLibreTextArea.setText("");    
            
            }
            catch (SQLException ex) {
            System.err.println("Erreur d'exécution de la requette:"+ ex.getErrorCode()+"/"+ ex.getMessage());
            JOptionPane.showMessageDialog(null, "erreur de saisie");
        }
        
    }//GEN-LAST:event_ajouterButtonActionPerformed

    private void modifierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierButtonActionPerformed
        
        String empIdEmploye = employeIdTextField.getText();
        String mpEmploye = mpTextField.getText();
        String nomEmploye = nomTextField.getText();
        String prenomEmploye = prenomTextField.getText();
        String dateEntreeEmploye = dateEntreeTextField.getText();
        String dateSortieEmploye = dateSortieTextField.getText();
        String emailEmploye = emailTextField.getText();
        String gradeEmploye = gradeTextField.getText();
        String statutEmploye = statutTextField.getText();
        String champEmploye = champLibreTextArea.getText();
        
        
        String query = "update employe set empMdp = ?,empNom = ?,empPrenom = ?,empDateEntree = ?,empDateSortie = ?,empEmail = ?,empGrade= ?,empStatut = ? ,empChampLibre = ? where empId = ?";
            
        try{
            PreparedStatement pstmt = Connexion.connexion.prepareStatement(query);
           
        if(empIdEmploye.length() == 0 || mpEmploye.length() == 0 || nomEmploye.length() == 0 || prenomEmploye.length() == 0 || dateEntreeEmploye.length() == 0 || dateSortieEmploye.length() == 0 || emailEmploye.length() == 0 || gradeEmploye.length() == 0 || statutEmploye.length() == 0 || champEmploye.length() == 0){
        JOptionPane.showMessageDialog(null, "Veuillez saisir les informations dans tous les champs");
         } else{ }   
            pstmt.setString(1, mpEmploye);
            pstmt.setString(2, nomEmploye);
            pstmt.setString(3, prenomEmploye);
            pstmt.setString(4, dateEntreeEmploye);
            pstmt.setString(5, dateSortieEmploye);
            pstmt.setString(6, emailEmploye);
            pstmt.setString(7, gradeEmploye);
            pstmt.setString(8, statutEmploye);
            pstmt.setString(9, champEmploye);
            pstmt.setString(10, empIdEmploye);
            pstmt.executeUpdate();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Mise à jour de l'employe");
            
            employeIdTextField.setText("");
            mpTextField.setText("");
            nomTextField.setText("");
            prenomTextField.setText("");
            dateEntreeTextField.setText("");
            dateSortieTextField.setText("");
            emailTextField.setText("");
            gradeTextField.setText("");
            statutTextField.setText("");
            champLibreTextArea.setText("");
            
        }
        catch(SQLException ex) {
            System.err.println("Erreur d'exécution de la requette:"+ ex.getErrorCode()+"/"+ ex.getMessage());
            JOptionPane.showMessageDialog(null, "erreur de saisie");
        
    }     
        
    }//GEN-LAST:event_modifierButtonActionPerformed

    private void afficherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficherButtonActionPerformed
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn ("Employe Id");
        model.addColumn ("Nom");
        model.addColumn ("Prenom");
        model.addColumn ("Date d'entree");
        model.addColumn ("Date de sortie");
        model.addColumn ("Email");
        model.addColumn ("Grade");
        model.addColumn ("Statut");
        model.addColumn ("Champ Libre");
        
      String query = "select * from employe";  
      
      try{
            stmtEditeur = Connexion.connexion.createStatement();
            ResultSet result = stmtEditeur.executeQuery(query);

            while(result.next()){
                model.addRow(new Object[]{result.getString("empId"),result.getString("empNom"),result.getString("empPrenom"),result.getString("empDateEntree"),result.getString("empDateSortie"),result.getString("empEmail"),result.getString("empGrade"),result.getString("empStatut"),result.getString("empChampLibre")});
            }

        }
        catch (SQLException ex) {
            System.err.println("Erreur d'exécution de la requette:"+ ex.getErrorCode()+"/"+ ex.getMessage());
        }

        //On applique le modele à la Table employe
        EmployeTable.setModel(model);
      
    }//GEN-LAST:event_afficherButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmployeTable;
    private javax.swing.JButton afficherButton;
    private javax.swing.JButton ajouterButton;
    private javax.swing.JTextArea champLibreTextArea;
    private javax.swing.JTextField dateEntreeTextField;
    private javax.swing.JTextField dateSortieTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField employeIdTextField;
    private javax.swing.JTextField gradeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JButton modifierButton;
    private javax.swing.JTextField mpTextField;
    private javax.swing.JTextField nomTextField;
    private javax.swing.JTextField prenomTextField;
    private javax.swing.JTextField statutTextField;
    // End of variables declaration//GEN-END:variables
}
