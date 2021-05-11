package fa.training.main;

import java.util.Scanner;

import fa.training.entities.Course;

public class courseManagement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course [] courses = new Course[5];
		System.out.println("=== Create course: ===");
		courses[0] = new Course("FW001", "JAVA", 15, "active", "mandatory");
		courses[1] = new Course("FW002", "JAVA", 15, "active", "mandatory");
		courses[2] = new Course("FW003", "C++", 15, "active", "N/A");
		courses[3] = new Course("FW004", "C++", 12, "no-active", "optional");
		courses[4] = new Course("FW005", "C", 10, "active", "mandatory");
		
		// nhâp tư bàn phím 
		for (int i = 0; i< courses.length; i++) {
			System.out.println("- Enter Course : " +( i + 1));
			courses[i] = new Course();
			courses[i].input();
		}
		
		// hiển thị tất cả các tên trùng nhau
		System.out.print("Enter name of course to search: ");
		String name = new Scanner(System.in).nextLine();
		find(name,courses);
		
		// hien thi tất cả các flag mandatory
		System.out.println("All courses that flag is mandatory");
		String flag = "mandatory";
		disPlay(flag,courses);
	}	

//	Hàm Find : Tìm tên 1 khóa học (name) trong danh sách khóa học (courses)
//	=> hàm Find có 2 tham số đầu vào là : name và courses
//	name có kiểu dữ liệu là String
//	courses có kiểu dữ liệu là object Course
//	=> Để chạy được hàm Find cần phải có 2 tham số đầu vào là name và courses
	public static void find(String name, Course [] courses) {
		for (int i =0 ; i < courses.length; i++) {
			if (courses[i].getName().equals(name)) {
				System.out.println(courses[i]);
			}
		}
	}
	
	// hàm hiển thị tất cả các flag là "mandatory"
	public static void disPlay(String flag, Course [] courses) {
		for (int i = 0; i < courses.length; i++) {
			if (courses[i].getFlag().equals(flag)) {
				System.out.println(courses[i]);
			}
		}
	}
	
}
