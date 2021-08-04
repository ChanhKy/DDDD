package training.dao;

import java.util.List;

import org.hibernate.Session;

import training.dao.dao.BillDAO;
import training.entities.Bill;
import training.utils.HibernateUtils;

public class BillDAOImpl implements BillDAO {

	public boolean insertBill(Bill bill) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(bill);
			session.getTransaction().commit();
			System.out.println("INSERT BILL THANH CONG! ");
		}catch(RuntimeException e) {
			e.printStackTrace();
		}finally {
			if (session != null ) {
				session.close();
			}
		}
		return false;
	}

	public List<Bill> getAllBill() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Bill> getBillById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateBillById(Bill bill) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeBill(Bill bill) {
		// TODO Auto-generated method stub
		return false;
	}

}
