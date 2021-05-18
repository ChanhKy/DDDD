package fa.training.entities;

public class Video extends Multimedia {

	public Video() {
		super();

	}

	public Video(String name, double duration) {
		super(name, duration);
		// TODO Auto-generated constructor stub
	}

	public void createVideo() {
		super.createMultimedia();

	}

	@Override
	public String toString() {
		return "Video [getName()=" + getName() + ", getDuration()=" + getDuration() + "]";
	}

}
