package day41_capsulationMethods;

import java.util.*;

public class bookTesterGetterSetter {
	public static void main(String[] args) {
		Book book1 = new Book();

		book1.setTitle("Gigt");
		System.out.println(book1.getTitle());

		book1.setAuthor("Mike Smith");
		System.out.println(book1.getAuthor());

		book1.setPages(345);

		Book javaBook = new Book();
		javaBook.setAuthor("metin Karaer");
		javaBook.setTitle("Headfirst java");

		System.out.println(javaBook.getTitle());
		System.out.println(javaBook.getAuthor());

	}
}
