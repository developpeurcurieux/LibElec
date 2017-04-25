/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package util_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;
import model_db_tables.*;


public class ClientDB implements DAOInterface{
    private Adresse adresse;
    private Client client;
    private String query = "";
    private PreparedStatement pstmt;
    private Statement stmt;
    //
    
    public ClientDB() {
        //TODO il faut la mettre au debut vers le programme
        Connexion.toConnect();
    }
    
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
            
            
            pstmt = Connexion.connexion.prepareStatement(query);
            
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
            
            
//
            
            
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
            
            pstmt = Connexion.connexion.prepareStatement(query);
            
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
    
    public Vector loadClientOfDB() {
        Vector listeClients = new Vector();
        ResultSet rs;
        
        try {
            query = "SELECT * FROM Client;";
            stmt = Connexion.connexion.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );
            
            /*      private long cliId;
            private int cliGenre;
            private String cliPrenom;
            private String cliNom;
            private String cliEmail;
            private String cliMdp;
            private LocalDate cliDateAdhesion;
            private String cliTelF;
            private String cliTelM;
            private int cliStatut;
            //    private String cliChampLibre; */
            
            rs = stmt.executeQuery(query);
            while(rs.next()) {
                client = new Client();
                Vector v = new Vector();
                
                client.setCliId(rs.getLong("cliId"));
                client.setCliGenre(rs.getInt("cliGenre"));
                client.setCliPrenom(rs.getString("cliPrenom"));
                client.setCliNom(rs.getString("cliNom"));
                client.setCliEmail(rs.getString("cliEmail"));
                client.setCliMdp(rs.getString("cliMdp"));
                client.setCliDateAdhesion(rs.getString("cliDateAdhesion"));
                client.setCliTelF(rs.getString("cliTelF"));
                client.setCliTelM(rs.getString("cliTelM"));
                client.setCliStatut(rs.getInt("cliStatut"));
                client.setCliChampLibre(rs.getString("cliChampLibre"));
                
                v.add(client.getCliId());
                v.add(client.getCliGenre());
                v.add(client.getCliPrenom());
                v.add(client.getCliNom());
                v.add(client.getCliEmail());
                v.add(client.getCliMdp());
                v.add(client.getCliDateAdhesion());
                v.add(client.getCliTelF());
                v.add(client.getCliTelM());
                v.add(client.getCliStatut());
                v.add(client.getCliChampLibre());
                
                System.out.println("client :" + client);
                              
                listeClients.add(v);
            }
            
            
            
        }catch (SQLException ex) {
            System.out.println(" erreur chargement client" + ex.getMessage());
        }
        
        return listeClients;
    }
}
