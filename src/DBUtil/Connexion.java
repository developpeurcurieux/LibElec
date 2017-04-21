/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cdi205
 */
public final class Connexion {

    private static Connection connexion = null;

    public static void toConnect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.err.println("Oops:Driver:" + ex.getMessage());
            return;
        }

        try {
            connexion = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=carnets;user=sa;password=sa");
        } catch (SQLException ex) {
            System.err.println("Oops:Connection:" + ex.getErrorCode() + ":" + ex.getMessage());
            return;
        }

        /*String query = "SELECT * FROM ;";
         try {
         PreparedStatement stmt = connexion.create();
         ResultSet rs = stmt.executeQuery(query);

         while (rs.next()) {
         System.out.println("-----");
         }

         rs.close();
         stmt.close();
         } catch (SQLException ex) {
         System.err.println("Oops:SQL:" + ex.getErrorCode() + ":" + ex.getMessage());
         return;
         }

         try {
         connexion.close();
         } catch (SQLException ex) {
         System.err.println("Oops:Close:" + ex.getErrorCode() + ":" + ex.getMessage());
         return;
         }

         System.out.println("Done!");*/
    }

    public static void disconnect() {
        try {
            connexion.close();
        } catch (SQLException ex) {
            System.err.println("Oops:Close:" + ex.getErrorCode() + ":" + ex.getMessage());
            return;
        }

        System.out.println("Done!");
    }
}
