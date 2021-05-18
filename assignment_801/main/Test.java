package fa.training.main;

import java.util.Scanner;

import fa.training.entities.Song;
import fa.training.entities.Video;
import fa.training.management.MultimediaManagement;

public class Test {
	public static void main(String[] args) {
		String choose = "";
		Scanner scanner = new Scanner(System.in);
		MultimediaManagement multiMediaManagement = new MultimediaManagement();
		do {
				System.out.println(" Choose function: ");
				System.out.println("1. Add a new Video");
				System.out.println("2. Add a new Song");
				System.out.println("3. Show all multimedia");
				System.out.println("4. Exit");
				System.out.println("Your choice: ");
				
				String number = scanner.nextLine();
			switch (number) {
			case "1": 
				Video video = new Video();
				video.createMultimedia();
				multiMediaManagement.addMultimedia(video);
				break;
			case "2":
				Song song =new Song();
				song.createMultimedia();
				multiMediaManagement.addMultimedia(song);
				break;
			case "3":
				multiMediaManagement.displayMultiMedia();
				break;
			case "4":
				choose = "4";
				break;
			}
			System.out.println("------------------");
				
		} while (choose != "4");
	}
}
