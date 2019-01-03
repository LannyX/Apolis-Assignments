package week2HW;

import java.awt.List;
import java.util.ArrayList;

public class AppearTwice {

	public static void main(String[] args) {
		int[] arr = {1, 2, 1, 3, 2, 2, 3, 3, 3, 4, 5, 6};
		
		appearTwice(arr);
		
	}
	
	static ArrayList<Integer> appearTwice(int[] arr){
		
		int[] newArr = SelectionSort(arr);
		int count = 1;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i < newArr.length - 1; i++){
			for(int j = i + 1; j < newArr.length; j++){
				if(newArr[i] == newArr[j]){
					newArr[j] = -1;
					count++;
				} 
			}
			if (count == 2 && newArr[i+1] == -1){
				if (newArr[i] > 0) {
					//System.out.print(newArr[i]);
					al.add(newArr[i]);
				}
			}
			count = 1;
		}
		return al;
	}

	private static int[] SelectionSort(int[] arr) {
		if(arr.length <= 1 || arr == null){
			return arr;
		}
		
		for(int i = 0; i < arr.length - 1; i++){
			int min = i;
			for(int j = i + 1; j < arr.length; j ++){
				if (arr[i] > arr[j]){
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		return arr;
	}

}
