/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmss15;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Juan Carlos Alcaide Gómez
 * @author 
 * @author 
 * @author 
 * @author 
 */
public class DMSS15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DMSS15PU");
        EntityManager em = emf.createEntityManager();
        em.close();
    }

}
