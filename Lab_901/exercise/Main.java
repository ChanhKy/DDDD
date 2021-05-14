package exercise;

public class Main {
	public static void main(String[] args) {
		PairManagement  pairmanagement = new PairManagement();
		System.out.println("Before switch: " + pairmanagement.getList());
		pairmanagement.switchPair();
		System.out.println("After switch: " + pairmanagement.getList());
	}
}
