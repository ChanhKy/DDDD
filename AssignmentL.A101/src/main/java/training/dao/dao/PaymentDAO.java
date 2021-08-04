package training.dao.dao;

import java.util.List;

import training.entities.Payment;

public interface PaymentDAO {
	public boolean insertPayment(Payment payment);

	public List<Payment> getAllPayment();

	public List<Payment> getPaymentById(int id);

	public boolean updatePaymentById(Payment payment);

	public boolean removePayment(Payment payment);
}
