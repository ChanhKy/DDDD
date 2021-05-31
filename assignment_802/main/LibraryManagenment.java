package fa.training.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import fa.training.entities.Publication;
import fa.training.services.Bookservice;
import fa.training.services.MagazieService;

public class LibraryManagenment {
	public static void display(List<Publication> list) {
		System.out.println("---------List of publcation---------");
		list.forEach(publication -> System.out.println(publication));
	}

	public static void main(String[] args) {
		String checkContinue = "";
		Scanner scanner = new Scanner(System.in);
		List<Publication> list = new ArrayList<Publication>();
		do {
			System.out.println("choose function: ");
			System.out.println("1. Add a new book");
			System.out.println("2. Add a Magazine");
			System.out.println("3. Display books and magazine");
			System.out.println("4. Add author to book");
			System.out.println("5. Display top 10 of magazine by volumn");
			System.out.println("6. search book by (isbn, autor, publisher)");
			System.out.println("0. Exit");
			System.out.println("Your choice");
			String number = scanner.nextLine();
			switch (number) {
			case "0":
				checkContinue = "0";
				break;
			case "1":
				Bookservice.addBook(list);
				break;
			case "2":
				MagazieService.addMagazine(list);
				break;
			case "3":
				display(list);
				break;
			case "4":
				Bookservice.addAuthor(list);
				break;
			case "5":
				MagazieService.displayTop10(list);
				break;
			case "6":
				Bookservice.search(list);
				break;

			}
			System.out.println("-----------------");
		} while (checkContinue != "0");
		System.out.println("BEY!!!!!");
		scanner.close();
	}
}
