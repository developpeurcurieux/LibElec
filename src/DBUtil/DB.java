/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBUtil;

/**
 *
 * @author cdi205
 */
public abstract class DB<T> {
    
    /**
  * Méthode d'insertion dans la DB
  * @param obj
  * @return boolean
  */
    public abstract boolean insert(T obj);
    
    /**
  * Méthode de mise à jour
  * @param obj
  * @return boolean
  */
    public abstract boolean update(T obj);
    
    /**
  * Méthode de recherche
  * @param id
  * @param int
  * @return T
  */
    
}
