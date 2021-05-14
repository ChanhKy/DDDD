package fa.training.methodoverloading;

public class TaxCollector {
	
	public static void main(String[] args) {
		
		// Tao 1 bien nhan gia tri dau tien cua ham main
		double  grossIncome = Double.parseDouble(args [0]);
	
	
		//Tao doi tuong cua lop BasicRateTax
		BasicRateTax taxCalculator = new BasicRateTax();
		
		//goi den ham calcTax
		double tax = taxCalculator.calcTax(grossIncome);
		
		System.out.println("Tax due is " + tax);
	
	}
}
