
package package_goupe_SwingTest04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class Connexion { 

    public static Connection connexion = null;

    public static void toConnect() {
        
        //chargement du pilote
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.err.println("Oops:Driver:" + ex.getMessage());
            return;
        }
        
        //Connection à la base de données
        try {
            connexion = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=libElec;user=sa;password=sa");
        } catch (SQLException ex) {
            System.err.println("Oops:Connection:" + ex.getErrorCode() + ":" + ex.getMessage());
            return;
        }
    }

    public static void disconnect() {
        
        //Deconnection à la base de données
        try {
            connexion.close();
        } catch (SQLException ex) {
            System.err.println("Oops:Close:" + ex.getErrorCode() + ":" + ex.getMessage());
            return;
        }

        System.out.println("Done!");
    }
}
