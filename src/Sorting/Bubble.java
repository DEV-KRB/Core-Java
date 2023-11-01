package withLogic;

import java.util.Arrays;

class Bubble{
	
	//method defination
	public static void BubbleSort(int arr[]) {
		
		for(int i = 0;i<arr.length-1; i++) {
			for(int j=0;j<arr.length-i-1; j++)	//since last element being largest so ignore that
			{	
				//compare values and swap if index is bigger
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arrO[] = {21,1,22,2,23,3,24,4};
		
		//method invoke
		BubbleSort(arrO);
		
		//print the sorted array
		System.out.print(Arrays.toString(arrO));
		

	}
}