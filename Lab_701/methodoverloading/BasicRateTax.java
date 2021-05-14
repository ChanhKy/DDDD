package fa.training.methodoverloading;

public class BasicRateTax {
	private static final double BASE_INCOM = 1000.00;
	private static final double BASE_TAX_RATE = 0.2;
	
	// tra ve 20% thue tu thu nha on dinh
	public double calcTax() {
		
		return BASE_INCOM * BASE_TAX_RATE;
	}
	
	
	public double calcTax(double grossIncome) {
		if (grossIncome < BASE_INCOM) {
			return calcTax();
		}
		
		return grossIncome * BASE_TAX_RATE;
	}
}
