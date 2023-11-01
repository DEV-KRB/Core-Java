package withLogic;

import java.util.Arrays;

public class Insertion {

	public static void InsertionSort(int arr[]) {
		
		for(int i=1; i<arr.length; i++) {
			int current =  arr[i];
			int j=i-1;
			while(j>=0&&current<arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			//placement
			arr[j+1] = current;
		}
	}
	
	public static void main(String[] args) {
		
		int arrO[] = {21,1,22,2,23,3,24,4};
		
		InsertionSort(arrO);
		System.out.println(Arrays.toString(arrO));
	}
}
