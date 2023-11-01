package withLogic;

import java.util.Arrays;

public class Selection {

	public static void SelectionSort(int arr[]) {	//it will run n-1 times
		
		for(int i=0;i<arr.length;i++) {
			int smallest = i;
			for(int j=i+1;j<arr.length;j++) {	//loop start with smallest+1 element
			if(arr[smallest]>arr[j]) {
				smallest=j;				
			}
		}
			
		int temp = arr[smallest];
		arr[smallest] = arr[i];
		arr[i] = temp;
		}
	}
		
		public static void main(String[] args) {
			
			int arrO[] = {21,1,22,2,23,3,24,4};
			SelectionSort(arrO);
			System.out.println(Arrays.toString(arrO));
		}
}
