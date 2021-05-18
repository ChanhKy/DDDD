package training.main;

import java.util.Iterator;
import java.util.Scanner;

import fa.training.entites.Person;
import fa.training.entites.Student;
import fa.training.entites.Teacher;
import fa.training.service.StudentService;
import fa.training.service.TeacherService;

public class PersonManage {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("vui long chon chuc nang");
		System.out.println("1. Nhap du lieu tu ban phim: ");
		System.out.println("2. Cap nhat thong tin sinh vien bang ma so ID: ");
		System.out.println("3. Hien thi thong tin giao vien co muc luong tren  1000");
		System.out.println("4. Hien thi sinh vien co diem trung binh > 6");
		System.out.println("0. Chuong trinh ket thuc! ");

		Person[] arr = new Person[10];
		arr[0] = new Teacher("Ky", "Nam", "0982898712", "nguyenchanhky@gamil.com", 1000, 150);
		arr[1] = new Teacher("Hung", "nam", "0356789456", "hung123@gamil.com", 900, 50);
		arr[2] = new Student("Linh", "Nu", "0358236145", "Linhnguyen@gmail.com", "STU01", 5.6, 6.3);
		arr[3] = new Student("Nhu", "Nu", "0123456879", "nhu123@gamil.com", "STU02", 6.2, 6.5);
		arr[4] = new Student("Hoang", " Nam", "0147258369", "Hoangha@gamil.com", "STU03", 6.5, 7);
		arr[5] = new Teacher("Ha", "Nu", "159369854", "ha12345@gmail.com", 1500, 200);
		arr[6] = new Teacher("Hai", "nu", "012454612", "Ha@gmail.com", 1000, 250);
		arr[7] = new Student("Manh", "Nam", "0133456987", "Manh123@gamil.com", "STU001", 6.3, 6.5);
		arr[8] = new Student("Nam", "nam", "78456123", "nam@gamil.com", "STU002", 5.9, 6.0);
		arr[9] = new Student("Thuy", "nu", "123456963", "thuy@gmail.com", "TSU003", 7.5, 6.8);
////		arr[10] = new Teacher("Nhu", "Nu", "0258369147", "Nhu@gmail.com", 3000, 150);
//		for ( int i = 0; i < arr.length; i++) {
//			System.out.println("Phan tu thu " + i + " la:  " + arr[i]);
//		}

		int n = sc.nextInt();

		switch (n) {
		case 0:
			System.out.println("Chuong trinh ket thuc: ");
			break;
		case 1:
			// nhap tu ban phim
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter person thu : " + (i + 1));
				arr[i] = new Teacher();
				arr[i].input();
			}
			// hien thi
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			break;
		case 2:
//			Scanner sc1 = new Scanner(System.in);
			// update sinh vien theo dinh dang ma ID
			System.out.println("Nhap vao student id: ");
			String studentId = sc.nextLine();
			System.out.println("moi nhap: "+studentId);
			for (int i = 0; i < arr.length; i++) {
				
				// ham instaceof để check nó là class nào
				if (arr[i] instanceof Student) {
					// ep kieu Person -> Student (Casting)
					Student student = (Student) arr[i];
					if (student.getStudenId().equals(studentId)) {
						student = new Student();
						student.input();
						System.out.println(student);
					}
				}
			}

			break;
		case 3:
//			for (int i = 0; i < arr.length; i++) {
//				System.out.println(arr[i]);
//			}
			// hien thi salary >2000
			TeacherService.displayTeacher(arr);
			break;
		case 4:
			StudentService.displaySudent(arr);
			break;
		default:
			System.out.println("Vui long nhap lai!");

		}

//		
//		
//		Person[] persons = new Person[10];
//		persons[0] = new Student("Manh", "Nam", "0133456987", "Manh123@gamil.com", "STU001", 6.3, 6.5);
//		persons[1] = new Teacher("Nhu", "Nu", "0258369147", "Nhu@gmail.com", 3000, 150);
//		
//		for (Person person : persons) {
//			System.out.println(person);
//		}

//		
//		for (int i = 0; i < stu.length; i++) {
//			System.out.println(stu[i]);
//		}
//		
//		
	}

}
