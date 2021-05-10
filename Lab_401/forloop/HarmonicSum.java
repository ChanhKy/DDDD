package exercise.forloop;

public class HarmonicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50000;
		double sumL2R  = printLeftToRight(n);
		double sumR2L  = printRightToLeft(n);
		System.out.printf("Difference: %.15f", (sumL2R - sumR2L));
		System.out.println();
	}


	private static double printLeftToRight(int n) {
		double sum = 0.0d;
		for ( int i =1; i<= n; i++) {
			sum += (double)1/ i;	
		}
		System.out.printf("Left - to - Right harmoic sum %.15f", sum);
		System.out.println();
		return sum;
	}
	
	private static double printRightToLeft(int n) {
		double sum =0.0;
		for ( int i = n; i >= 1; i--) {
			sum += (double)1/i;	
		}
		System.out.printf("Right-to-Left harmonic sum %.15f", sum);
		System.out.println();
		return sum;
	}


}
