import entity.Recipe;

import javax.persistence.*;

public class Main {
    public static void main (String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test-manager");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Recipe recipe = new Recipe(10, "test", "test");

        em.persist(recipe);
        em.getTransaction().commit();
    }
}