package exercise1;

public class exercise2 {
	public static void main(String[] args) {
		Integer []	list = {10,20,25,63,96,67};
		exercise2 exr = new exercise2();
		exr.maximum(list);
	}
	
	public Integer[] maximum (Integer [] list) {
		
		//Khai bao biến tạm
		int temp;
		for (int i = 0; i < list.length; i++) {
			for ( int j = i + 1; j < list.length; j ++ ) {
				if ( list[i] > list[j]) {
					//Nếu giá trị i > j 
					//thì sẽ gán i cho temp, 
					// lúc này i nhận giá trị j
					// j sẽ nhận temp
					temp = list[i] ;
					list[i ] = list[j] ;
					list[j] = temp;
				}
			}
		}
		System.out.println(" The first largest number is  :: " + list[list.length -1]);
		System.out.println(" Third second largest number is :: " + list[list.length - 2]) ;
	 return list;
	}
}
