package training.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PAYMENT")

public class Payment {
	@Id
	@Column(name = "PAY_RECEIPTNUM")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int payReceiptnum;

	@Column(name = "PAY_DATE")
	private Date payDate;

	@Column(name = "PAY_METHOD")
	private String payMethod;

	@Column(name = "PAY_AMOUNT")
	private int payAmount;

	@ManyToOne
	@JoinColumn(name = "PAT_ID",  referencedColumnName = "PAT_ID")
	private Patient patient;

	@ManyToOne
	@JoinColumn(name = "BILL_NUMBER",  referencedColumnName = "BILL_NUMBER")
	private Bill bill;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(Date payDate, String payMethod, int payAmount, Patient patient, Bill bill) {
		super();
		this.payDate = payDate;
		this.payMethod = payMethod;
		this.payAmount = payAmount;
		this.patient = patient;
		this.bill = bill;
	}

	public int getPayReceiptnum() {
		return payReceiptnum;
	}

	public void setPayReceiptnum(int payReceiptnum) {
		this.payReceiptnum = payReceiptnum;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public int getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(int payAmount) {
		this.payAmount = payAmount;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "Payment [payReceiptnum=" + payReceiptnum + ", payDate=" + payDate + ", payMethod=" + payMethod
				+ ", payAmount=" + payAmount + ", patient=" + patient + ", bill=" + bill + "]";
	}

}
