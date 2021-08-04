package training.dao.dao;

import java.util.List;

import training.entities.Appointment;

public interface AppointmentDAO {

	public boolean insertAppointment(Appointment appointment);

	public List<Appointment> getAllAppointment();

	public List<Appointment> getAppointmentById(int id);

	public boolean updateDoctorById(Appointment appointment);

	public boolean removeDoctor(Appointment appointment);
}
