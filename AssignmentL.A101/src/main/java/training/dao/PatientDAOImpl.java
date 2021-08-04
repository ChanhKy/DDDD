package training.dao;

import java.util.List;

import org.hibernate.Session;

import training.dao.dao.PatientDAO;
import training.entities.Patient;
import training.utils.HibernateUtils;

public class PatientDAOImpl implements PatientDAO {

	public boolean insertDoctor(Patient patient) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(patient);
			session.getTransaction().commit();
			System.out.println("THEM MOI Patient THANH CONG!");
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

	public List<Patient> getAllPatient() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Patient> getPatientById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateDoctorById(Patient patient) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeDoctor(Patient patient) {
		// TODO Auto-generated method stub
		return false;
	}

}
