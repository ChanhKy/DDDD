package fa.traing.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fa.training.dao.NormalStudentDaoIpml;
import fa.training.entites.NormalStudent;
import fa.training.exception.InvalidateDOBException;
import fa.training.exception.InvalidateFullNameException;
import fa.training.exception.InvalidatePhoneNumberException;
import fa.training.validate.invalidate;

public class NormalStudentService {
	private static final String FILE_NORMAL_STU = "D:\\LamLaiNormalStudent.csv";
	NormalStudentDaoIpml normalStudentDaoImpl = new NormalStudentDaoIpml();
	/**
	 * Phương thức đọc danh sách từ file CSV
	 */

	public static List<NormalStudent> getListNormalStudent() {
		List<NormalStudent> normalStudent = new ArrayList<>();
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(FILE_NORMAL_STU);
			br = new BufferedReader(fr);
			String line = " ";
			String[] infor;
			NormalStudent stu = null;
			while ((line = br.readLine()) != null && !line.isEmpty()) {
				infor = line.split(",");
				try {
					invalidate.isFullName(infor[0]);
					invalidate.isDOB(infor[1]);
					invalidate.isPhoneNumber(infor[3]);

					stu = new NormalStudent(infor[0], new SimpleDateFormat("dd/MM/yyyy").parse(infor[1]), infor[2],
							infor[3], infor[4], infor[5], Integer.parseInt(infor[6]), Double.parseDouble(infor[7]));
					normalStudent.add(stu);

				} catch (InvalidateFullNameException | InvalidateDOBException | InvalidatePhoneNumberException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					System.out.println("input file have unknow errors");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return normalStudent;
	}
	
	/**
	 * Phương thức thêm mới 1 sinh viên TB
	 */
	public void addNormalStudent() {
		NormalStudent normalStudent = new NormalStudent();
		normalStudent.input();
		if (normalStudentDaoImpl.addNormalStudent(normalStudent)) {
			System.out.println("=======Them sinh vien thanh cong!");
		} else {
			System.out.println("=======Them sinh that bai");
		}
	}
	
	/**	Phương thức update fullName by phone
	 * 	Nhap vao tên mới theo số điệtn thoạt
	 * 
	 */
	public void updateEnglishScoreNameNormalStudentByPhone() {
		Scanner sc = new Scanner(System.in);
		try {
			NormalStudent normalStudent = new NormalStudent();
			System.out.print("Nhap so dien thoai cua sinh vien: ");
			normalStudent.setPhone(sc.nextLine());
			System.out.print("Nhap diem TOEIC moi cua sinh vien:");
			normalStudent.setEnglishScore(Integer.parseInt(sc.nextLine()));
			if (normalStudentDaoImpl.updateEnlishScoreNormalStudentByPhone(normalStudent)) {
				System.out.println("Cap nhat diem cho sinh vien thanh cong!");
			}else {
				System.out.println("Cap nhat diem cho sinh vien that bai");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
