package exercise;

public class Complex {
	private double realpart;
	private double imaginaryPart;
	
	public Complex() {
		this.realpart = 0.0;
		this.imaginaryPart = 0.0;
		System.out.println("Complex khong co tham so");
	}

	public Complex(double realpart, double imaginaryPart) {
		super();
		this.realpart = realpart;
		this.imaginaryPart = imaginaryPart;
		System.out.println("Complex voi 2 tham so");
	}

	public double getRealpart() {
		return realpart;
	}

	public void setRealpart(double realpart) {
		this.realpart = realpart;
	}

	public double getImaginaryPart() {
		return imaginaryPart;
	}

	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	
	// Phuong thuc tong cua So Phuc hien tai 
	// va So Phuc truyen vao
	
	public Complex add(Complex otherNumber) {
		
		//tao bien phan nguyen cua so Phuc
		double resultRealPart = this.realpart + otherNumber.realpart;
		
		//tao bien phan ao cua so 
		double resultImaginaryPart = this.imaginaryPart + otherNumber.imaginaryPart;
		
		// Bien moi luu phan nguyen va phaan ao
		
		Complex resultNumber = new Complex(resultRealPart, resultImaginaryPart);
		return resultNumber;
		
	}

	@Override
	public String toString() {
		return "Complex [realpart= " + realpart + ", imaginaryPart= " + imaginaryPart + "]";
	}
	
	
	
	
}
