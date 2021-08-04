package training.dao;

import java.util.List;

import org.hibernate.Session;

import training.dao.dao.PaymentDAO;
import training.entities.Payment;
import training.utils.HibernateUtils;

public class PaymentDAOImpl implements PaymentDAO {

	public boolean insertPayment(Payment payment) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(payment);
			session.getTransaction().commit();
			System.out.println("INSERT Payment THANH CONG!");
		}catch(RuntimeException e) {
			e.printStackTrace();
		}finally {
			if (session != null) {
				session.close();
			}
		}
		return false;
	}

	public List<Payment> getAllPayment() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Payment> getPaymentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updatePaymentById(Payment payment) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removePayment(Payment payment) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
