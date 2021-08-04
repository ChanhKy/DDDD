package training.dao;

import java.util.List;

import org.hibernate.Session;

import trainging.entities.Type;
import training.utils.HibernateUtils;

public class TypeDAOImpl implements TypeDAO {


	public boolean insertType(Type type) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(type);
			session.getTransaction().commit();
			System.out.println("Them moi TYPE thanh cong!");
			
		} catch (RuntimeException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return true;
		
	}

	public List<Type> getAllType() {
		// TODO Auto-generated method stub
		return null;
	}

	public Type getTypeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateTypeById(Type type) {
		// TODO Auto-generated method stub
		return 0;
	}
}
