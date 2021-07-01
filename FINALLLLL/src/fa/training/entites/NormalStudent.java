package fa.training.entites;

import java.util.Date;
import java.util.Scanner;

public class NormalStudent extends Student {
	private int englishScore;
	private double entryTestSscore;

	public NormalStudent() {
		super();

	}

	public NormalStudent(String fullName, Date dob, String sex, String phone, String universityName, String gradeLevel,
			int englishScore, double entryTestSscore) {
		super(fullName, dob, sex, phone, universityName, gradeLevel);
		this.englishScore = englishScore;
		this.entryTestSscore = entryTestSscore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public double getEntryTestSscore() {
		return entryTestSscore;
	}

	public void setEntryTestSscore(double entryTestSscore) {
		this.entryTestSscore = entryTestSscore;
	}

	@Override
	public String toString() {
		return "NormalStudent: "+super.toString() + "\t" + englishScore + "\t" + entryTestSscore;
				
	}
	@Override
	public void showMyInfor() {
		super.showMyInfor();
		System.out.println(englishScore + "\t" + entryTestSscore);
	}
	@Override
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				if(englishScore == 0) {
					System.out.print("Nhap diem TOEIC: ");
					this.englishScore = Integer.parseInt(sc.nextLine());
				}
				if (entryTestSscore == 0) {
					System.out.print(" Nhap diem thi dau vao cua sinh vien: ");
					this.entryTestSscore = Double.parseDouble(sc.nextLine());
				}
				break;
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
