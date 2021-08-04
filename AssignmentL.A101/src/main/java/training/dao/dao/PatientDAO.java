package training.dao.dao;

import java.util.List;

import training.entities.Patient;

public interface PatientDAO {
	public boolean insertDoctor(Patient patient);

	public List<Patient> getAllPatient();

	public List<Patient> getPatientById(int id);

	public boolean updateDoctorById(Patient patient);

	public boolean removeDoctor(Patient patient);

}
