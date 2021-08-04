package training.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	static SessionFactory sessionFactory;
	static {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		if (sessionFactory == null ) {
			sessionFactory = cfg.buildSessionFactory();
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}