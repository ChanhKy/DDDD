package training.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import trainging.entities.Movie;
import training.utils.HibernateUtils;

public class MovieDAOImpl implements MovieDAO {

	public boolean insertMovie(Movie movie) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(movie);
			session.getTransaction().commit();
			System.out.println("Them moi Movie thanh cong!!!");
		} catch (RuntimeException e) {
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
		return true;
	}

	public List<Movie> getAllMovie() {
		Session session = HibernateUtils.getSessionFactory().openSession();
		List<Movie> movies = null;
		try {
			session.beginTransaction();
			movies = session.createQuery("FROM Movie").list();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return movies;
	}

	public List<Movie> getMovieById(int id) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		List<Movie> movies = null;
		try {
			session.beginTransaction();
			movies = session.createQuery("FROM Movie WHERE id =:id").setParameter("id", id).list();

		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return movies;
	}

	public boolean updateMovieById(Movie movie) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		int count = 0;
		try {
			session.beginTransaction();
			String sql = "UPDATE Movie SET Actor =:actor WHERE id =:id";
			Query query = session.createQuery(sql);
			query.setParameter("actor", movie.getActor());
			query.setParameter("id", movie.getMovieId());
			count = query.executeUpdate();
			session.getTransaction().commit();
		}catch(RuntimeException e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return true;
	}
}
