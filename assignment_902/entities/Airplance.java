package fa.training.entities;

import java.io.Serializable;

public abstract class Airplance implements Serializable {
	public String ID;
	public String model;
	public double cruiseSpeed;
	public double emptyWeight;
	public double maxTakeOff;
	
	
	public Airplance()  {
		super();

	}
	public Airplance(String iD, String model, double cruiseSpeed, double emptyWeight, double maxTakeOff) {
		super();
		ID = iD;
		this.model = model;
		this.cruiseSpeed = cruiseSpeed;
		this.emptyWeight = emptyWeight;
		this.maxTakeOff = maxTakeOff;
	}
	
	public abstract void fly();
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getCruiseSpeed() {
		return cruiseSpeed;
	}
	public void setCruiseSpeed(double cruiseSpeed) {
		this.cruiseSpeed = cruiseSpeed;
	}
	public double getEmptyWeight() {
		return emptyWeight;
	}
	public void setEmptyWeight(double emptyWeight) {
		this.emptyWeight = emptyWeight;
	}
	public double getMaxTakeOff() {
		return maxTakeOff;
	}
	public void setMaxTakeOff(double maxTakeOff) {
		this.maxTakeOff = maxTakeOff;
	}
	@Override
	public String toString() {
		return "Airplance [ID=" + ID + ", model=" + model + ", cruiseSpeed=" + cruiseSpeed + ", emptyWeight="
				+ emptyWeight + ", maxTakeOff=" + maxTakeOff + "]";
	}
	
	
}
