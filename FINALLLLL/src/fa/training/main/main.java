package fa.training.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fa.traing.services.GoodStudentSrviece;
import fa.traing.services.NormalStudentService;
import fa.traing.services.StudentService;
import fa.training.comman.DatabaseConnection;
import fa.training.dao.GoodstudentDaoIpml;
import fa.training.dao.NormalStudentDaoIpml;
import fa.training.entites.GoodStudent;
import fa.training.entites.NormalStudent;

public class main {

	public static void main(String[] args) {
		DatabaseConnection.getConnection();
		List<GoodStudent> listGoodStudents = new ArrayList<GoodStudent>();
		List<NormalStudent> listNormalStudents = new ArrayList<NormalStudent>();
		StudentService studentService = new StudentService();
		GoodstudentDaoIpml goodStudentDaoImpl = new GoodstudentDaoIpml();
		GoodStudentSrviece goodStudentService = new GoodStudentSrviece();
		NormalStudentDaoIpml normalStudentImpl = new NormalStudentDaoIpml();
		NormalStudentService normalStudentService = new NormalStudentService();
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			showMenu();
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println();
				listGoodStudents = goodStudentService.getListReadGoodStudent();
				for (GoodStudent goodStudent : listGoodStudents) {
					goodStudent.showMyInfor();
				}
				break;
			case 2:
				listNormalStudents = normalStudentService.getListNormalStudent();
				for (NormalStudent normalStudent : listNormalStudents) {
					normalStudent.showMyInfor();
				}
				break;
			case 3:
				goodStudentDaoImpl.insertFileGoodStudentToDB();
				break;
			case 4:
				normalStudentImpl.insertNormalStudentToDB();
				break;
			case 5:
				goodStudentService.showDanhSachSinhVienFromDB();
				break;
			case 6:
				
				break;
			case 7:
				goodStudentService.addGoodStudent();
				break;
			case 8:
				normalStudentService.addNormalStudent();
				break;
			case 9:
				goodStudentService.updateGpaGoodStudentByPhone();
				break;
			case 10:
				break;
			case 11:
				goodStudentService.removeGoodStudentByPhone();
				break;
			case 12:
				break;
			case 13: 
				studentService.listTuyenDung();
				break;
			default: 
				System.out.println("Vui long nhap lai...");
				break;
			case 0: 
				System.out.println("Ban da thoat chong trinh, hen gap lai!");
			}
			
		}while(choice !=0);
		
	}
	public static void showMenu() {
		System.out.println("+------------------------------------------------+");
		System.out.println("|                CHỌN CHỨC NĂNG               	 |");
		System.out.println("| 1. Đọc dữ liệu từ file GoodStudent CSV         |");
		System.out.println("| 2. Đọc sữ liệu từ file NormalStudent CSV       |");
		System.out.println("| 3. Ghi file GoodStudent lên Database           |");
		System.out.println("| 4. Ghi file NormalStudent lên Database         |");
		System.out.println("| 5. Hien thi goodStudent tren Database          |");
		System.out.println("| 6. Hien thi normalStudent tren Database        |");
		System.out.println("| 7. Them moi goodStudent tren Database          |");
		System.out.println("| 8. Them moi normalStudent tren Database        |");
		System.out.println("| 9. Cap nhat diem gpa goodStudent theo phone    |");
		System.out.println("| 10.Cap nhat diem TOEIC normalStudent theo phone|");
		System.out.println("| 11.Xoa goodStudent theo so dien thoai          |");
		System.out.println("| 12.Xoa normalStudent theo so dien thoai        |");
		System.out.println("| 13.Danh sach tuyen dung                        |");
		System.out.println("| 0. Chọn 0 để thoát chương trình                |");
		System.out.println("+------------------------------------------------+");
	}
	

}
