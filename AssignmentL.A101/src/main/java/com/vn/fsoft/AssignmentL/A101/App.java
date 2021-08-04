package com.vn.fsoft.AssignmentL.A101;

import java.util.Date;

import training.dao.AppointmentDAOImpl;
import training.dao.BillDAOImpl;
import training.dao.DoctorDAOImpl;
import training.dao.PatientDAOImpl;
import training.dao.PaymentDAOImpl;
import training.entities.Appointment;
import training.entities.Bill;
import training.entities.Doctor;
import training.entities.Patient;
import training.entities.Payment;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.out.println("Hello HIBERNATE!");
		DoctorDAOImpl doctorDAOImpl = new DoctorDAOImpl();
		PatientDAOImpl patientDAOImpl = new PatientDAOImpl();
		AppointmentDAOImpl appointmentDAOImpl = new AppointmentDAOImpl();
		PaymentDAOImpl paymentDAOImpl = new PaymentDAOImpl();
		BillDAOImpl billDAOImpl = new BillDAOImpl();

		// Them moi 1 doctor
		Doctor doctor1 = new Doctor("Nguyen", "Chanh Ky");
		// Insert vao Database
		doctorDAOImpl.insertDoctor(doctor1);

		// them moi benh nhan
		Patient p1 = new Patient("Nguyen ", "Nam1", "DN", "DN", "VN");
		Patient p2 = new Patient("Nguyen", "Nam2", "Hue", "Hue", "VN");
		Patient p3 = new Patient("Nguyen", "Nam3", "QNam", "QN", "VN");
		// insert vao Database
		patientDAOImpl.insertDoctor(p1);
		patientDAOImpl.insertDoctor(p2);
		patientDAOImpl.insertDoctor(p3);

		// thm moi Appointment
		Appointment ap1 = new Appointment(new Date("01/2/2020"), new Date(2020, 2, 10, 12, 35, 45), 15, 123456,doctor1, p1);
		Appointment ap2 = new Appointment(new Date("01/2/2020"), new Date(2020, 2, 12, 13, 30, 00), 30, 123457, doctor1, p2);
		Appointment ap3 = new Appointment(new Date("01/2/2020"), new Date(2020, 2, 13, 15, 30, 00), 30, 123458, doctor1, p3);
		//Insert vao Database
		appointmentDAOImpl.insertAppointment(ap1);
		appointmentDAOImpl.insertAppointment(ap2);
		appointmentDAOImpl.insertAppointment(ap3);
		
		// Them moi bill
		Bill b1 = new Bill(new Date("01/02/2020"), "Chua Thanh Toan", ap1);
		billDAOImpl.insertBill(b1);

		//them moi Payment
		Payment pay1 = new Payment(new Date("01/02/2020"), "ABC", 100000, p1, b1);
		paymentDAOImpl.insertPayment(pay1);
		
		System.out.println("THE END");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
