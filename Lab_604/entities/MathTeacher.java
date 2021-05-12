package fa.training.entities;

public class MathTeacher extends Teacher{
	protected String mainSubject;

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
	
	public int sum (int number1, int number2) {
		return(number1 + number2);
	}
	
	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.print("teach math subject : ");
		
	}

	@Override
	public String toString() {
		return "MathTeacher [mainSubject=" + mainSubject + ", designation=" + getDesignation()
				+ ", CollegeName=" + getCollegeName() + "]";
	}
	
	
	
	
}
