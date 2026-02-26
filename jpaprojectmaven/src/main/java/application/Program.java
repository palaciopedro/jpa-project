package application;

import domain.Person;

public class Program {

	public static void main(String[] args) {

		Person p1 = new Person(1, "Carl", "carl@gmail.com");
		Person p2 = new Person(1, "John", "john@gmail.com");
		Person p3 = new Person(1, "Mary", "mary@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
