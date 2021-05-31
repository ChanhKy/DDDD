package fa.training.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Magazine extends Publication {
	public String author;
	public int volumn;
	public int edition;

	public Magazine() {
	}

	public Magazine(String author, int volumn, int edition) {
		super();
		this.author = author;
		this.volumn = volumn;
		this.edition = edition;
	}

	public Magazine(int pulicationYear, String publisher, Date publicationDate ,String author, int volumn, int edition) {
		super(pulicationYear, publisher, publicationDate);
		this.author = author;
		this.volumn	 = volumn;
		this.edition =  edition;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	
	
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				if (author == null) {
					System.out.println("Enter Author : ");
					this.author = scanner.nextLine();
				}
				if (volumn == 0) {
					System.out.println("Enter Volumn: ");
					this.volumn = Integer.valueOf(scanner.nextLine());
				}
				if (edition == 0) {
					System.out.println(" Enter edition: ");
					this.edition = Integer.valueOf(scanner.nextLine());
				}
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} 
	}
	

	@Override
	public String toString() {
		return "Magazine [author=" + author + ", volumn=" + volumn + ", edition=" + edition + "]";
	}

	@Override
	public void display() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(
				"Year: " + pulicationYear + "\t publisher" + publisher + "\t Date: " + format.format(publicationDate) + "author=" + author + "\t volumn=" + volumn + "\t edition=" + edition);
		
	}


	
}
