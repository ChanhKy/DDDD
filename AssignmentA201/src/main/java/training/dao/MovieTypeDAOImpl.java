package training.dao;

import org.hibernate.Session;

import trainging.entities.MovieType;
import training.utils.HibernateUtils;

public class MovieTypeDAOImpl {

	public void insertMovieType(MovieType movieType) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(movieType);
			session.getTransaction().commit();
			System.out.println("Them moi Movie Type thanh cong!!");
		} catch (RuntimeException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
}
