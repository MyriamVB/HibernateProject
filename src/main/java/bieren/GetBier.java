package bieren;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetBier {

        public static void main(String[] args) {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatecourse");
            EntityManager em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            Bieren bier = em.find(Bieren.class, 1600L);
            System.out.println(bier.getNaam() + " is gevonden");
            tx.commit();
            em.close();
            emf.close();

        }

}
