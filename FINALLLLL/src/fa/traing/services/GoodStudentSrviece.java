package fa.traing.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fa.training.dao.GoodstudentDaoIpml;
import fa.training.entites.GoodStudent;
import fa.training.exception.InvalidateDOBException;
import fa.training.exception.InvalidateFullNameException;
import fa.training.exception.InvalidatePhoneNumberException;
import fa.training.validate.invalidate;

public class GoodStudentSrviece {

	private static final String FILE_GOOD_STU = "D:\\LamLaiGoodStudent.csv";
	GoodstudentDaoIpml goodStudentDaoImpl = new GoodstudentDaoIpml();

	/**
	 * Phương thức đọc danh sách từ file CSV
	 */
	public static List<GoodStudent> getListReadGoodStudent() {
		System.out.println("1");
		List<GoodStudent> goodStudents = new ArrayList<>();
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(FILE_GOOD_STU);
			br = new BufferedReader(fr);
			String line = " ";
			String[] infor;
			GoodStudent stu = null;
			while ((line = br.readLine()) != null && !line.isEmpty()) {
				infor = line.split(",");
				try {
					invalidate.isFullName(infor[0]);
					invalidate.isDOB(infor[1]);
					invalidate.isPhoneNumber(infor[3]);

					stu = new GoodStudent(infor[0], new SimpleDateFormat("dd/MM/yyyy").parse(infor[1]), infor[2],
							infor[3], infor[4], infor[5], Double.parseDouble(infor[6]), infor[7]);
					goodStudents.add(stu);
				} catch (InvalidateFullNameException | InvalidateDOBException | InvalidatePhoneNumberException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					System.out.println("input file have unknow errors");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return goodStudents;

	}
	
	/**
	 * Phương thức hiển thị danh sách trên Database
	 */
	public void showDanhSachSinhVienFromDB() {
		List<GoodStudent> listGoodStu = goodStudentDaoImpl.getListGoodStudentFromDB();
		for (GoodStudent goodStudent : listGoodStu) {
			goodStudent.showMyInfor();
		}
	}
	
	/**
	 * Phương thức thêm mới 1 sinh viên lên DB
	 * được nhập từ bàn phím
	 */
	public void addGoodStudent() {
		GoodStudent goodStudent = new GoodStudent();
		goodStudent.input();
		if (goodStudentDaoImpl.addGoodStudent(goodStudent)) {
			System.out.println("=======them sinh vien kha, gioi thanh cong!");
		}else {
			System.out.println("=======them sinh vien that bai");
		}
	}
	/***
	 * 	Phương thức cập nhật điểm cho sinh theo số điện thoại tìm được
	 * 
	 */
	public void updateGpaGoodStudentByPhone() {
		Scanner sc = new Scanner(System.in);
		try {
			GoodStudent goodStudent = new GoodStudent();
			System.out.print("Nhap so dien thoai cua sinh vien: ");
			goodStudent.setPhone(sc.nextLine());
			System.out.print("Nhap diem moi cua Sinh vien: ");
			goodStudent.setGpa(Double.parseDouble(sc.nextLine()));
			if(goodStudentDaoImpl.updateGpaGoodStudentByPhone(goodStudent)) {
				System.out.println("cap nhat diem cho sinh vien thanh cong");
			}else {
				System.out.println("Cap nhat diem cho sinh vien that bai");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Phương thức xóa 1 sinh viên trên DB theo số điện thoại tìm được
	 */
	public void removeGoodStudentByPhone() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Danh sach sinh vien truoc khi xoa: ");
		showDanhSachSinhVienFromDB();
		try {
			System.out.print("Nhap so dien thoai cua sinh vien can xoa: ");
			String phone = sc.nextLine();
			if(goodStudentDaoImpl.removeGoodStudentByphone(phone)) {
				System.out.println("===== Xoa sinh vien thanh cong");
			} else {
				System.out.println("===== Xoa sinh vien that bai");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Danh sach sinh vien SAU khi xoa: ");
		showDanhSachSinhVienFromDB();
	}
}
