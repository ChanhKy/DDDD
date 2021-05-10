package exercise.forloop;

public class SumAveragaRunningInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		double average;
		int lowerBround = 1;
		int upBround = 100;
		
		for ( int number = lowerBround; number <= upBround; number++	 ) {
			sum += number;
			
		}
		
		average = sum/upBround;
		System.out.println("Average of all 100 first number: " + average);
		System.out.println("Sums the 100 first number: " + sum);
	}

}
