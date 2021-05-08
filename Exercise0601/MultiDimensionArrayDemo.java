package lab301;

public class MultiDimensionArrayDemo {
	public static void main(String[] args) {
		int [][] matrix = new int[2][2];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[1][0] = 3;
		matrix[1][1] = 4;
		
		System.out.println("Element at second rpw and first column is: " +matrix[1][0]);
		System.out.println("Number of rows: " + matrix.length);
		System.out.println("number of column: "  + matrix[0].length);
	}
}
