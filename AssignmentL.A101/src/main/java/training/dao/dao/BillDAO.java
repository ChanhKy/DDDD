package training.dao.dao;

import java.util.List;

import training.entities.Bill;

public interface BillDAO {

	public boolean insertBill(Bill bill);

	public List<Bill> getAllBill();

	public List<Bill> getBillById(int id);

	public boolean updateBillById(Bill bill);

	public boolean removeBill(Bill bill);
}
