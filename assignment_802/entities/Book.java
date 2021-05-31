package fa.training.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Book extends Publication {
	public String isbn;
	public Set<String> author;
	public String publicationPlace;

	public Book() {
	}

	public Book(int pulicationYear, String publisher, Date publicationDate) {
		super(pulicationYear, publisher, publicationDate);
		// TODO Auto-generated constructor stub
	}

	public Book(String isbn, Set<String> author, String publicationPlace) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.publicationPlace = publicationPlace;
	}

	public void input() {
		super.input();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				if (isbn == null) {
					System.out.print("Enter ISBN: ");
					this.isbn = scanner.nextLine();

				}
				if (author == null) {
					addAuthor();
				}
				if (publicationPlace == null) {
					System.out.print("Enter publication Place: ");
					this.publicationPlace = scanner.nextLine();
				}
				break;
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
		}
	}

	public void addAuthor() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter list of author: ");

		Set<String> author = new HashSet<String>();
		if (this.author != null) {
			author = this.author;
		}

		int i = 1;
		int checkContinue;
		do {
			System.out.print("Enter author " + i + ":");
			String authorInput = scanner.nextLine();

			// neu do dai cua author truoc = author sau => trung ten
			int length = author.size();
			author.add(authorInput);

			if (author.size() == length) {
				System.out.print("this name is existed:");
			} else {
				System.out.println("Add successfully");
				i++;
			}
			System.out.println("Do you want to continue enter value the author:");
			checkContinue = scanner.nextInt();
		} while (checkContinue != 0);
		this.author = author;

	}

	@Override
	public void display() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(
				"Year: " + pulicationYear + "\t publisher" + publisher + "\t Date: " + format.format(publicationDate)
						+ "\t ISBN: " + isbn + "\t Author: " + author + "\t Place: " + publicationPlace);

	}

	public String getIsbn() {
		return isbn;
	}

	public void setISBN(String isbn) {
		isbn = isbn;
	}

	public Set<String> getAuthor() {
		return author;
	}

	public void setAuthor(Set<String> author) {
		this.author = author;
	}

	public String getPublicationPlace() {
		return publicationPlace;
	}

	public void setPublicationPlace(String publicationPlace) {
		this.publicationPlace = publicationPlace;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", author=" + author + ", publicationPlace=" + publicationPlace + "]";
	}

}
