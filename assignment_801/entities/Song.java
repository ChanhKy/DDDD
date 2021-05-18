package fa.training.entities;

import java.util.Scanner;

public class Song extends Multimedia {
	private String singer;

	public Song() {
		super();

	}

	public Song(String name, double duration, String singer) {
		super(name, duration);
		this.singer = singer;
	}

	public void createSong() {
		super.createMultimedia();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				if (singer == null) {
					singer = scanner.nextLine();
				}
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public String toString() {
		return "Song [singer=" + singer + ", getName()=" + getName() + ", getDuration()=" + getDuration() + "]";
	}

}
