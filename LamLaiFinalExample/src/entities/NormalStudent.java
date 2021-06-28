package entities;

import java.util.Date;

public class NormalStudent extends Student {
	private int englishScore;
	private double entryTestScore;

	public NormalStudent() {
		super();

	}

	public NormalStudent(String fullName, Date dOB, String sex, String phoneNumber, String universityName,
			String gradeLevel, int englishScore, double entryTestScore) {
		super(fullName, dOB, sex, phoneNumber, universityName, gradeLevel);
		this.englishScore = englishScore;
		this.entryTestScore = entryTestScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public double getEntryTestScore() {
		return entryTestScore;
	}

	public void setEntryTestScore(double entryTestScore) {
		this.entryTestScore = entryTestScore;
	}

	@Override
	public String toString() {
		return "NormalStudent[ " + super.toString() + "englishScore=" + englishScore + ", entryTestScore="
				+ entryTestScore + "]";
	}

}
