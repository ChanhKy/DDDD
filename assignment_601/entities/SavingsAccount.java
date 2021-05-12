package fa.training.entities;

public class SavingsAccount {
	private static double annuallInterestRate ;
	private double savingsBalance;
	
	public SavingsAccount() {
	
	}

	
	public SavingsAccount(double annuallInterestRate, double savingsBalance) {
		super();
		annuallInterestRate = 0.0;
		savingsBalance = 0.0;
	}
	
	//khoi tao 1 bien moi la so du
	public SavingsAccount (double balance) {
		savingsBalance = balance;
		annuallInterestRate = 0.0;
	}
	
	

	public double getAnnuallInterestRate() {
		return annuallInterestRate;
	}

	public void setAnnuallInterestRate(double annuallInterestRate) {
		this.annuallInterestRate = annuallInterestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public void calculateMonthlyInterest() {
		System.out.println("So du tiet kiem hien tai:  " + savingsBalance );
		
		//tao bien tien lai hang thang
		double monthlyInterest;
		//tinh lai hang thang = (so du tiet kiem * lai hang nam)/12
		monthlyInterest = (savingsBalance * annuallInterestRate)/12;
		
		//so du tiet kiem moi += tien lai hang thang
		savingsBalance += monthlyInterest;
		System.out.println("So du tiet kiem moi: " + savingsBalance);
	}
	// gọi get số dư thì trả về số dư tiết kiệm
	public double getBalance() {
		return savingsBalance;
	}
	
	// tạo phương thức sửa đổi lãi suất
	// sẽ trả về lãi suất mới
	public static void modifyInterestRate ( double newInterestRate) {
		annuallInterestRate = newInterestRate;
	}
	
}
