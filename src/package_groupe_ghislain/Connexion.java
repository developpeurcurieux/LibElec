/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_groupe_ghislain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ghislain
 */
public class Connexion {
    String urlPiloteSQL ="com.microsoft.sqlserver.jdbc.SQLServerDriver"; //chemin de chargement du pilote
    String urlBaseDonnees = "jdbc:sqlserver://localhost:1433;databaseName=libelec"; //chemin de connection à la base de données
    Connection con;
    String user = "sa"; //nom d'utilisateur de la base de données
    //String pw = "AfpaLibrairie2017"; //Mot de passe "sa"
    String pw = "saObito95000_"; //Mot de passe "sa"
    //String pw = "Nepaschanger2017"; //Mot de passe "sa"
    
    public Connexion(){
    
    //chargement du pilote
    try {
            Class.forName(urlPiloteSQL);
            System.out.println("Chargement du pilote réussi");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(ConnexionOLD.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Erreur de chargement du pilote:" + ex.getMessage());
        }
    
    //Connection à la base de données
    try {
            con = DriverManager.getConnection(urlBaseDonnees, user, pw);
            System.out.println("Connection à la base de données réussie");
        } catch (SQLException ex) {
            System.err.println("Erreur de connection à la base de données:"+ ex.getErrorCode()+"/"+ ex.getMessage());
        }
    
    }
    //Creation d'une methode pour obtenir la connection
    Connection ObtenirConnexion(){
        return con;
}
    
}
