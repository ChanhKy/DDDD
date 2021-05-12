package fa.training.main;

import fa.training.entities.SavingsAccount;

public class SavingsAccountTest {
	public static void main(String[] args) {
		SavingsAccount save1 = new SavingsAccount(2000);
		SavingsAccount save2 = new SavingsAccount(3000);
		
		save1.modifyInterestRate(.04);
		save1.calculateMonthlyInterest();
		save2.modifyInterestRate(.04);
		save2.calculateMonthlyInterest();
		save1.modifyInterestRate(.05);
		save1.calculateMonthlyInterest();
		save2.modifyInterestRate(.05);
		save2.calculateMonthlyInterest();
	}
}
