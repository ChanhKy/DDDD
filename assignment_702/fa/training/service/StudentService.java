package fa.training.service;

import fa.training.entites.Person;
import fa.training.entites.Student;

public class StudentService {
	public static void displaySudent(Person[] arr) {
		System.out.println("danh sach sinh vien co diem > 6");
		Student[] arrstu = new Student[1];
		for (int i = 0; i < arr.length; i++) {
			// ham instaceof để check nó là class nào
			if (arr[i] instanceof Student) {
				// ep kieu Person -> Student (Casting)
				Student student = (Student) arr[i];
				if (student.calculateFinalMath() > 6) {
					System.out.println(student.calculateFinalMath() + "===>" + arr[i]);
				}
			}
		}
	}
}
