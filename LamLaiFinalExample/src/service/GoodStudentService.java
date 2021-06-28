package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.GoodStudent;
import exception.InvalidDOBException;
import exception.InvalidFullNameException;
import exception.InvalidPhoneNumberxception;
import invalid.Invalidator;

public class GoodStudentService {

	public static List<GoodStudent> getListGoodStudent() {
		List<GoodStudent> goodStudents = new ArrayList<>();
		FileReader fr =null;
		BufferedReader br = null;
		try {
			fr = new FileReader("E:\\GoodStudent.csv");
			br = new BufferedReader(fr);
			String line = "";
			String [] infor;
			GoodStudent goodStudent = null;
			
			while ((line = br.readLine()) != null && !line.isEmpty()) {
				infor = line.split(",");
				try {
					Invalidator.isFullName(infor[0]);
					Invalidator.isDOB(infor[1]);
					Invalidator.isPhoneName(infor[3]);
					
					goodStudent = new GoodStudent(infor[0], new SimpleDateFormat("dd/MM/yyyy").parse(infor[1]), infor[2], infor[3], infor[4], infor[5], Double.parseDouble(infor[6]), infor[7]);
				goodStudents.add(goodStudent);
				}catch (InvalidDOBException | InvalidFullNameException | InvalidPhoneNumberxception e) {
					System.out.println(e.getMessage());
				}catch (Exception e) {
					System.out.println("input file have unknow erros!!! ");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return goodStudents;
		
	}
}
