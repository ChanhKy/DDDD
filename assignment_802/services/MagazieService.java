package fa.training.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fa.training.entities.Magazine;
import fa.training.entities.Publication;

public class MagazieService{
	
	public static void addMagazine(List<Publication> list) {
		Magazine magazine = new Magazine();
		magazine.input();
		list.add(magazine);
	}
	
	public static void displayTop10(List<Publication> list) {
		List<Magazine> magazine = new ArrayList<Magazine>();
		System.out.println("-----List TOP 10 Magazine:----- ");
		for (Publication publication : list) {
			if (publication instanceof Magazine) {
				magazine.add((Magazine) publication);
			}
		}
		
		magazine.stream()
			.sorted((m1, m2) -> m1.volumn - m2.volumn)
			.limit(10)
			.forEach(System.out::println);
	}
}
