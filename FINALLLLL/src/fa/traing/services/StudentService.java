package fa.traing.services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
	public static void main(String[] args) throws IOException {

//		listTuyenDung();
//		danhsachDiemTiengAnh();
//		writeFileTuyenDung();
		listSapXep();

	}
	public static void listSapXep() {
		List<GoodStudent> goodStudents = GoodstudentDaoIpml.getListGoodStudentFromDB();
		List<NormalStudent> normalStudents = NormalStudentDaoIpml.getListNormalStudentFromDB();
		List<Student> danhSachSapXep = new ArrayList<Student>();
		danhSachSapXep.addAll(goodStudents);
		danhSachSapXep.addAll(normalStudents);
		System.out.println("Danh sach sinh vien truoc khi sap xep: ");
		for (Student student : danhSachSapXep) {
			student.showMyInfor();
		}
		
		Collections.sort(danhSachSapXep, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
			if (o2.getFullName().compareTo(o1.getFullName()) == 0 ) {
				return o1.getPhone().compareTo(o2.getPhone());
			}
			return o2.getFullName().compareTo(o1.getFullName());
		
			}
		});
		System.out.println("Danh sach sau khi sap xep ====> ");
		danhSachSapXep.forEach(a -> {
			a.showMyInfor();
		});
	}
	
	/***
	 * Phương thức sắp xếp và lọc ra các sinh viên ứng tuyển
	 * @return
	 */
	public static List<Student> listTuyenDung() {
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
		
		for (int i = 0; i < goodStudents.size(); i++) {
			if (n > 0) {
				listungTuyen.add(goodStudents.get(i));
				n = n - 1;
			} else {
				break;
			}
		}

		for (int i = 0; i < normalStudents.size(); i++) {
			if (n > 0) {
				listungTuyen.add(normalStudents.get(i));
				n = n - 1;
			} else {
				break;
			}
		}

		System.out.println("====DANH SACH TRUNG TUYEN====");
		for (Student stu : listungTuyen) {
			stu.showMyInfor();

		}
		return listungTuyen;
	}
	
	public static void writeFileTuyenDung() throws IOException {
		try (FileWriter fw = new FileWriter("D:\\FileStudent.csv"); BufferedWriter write = new BufferedWriter(fw);) {
			StudentService service = new StudentService();
			service.listTuyenDung().forEach(stu -> {
				try {
//					write.write(stu.toString());
					write.write(stu.getFullName());
					write.newLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/***
	 * Sắp xếp theo tên sinh viên với điểm tiếng anh giảm dần
	 */
	public static void danhsachDiemTiengAnh() {
		List<NormalStudent> nors = NormalStudentDaoIpml.getListNormalStudentFromDB();
		for (NormalStudent normalStudent : nors) {
			normalStudent.showMyInfor();
		}
		Collections.sort(nors, new Comparator<NormalStudent>() {

			@Override
			public int compare(NormalStudent o1, NormalStudent o2) {
				if (o1.getEnglishScore() > o2.getEnglishScore()) {
					return -1;
				} else if (o1.getEnglishScore() == o2.getEnglishScore()) {
					return o1.getFullName().compareTo(o2.getFullName());
				} else {
					return 0;
				}
			}
		});
		System.out.println("Danh sách sinh vien co diem tieng anh");
		nors.forEach(a -> a.showMyInfor());
	}
	
}
