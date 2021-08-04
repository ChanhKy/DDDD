package training.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PATIENT")
public class Patient {

	@Id
	@Column(name = "PAT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patId;

	@Column(name = "PAT_FIRSTNAME")
	private String patFirstName;

	@Column(name = "PAT_LASTNAME")
	private String patLastName;

	@Column(name = "PAT_ADDRESS")
	private String patAddress;

	@Column(name = "PAT_CITY")
	private String patCity;

	@Column(name = "PAT_STATE")
	private String patState;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "patient")
	private Set<Appointment> appoitnments;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "patient")
	private Set<Payment> payments;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String patFirstName, String patLastName, String patAddress, String patCity, String patState) {
		super();
		this.patFirstName = patFirstName;
		this.patLastName = patLastName;
		this.patAddress = patAddress;
		this.patCity = patCity;
		this.patState = patState;
	}

	public int getPatId() {
		return patId;
	}

	public void setPatId(int patId) {
		this.patId = patId;
	}

	public String getPatFirstName() {
		return patFirstName;
	}

	public void setPatFirstName(String patFirstName) {
		this.patFirstName = patFirstName;
	}

	public String getPatLastName() {
		return patLastName;
	}

	public void setPatLastName(String patLastName) {
		this.patLastName = patLastName;
	}

	public String getPatAddress() {
		return patAddress;
	}

	public void setPatAddress(String patAddress) {
		this.patAddress = patAddress;
	}

	public String getPatCity() {
		return patCity;
	}

	public void setPatCity(String patCity) {
		this.patCity = patCity;
	}

	public String getPatState() {
		return patState;
	}

	public void setPatState(String patState) {
		this.patState = patState;
	}

	public Set<Appointment> getAppoitnments() {
		return appoitnments;
	}

	public void setAppoitnments(Set<Appointment> appoitnments) {
		this.appoitnments = appoitnments;
	}

	public Set<Payment> getPayments() {
		return payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

	@Override
	public String toString() {
		return "Patient [patId=" + patId + ", patFirstName=" + patFirstName + ", patLastName=" + patLastName
				+ ", patAddress=" + patAddress + ", patCity=" + patCity + ", patState=" + patState + ", appoitnments="
				+ appoitnments + ", payments=" + payments + "]";
	}

}
