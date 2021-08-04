package training.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "APPOINTMENT")
public class Appointment {
	@Id
	@Column(name = "APP_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appId;

	@Column(name = "APP_DATE")
	@Temporal(TemporalType.DATE)
	private Date appDate;

	@Column(name = "APP_TIME")
	@Temporal(TemporalType.TIME)
	private Date appTime;

	@Column(name = "APP_DURATION")
	private int appDuration;

	@Column(name = "APP_REASON")
	private int appReason;

	@ManyToOne
	@JoinColumn(name = "DOC_NUMBER", referencedColumnName = "DOC_NUMBER")
	private Doctor doctor;

	@ManyToOne
	@JoinColumn(name = "PAT_ID", referencedColumnName = "PAT_ID")
	private Patient patient;

	@OneToOne(mappedBy = "appointment")
	private Bill bill;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(Date appDate, Date appTime, int appDuration, int appReason, Doctor doctor, Patient patient) {
		super();

		this.appDate = appDate;
		this.appTime = appTime;
		this.appDuration = appDuration;
		this.appReason = appReason;
		this.doctor = doctor;
		this.patient = patient;
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public Date getAppDate() {
		return appDate;
	}

	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}

	public Date getAppTime() {
		return appTime;
	}

	public void setAppTime(Date appTime) {
		this.appTime = appTime;
	}

	public int getAppDuration() {
		return appDuration;
	}

	public void setAppDuration(int appDuration) {
		this.appDuration = appDuration;
	}

	public int getAppReason() {
		return appReason;
	}

	public void setAppReason(int appReason) {
		this.appReason = appReason;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Appointment [appId=" + appId + ", appDate=" + appDate + ", appTime=" + appTime + ", appDuration="
				+ appDuration + ", appReason=" + appReason + ", doctor=" + doctor + ", patient=" + patient + "]";
	}

}
