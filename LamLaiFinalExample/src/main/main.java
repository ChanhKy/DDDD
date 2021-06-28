package main;

import java.util.List;

import common.DatabaseConnection;
import dao.GoodStudentDaoImpl;
import dao.NormalStudentDaoImpl;
import entities.GoodStudent;
import entities.NormalStudent;
import service.GoodStudentService;
import service.NormalStudentService;

public class main {
	public static void main(String[] args) {
		DatabaseConnection.getConnection();
//		List<GoodStudent> goodStudents = GoodStudentService.getListGoodStudent();
//		for (GoodStudent goodStudent : goodStudents) {
//			System.out.println(goodStudent);
//		}
//		
//		List<NormalStudent> normalStudent = NormalStudentService.getListNormalStudent();
//		for (NormalStudent normalStudent2 : normalStudent) {
//			System.out.println(normalStudent2);
//		}
		
//		GoodStudentDaoImpl goodStudentDaoImpl = new GoodStudentDaoImpl();
//		goodStudentDaoImpl.insertFileGoodStudentToDB();
		
		NormalStudentDaoImpl normalStudentDaoImpl = new NormalStudentDaoImpl();
		normalStudentDaoImpl.insertNormalStudentToDB();
	}
}
