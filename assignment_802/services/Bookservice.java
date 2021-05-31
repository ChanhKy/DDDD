package fa.training.services;

import java.util.List;
import java.util.Scanner;

import fa.training.entities.Book;
import fa.training.entities.Publication;

// bookservice sex gom 2 phuong thuc tim kiem va them sach, tac gia

public class Bookservice {
	public static void addBook(List<Publication> list) {
		Book book = new Book();
		book.input();
		list.add(book);
	}

	public static void addAuthor(List<Publication> list) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter iSBN of book");
		String isbn = scanner.nextLine();

		System.out.println("------List of Book-------");
		for (Publication publication : list) {
			if (publication instanceof Book) {
				Book book = (Book) publication;
				if (isbn.equals(book.isbn))
					book.addAuthor();
			}
		}
	}

	public static void search(List<Publication> list) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to search: ");
		String input = scanner.nextLine();

		System.out.println("----------List of book---------");
		for (Publication publication : list) {
			if (publication instanceof Book) {
				Book book = (Book) publication;
				String str = book.getIsbn() + " " + book.getAuthor() + " " + book.getPublisher();
				if (str.contains(input))
					System.out.println(book);
			}
		}
	}
}
