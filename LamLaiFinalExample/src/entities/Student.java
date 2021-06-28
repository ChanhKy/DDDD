package entities;

import java.util.Date;

public class Student {
	private String fullName;
	private Date dOB;
	private String sex;
	private String phoneNumber;
	private String universityName;
	private String gradeLevel;

	public Student() {

	}

	public Student(String fullName, Date dOB, String sex, String phoneNumber, String universityName,
			String gradeLevel) {
		super();
		this.fullName = fullName;
		this.dOB = dOB;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.universityName = universityName;
		this.gradeLevel = gradeLevel;
	}

	@Override
	public String toString() {
		return "fullName=" + fullName + ", dOB=" + dOB + ", sex=" + sex + ", phoneNumber=" + phoneNumber
				+ ", universityName=" + universityName + ", gradeLevel=" + gradeLevel;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getdOB() {
		return dOB;
	}

	public void setdOB(Date dOB) {
		this.dOB = dOB;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

}
