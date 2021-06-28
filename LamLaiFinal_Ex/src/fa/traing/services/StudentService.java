package fa.traing.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import fa.training.dao.GoodstudentDaoIpml;
import fa.training.dao.NormalStudentDaoIpml;
import fa.training.entites.GoodStudent;
import fa.training.entites.NormalStudent;
import fa.training.entites.Student;

public class StudentService {
	public static void main(String[] args) {

		listTuyenDung();

	}

	public static void listTuyenDung() {
		List<GoodStudent> goodStudents = GoodstudentDaoIpml.getListGoodStudentFromDB();
		Collections.sort(goodStudents, new Comparator<GoodStudent>() {

			@Override
			public int compare(GoodStudent o1, GoodStudent o2) {
				if (o1.getGpa() > o2.getGpa()) {
					return -1;
				} else if (o1.getGpa() == o2.getGpa()) {
					return o1.getFullName().compareTo(o2.getFullName());
				} else {
					return 0;
				}

			}

		});
		System.out.println("==== Danh sach sinh vien kha, gioi====");
		goodStudents.forEach(a -> a.showMyInfor());

		List<NormalStudent> normalStudents = NormalStudentDaoIpml.getListNormalStudentFromDB();
		Collections.sort(normalStudents, new Comparator<NormalStudent>() {
			@Override
			public int compare(NormalStudent o1, NormalStudent o2) {
				if (o1.getEntryTestSscore() == o2.getEntryTestSscore()) {
					if (o1.getEnglishScore() > o2.getEnglishScore()) {
						return -1;
					} else if (o1.getEnglishScore() == o2.getEnglishScore()) {
						return o1.getFullName().compareTo(o2.getFullName());
					} else {
						return -1;
					}

				} else if (o1.getEntryTestSscore() > o2.getEnglishScore()) {
					return -1;
				}
				return -1;
			}
		});
		System.out.println("====Danh sach sinh vien trung binh====");
		normalStudents.forEach(a -> a.showMyInfor());


		List<Student> listungTuyen = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong sinh vien can tuyen:   ");
		int n = sc.nextInt();
		
		for (int i = 0; i <goodStudents.size(); i++) {
			if (n > 0) {
				listungTuyen.add(goodStudents.get(i));
				n = n-1;
			}else {
				break;
			}
		}
		
		for (int i = 0; i <normalStudents.size(); i++) {
			if (n >0) {
				listungTuyen.add(normalStudents.get(i));
				n = n-1;
			}else {
				break;
			}
		}
		
		System.out.println("====DANH SACH TRUNG TUYEN====");
		for(Student stu :listungTuyen) {
			stu.showMyInfor();
		}
	}
}
