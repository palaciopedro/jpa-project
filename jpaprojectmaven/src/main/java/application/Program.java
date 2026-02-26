package application;

import domain.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Program {

	public static void main(String[] args) {

		Person p1 = new Person(null, "Carl", "carl@gmail.com");
		Person p2 = new Person(null, "John", "john@gmail.com");
		Person p3 = new Person(null, "Mary", "mary@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		System.out.println("Done!");
	}

}
