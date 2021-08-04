package training.dao.dao;

import java.util.List;

import training.entities.Doctor;

public interface DoctorDAO {
	public boolean insertDoctor(Doctor doctor);
	
	public List<Doctor> getAllDoctors();
	
	public List<Doctor> getDoctorById(int id);
	
	public boolean updateDoctorById(Doctor doctor);
	
	public boolean removeDoctor(Doctor doctor);
}
