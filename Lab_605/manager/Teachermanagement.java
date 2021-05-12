package fa.training.manager;

import fa.training.entities.EnglishTeacher;
import fa.training.entities.MathTeacher;
import fa.training.entities.Teacher;

public class Teachermanagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathTeacher mathTeacher = new MathTeacher("Teacher", "FU", "Math");
		MathTeacher mathTeacher2 = new MathTeacher("Teacher", "PTIT", "Math");
		EnglishTeacher englishTeacher = new EnglishTeacher("Teacher", "FU", "english");
		
		
		Teacher [] teachers = new Teacher[3];
		teachers[0] = mathTeacher;
		teachers[1] = mathTeacher2;
		teachers[2]= englishTeacher;
		
		int number1 = 100;
		int number2 = 20;
	for (int i = 0 ; i < teachers.length; i++) {
		System.out.println("======TEACHER" + ( i + 1)+ "========" );
		System.out.println("College name : " + teachers[i].getCollegeName());
		System.out.println("Designation: " + teachers[i].getDesignation());
		if (teachers[i] instanceof MathTeacher) {
			System.out.println("Main subject: " + ((MathTeacher)teachers[i]).getMainSubject());
			
			((MathTeacher)teachers[i]).toSchool();
			
			teachers[i].teach();
			System.out.println("SUM (" + number1 + "," + number2 + ") = " + mathTeacher.sum(number1, number2));
			
		} else {
			System.out.println("main subject: " + ((EnglishTeacher)teachers[i]).getMainSubject());
			((EnglishTeacher) teachers[i]).toSchool();
			teachers[i].teach();
			((EnglishTeacher)teachers[i]).translate("hello", "Xin chao");
		}
	}
	
	}

}
