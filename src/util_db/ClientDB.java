/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model_db_tables.*;

public class ClientDB implements DAOInterface{
    private Adresse adresse;
    private Client client;
    private String query = "";
    private PreparedStatement pstmt;
    

    
    public ClientDB(Client client) {
     this.client = client;
    }
    
    @Override
    public void insert() {
        try {
            query = "INSERT INTO Client "
                    + "(cliGenre, cliPrenom, cliNom, cliEmail, cliMdp, cliDateAdhesion, cliTelF, cliTelM, cliStatut, cliChampLibre)"
                    + "VALUES"
                    + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
//"VALUES \n" +
//"(0, 'Joseph', 'LACOURT', 'dui@malesuadavelconvallis.edu', 'ninja01', '2016-12-17', '01 97 86 51 83', '06 80 26 43 87', '', ''),\n" +
//"(0, 'Georges','HENRY', 'sodales.Mauris.blandit@malesuada.org', 'ninja02', '2016-07-17', '01 70 59 40 51', '', '', ''),\n" +
//"(1, 'Veronique','GURY', 'consequat.purus@quamvel.org', 'ninja03', '2015-05-24', '', '06 58 28 23 52', '', ''),		\n" +
//"(0, 'Laurence','DY', 'in@egetipsumSuspendisse.co.uk', 'ninja04', '2017-01-31', '01 92 84 07 41', '06 35 77 49 33', '', '')
                    
            
            pstmt = DBUtil.connexion.prepareStatement(query);
            
//            private long adrId;
//            private long desId;
//            private long cliId;
//            private long cli_cliId;
//            private int adrNumVoie;
//            private String adrNomVoie;
//            private String adrNomVoieSuite;
//            private String adrCp;
//            private String adrVille;
//            private String adrPays;
//            private int adrStatut;
            
                        
            pstmt.setLong(1, adresse.getDesId());
            pstmt.setLong(2, adresse.getCliId());
            pstmt.setLong(3, adresse.getCli_cliId());
            pstmt.setInt(4, adresse.getAdrNumVoie());
            pstmt.setString(5, adresse.getAdrNomVoie());
            pstmt.setString(6, adresse.getAdrNomVoieSuite());
            pstmt.setString(7, adresse.getAdrCp());
            pstmt.setString(8, adresse.getAdrVille());
            pstmt.setString(9, adresse.getAdrPays());
            pstmt.setInt(10, adresse.getAdrStatut());
            
            pstmt.executeUpdate();
            
        } catch(SQLException ex) {
            System.out.println("sql exception of insertion: " + ex.getMessage());
        }
    }
                        
    // TODO Il ne faut oublier le update AdresseDB (attente pour voir sa mise en place)
    @Override
    public void update() {
            try {
            query = "UPDATE Adresse "
                    + "SET adrNom = 'test', adrCp = '34344' "
                    + "WHERE adrId = " + adresse.getAdrId() + ";";
            
            pstmt = DBUtil.connexion.prepareStatement(query);
            
//            private long adrId;
//            private long desId;
//            private long cliId;
//            private long cli_cliId;
//            private int adrNumVoie;
//            private String adrNomVoie;
//            private String adrNomVoieSuite;
//            private String adrCp;
//            private String adrVille;
//            private String adrPays;
//            private int adrStatut;
            
            
            pstmt.executeUpdate();
            
        } catch(SQLException ex) {
            System.out.println("sql exception of update: " + ex.getMessage());
        }
    }
}
