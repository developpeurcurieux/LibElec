package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Adresse;

public class AdresseDB implements DAOInterface{
    private Adresse adresse;
    private String query = "";
    private PreparedStatement pstmt;
    

    
    public AdresseDB(Adresse adresse) {
     this.adresse = adresse;
    }
    
    @Override
    public void insert() {
        try {
            query = "INSERT INTO Adresse "
                    + "(desId,cliId,cli_cliId,adrNumVoie,adrNomVoie,adrNomVoieSuite,adrCp,adrVille,adrPays,adrStatut) "
                    + "VALUES"
                    + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            
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
