package week2.day3.assignments;

import java.util.Arrays;

public class MissingElements {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for (int i = 0; i <=arr.length; i++) {
			int arr1=i+1;
			if(arr1!=arr[i]) {
				System.out.println(arr1);
				break;
			}
			
		}
	}
}
