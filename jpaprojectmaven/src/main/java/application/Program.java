package application;

import domain.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Program {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Person p = em.find(Person.class, 2);
		em.remove(p);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		System.out.println("Done!");
	}

}
