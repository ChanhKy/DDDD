package fa.training.entities;

public class MathTeacher extends Teacher implements Actionable{
	private String mainSubject;

	public MathTeacher() {
	}
	
	public MathTeacher(String designation, String collegeName, String mainSubject) {
		super(designation, collegeName);
		this.mainSubject = mainSubject;
	}
	public String getMainSubject() {
		return mainSubject;
	}

	public void setMainSubject(String mainSubject) {
		this.mainSubject = mainSubject;
	}
	
	
	public int sum(int number1, int number2) {
		return number1 + number2;
	}
	
	@Override
	public void toSchool() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "MathTeacher [mainSubject=" + mainSubject + ", Designation=" + getDesignation()
				+ ", CollegeName=" + getCollegeName() + "]";
	}
	
	
	
	
}
