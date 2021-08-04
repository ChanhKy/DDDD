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
@Table(name = "DOCTOR")
public class Doctor {

	@Id
	@Column(name = "DOC_NUMBER")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int docNumber;

	@Column(name = "DOC_FIRSTNAME")
	private String docFirstName;

	@Column(name = "DOC_LASTNAME")
	private String docLastName;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor")
	private Set<Appointment> appointment;

	/* #################### */
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(String docFirstName, String docLastName) {
		super();
		this.docFirstName = docFirstName;
		this.docLastName = docLastName;
	}

	public int getDocNumber() {
		return docNumber;
	}

	public void setDocNumber(int docNumber) {
		this.docNumber = docNumber;
	}

	public String getDocFirstName() {
		return docFirstName;
	}

	public void setDocFirstName(String docFirstName) {
		this.docFirstName = docFirstName;
	}

	public String getDocLastName() {
		return docLastName;
	}

	public void setDocLastName(String docLastName) {
		this.docLastName = docLastName;
	}

	public Set<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(Set<Appointment> appointment) {
		this.appointment = appointment;
	}

	@Override
	public String toString() {
		return "Doctor [docNumber=" + docNumber + ", docFirstName=" + docFirstName + ", docLastName=" + docLastName
				+ ", appointment=" + appointment + "]";
	}

}
