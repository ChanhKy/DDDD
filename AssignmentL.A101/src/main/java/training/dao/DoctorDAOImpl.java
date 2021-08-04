package training.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import training.dao.dao.DoctorDAO;
import training.entities.Doctor;
import training.utils.HibernateUtils;

public class DoctorDAOImpl implements DoctorDAO {

	public boolean insertDoctor(Doctor doctor) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(doctor);
			session.getTransaction().commit();
			System.out.println("THEM MOI DOCTOR THANH CONG!");
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

	@SuppressWarnings("unchecked")
	public List<Doctor> getAllDoctors() {
		Session session = HibernateUtils.getSessionFactory().openSession();
		List<Doctor> doctors = null;
		try {
			session.beginTransaction();
			doctors = session.createQuery("FROM DOCTOR").list();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return doctors;
	}

	@SuppressWarnings("unchecked")
	public List<Doctor> getDoctorById(int id) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		List<Doctor> doctors = null;
		try {
			session.beginTransaction();
			doctors = session.createQuery("FROM DOCTOR WHERE id =:id").setParameter("id", id).list();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return doctors;
	}

	public boolean updateDoctorById(Doctor doctor) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			String sql = "UPDATE DOCTOR SET DOC_LASTNAME =: lastname WHERE id =:id";
			Query query = session.createQuery(sql);
			query.setParameter("lastname", doctor.getDocLastName());
			query.setParameter("id", doctor.getDocNumber());
			query.executeUpdate();
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return true;
	}

	public boolean removeDoctor(Doctor doctor) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.delete(doctor);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return true;
	}

}
