/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import objets.Livre;

/**
 *
 * @author cdi205
 */
public class LivreDB extends DB<Livre> {

    /**
     * Méthode d'insertion dans la DB
     *
     * @param obj
     * @return boolean
     */
    @Override
    public boolean insert(Livre obj) {
        return true;
    }

    /**
     * Méthode de mise à jour
     *
     * @param obj
     * @return boolean
     */
    @Override
    public boolean update(Livre obj) {
        return false;
    }

    /**
     * Méthode de recherche
     *
     * @param isbn
     * @return T
     */
    public Livre find(String isbn) {
        String query = "SELECT * FROM Livre WHERE isbn = ?";
        try {
            PreparedStatement pstmt = Connexion.connexion.prepareStatement(query);
            pstmt.setString(1, isbn);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            Livre obj = new Livre(rs.getString("isbn"), rs.getLong("ediId"), rs.getLong("tvaId"), rs.getLong("proId"), rs.getString("ouvNom"), rs.getInt("livEdition"), rs.getDate("livDateEdition"), rs.getString("livResume"), rs.getFloat("livPrix"), rs.getInt("livStock"), rs.getString("livImage"), rs.getString("livSousTitre"), rs.getInt("livStatut"), rs.getString("livChampLibre"));
            return obj;
                    
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
