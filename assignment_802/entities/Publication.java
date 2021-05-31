package fa.training.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import fa.training.utils.Validator;

public abstract class Publication {
	public int pulicationYear;
	public String publisher;
	public Date publicationDate;

	public Publication() {

	}

	public Publication(int pulicationYear, String publisher, Date publicationDate) {
		super();
		this.pulicationYear = pulicationYear;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
	}

	public int getPulicationYear() {
		return pulicationYear;
	}

	public void setPulicationYear(int pulicationYear) {
		this.pulicationYear = pulicationYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				if (pulicationYear == 0) {
					System.out.println("Enter pulicationYear: ");
					this.pulicationYear = Integer.valueOf(scanner.nextLine());
				}
				if (publisher == null) {
					System.out.println("Enter publisher: ");
					this.publisher = scanner.nextLine();
				}
				if (publicationDate == null) {
					System.out.println(" Enter Publication Date: (dd/mm/yyyy)");
					String date = scanner.nextLine();
					if (Validator.isDate(date))
						this.publicationDate = new Date(date);
					else
						throw new Exception("Date is incorret. try again!");
				}
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public String toString() {
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		return "Publication=" + pulicationYear + " publisher= " + publisher + " Date= "
				+ dateformat.format(publicationDate);
	}

	public abstract void display();

}
