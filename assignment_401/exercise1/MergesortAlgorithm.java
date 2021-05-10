package exercise1;

import java.util.Arrays;

public class MergesortAlgorithm {
	
	public static void main(String[] args) {
		MergesortAlgorithm obj	 = new MergesortAlgorithm();
		Integer [] list = {15, 5 , 48, 12, 36 ,56, 10};
		
		System.out.println(" Original Array");
		System.out.println(Arrays.toString(list));
		
		obj.megerSort(list, 0, list.length-1 );
		System.out.println("Sortted Array: ");
		System.out.println(Arrays.toString(list));
	}
	// Hợp nhất 2 mảng con thành 1 mảng
	void meger(Integer [] list , int left, int right, int m) {
		int n1 = m - left +1;
		//int n1 = right - left + 1;
		int n2 = right - m;
		
		
		int leftArr [] = new int [n1];
		int rightArr [] = new int [n2];
		
		//Thêm phần tử vào 2 mảng
		for (int i =0; i <n1; i++) 
			leftArr[i] = list[left + i];
		
		for (int j = 0; j < n2; j++) 
			rightArr[j] = list[m + 1 +j];
		
		// Khởi tạo giá trị cho biến của mảng con và mảng chính
		int i =0, j = 0;
		//int k = 0;
		int k = left;
		
		// khi đến cuối mảng thì chọn ra mảng lớn hơn
		// các phần tử được thay thế chính xác vào vị trí array k
		// sử dụng dắp xếp giảm dần
		// để so sánh Leftarr >< rightArr
		while ( i < n1 && j < n2) {
			if (leftArr[i] <=  rightArr[j]) {
				list[k] = leftArr[i];
				i++;
			} else {
				list[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		// các phần tử còn lại vào arr k
		while ( i < n1) {
			list[k] = leftArr[i];
			i++;
			k++;
		}
		while ( j < n2) {
			list[k] = rightArr[j];
			j++;
			k++;
		}
		
//		System.out.println("list left" + Arrays.toString(leftArr));
//		System.out.println("list right" + Arrays.toString(rightArr));
//		System.out.println("list" + Arrays.toString(list));
	}
	
	// chia mang thanh 2 mang con, và sap xep chung
	public void megerSort(Integer [] list, int left, int right) {
		if ( left < right) {
			
			
			//chia thành 2 mảng tại m
			int m = (left + right) / 2;
			
			// gọi đến 2 mảng
			megerSort(list, left, m);
			megerSort(list, m+1, right);	
			
			meger(list, left, right,m);
			
		}
		//return list;
	}
}
