package fa.training.management;

import fa.training.entities.MathTeacher;

public class TeacherManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MathTeacher teacher = new MathTeacher("Teacher", "FU", "Math");
	System.out.println(teacher);
	
	teacher.teach();
	System.out.print(" sum(20,80) = " + teacher.sum(20, 80));
		
	}

}
