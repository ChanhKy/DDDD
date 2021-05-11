package fa.training.test;

import fa.training.entities.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student(1, "Jason", 22, 8.0);
		Student stu2 = new Student();
		System.out.println("Enter stu2 information");
		stu2.input();
		System.out.println("=====STUDENT LIST======");
		System.out.println(stu1);
		System.out.println(stu2);
	}

}
