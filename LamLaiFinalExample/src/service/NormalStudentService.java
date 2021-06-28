package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.NormalStudent;
import exception.InvalidDOBException;
import exception.InvalidFullNameException;
import exception.InvalidPhoneNumberxception;
import invalid.Invalidator;

public class NormalStudentService {
	public static List<NormalStudent> getListNormalStudent() {
		List<NormalStudent> normalStudents = new ArrayList<>();
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("E:\\NormalStudent.csv");
			br = new BufferedReader(fr);
			String line = "";
			String[] infor;
			NormalStudent normalStudent = null;
			
			while ((line = br.readLine()) != null && !line.isEmpty()) {
				infor = line.split(",");
				try {
					Invalidator.isFullName(infor[0]);
					Invalidator.isDOB(infor[1]);
					Invalidator.isPhoneName(infor[3]);
					
				normalStudent = new NormalStudent(infor[0], new SimpleDateFormat("dd/MM/yyyy").parse(infor[1]), infor[2], infor[3], infor[4], infor[5], Integer.parseInt(infor[6]), Double.parseDouble(infor[7]));
				normalStudents.add(normalStudent);
				}catch (InvalidDOBException| InvalidPhoneNumberxception| InvalidFullNameException e) {
					System.out.println(e.getMessage());
				}catch (Exception e) {
					System.out.println("input file have unknow erros!!!");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return normalStudents;
	}
}
