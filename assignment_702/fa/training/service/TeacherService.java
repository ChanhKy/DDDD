package fa.training.service;

import fa.training.entites.Person;
import fa.training.entites.Teacher;

public class TeacherService {
	public static void displayTeacher(Person[] arr) {
		System.out.println("information teacher salary > 1000");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Teacher) {
				Teacher teacher = (Teacher) arr[i];

				if (teacher.calculateSalary() > 1000) {
					System.out.println(teacher.calculateSalary() + "==>" + arr[i]);
				}
			}
		}
	}
	
//	public static void main(String[] args) {
//		TeacherService.displayTeacher(null); //static 
//		
//		TeacherService service = new TeacherService(); 
//		service.a();// non-static
//	}
}
