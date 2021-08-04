package training.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "BILL")
public class Bill {

	@Id
	@Column(name = "BILL_NUMBER")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billNumber;

	@Column(name = "BILL_DATE")
	@Temporal(TemporalType.DATE)
	private Date billDate;

	@Column(name = "BILL_STATUS")
	private String billStatus;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "bill")
	private Set<Payment> payments;

	@OneToOne
	@JoinColumn(name = "APP_ID")
	private Appointment appointment;

	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill(Date billDate, String billStatus,  Appointment appointment) {
		super();
		this.billDate = billDate;
		this.billStatus = billStatus;
	
		this.appointment = appointment;
	}

	public int getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public Set<Payment> getPayments() {
		return payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	@Override
	public String toString() {
		return "Bill [billNumber=" + billNumber + ", billDate=" + billDate + ", billStatus=" + billStatus + ", payment="
				+ payments + ", appointment=" + appointment + "]";
	}

}
