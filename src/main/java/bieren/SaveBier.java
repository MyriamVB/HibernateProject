package bieren;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBier {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatecourse");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Bieren bier = new Bieren(1600,"SmokeyGin",80,44,9);
        em.persist(bier);
        tx.commit();
        em.close();
        emf.close();
        System.out.println(bier.getNaam() + " is added");
    }
}
