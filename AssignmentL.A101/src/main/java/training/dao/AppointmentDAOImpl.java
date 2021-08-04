package training.dao;

import java.util.List;

import org.hibernate.Session;

import training.dao.dao.AppointmentDAO;
import training.entities.Appointment;
import training.utils.HibernateUtils;

public class AppointmentDAOImpl implements AppointmentDAO {

	public boolean insertAppointment(Appointment appointment) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(appointment);
			session.getTransaction().commit();
			System.out.println("THEM MOI Appointment THANH CONG!");
		} catch (RuntimeException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return true;
	}

	public List<Appointment> getAllAppointment() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Appointment> getAppointmentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateDoctorById(Appointment appointment) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeDoctor(Appointment appointment) {
		// TODO Auto-generated method stub
		return false;
	}

}
