package weekendHW;

public class BubbleSort {

	public static void main(String[] args) {
		
	      int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };

	      for(int i = 0; i < arr.length; i++) {
	         System.out.print(arr[i] + " ");
	      }

	      bubbleSort(arr);
	      System.out.println("\nArray After Bubble Sort");

	      for(int i : arr){
	    	  System.out.print(i + " ");
	      }

	}
	
	public static void bubbleSort(int[] arr){
		if (arr.length == 0 || arr == null){
			System.out.println("This is an empty array");
		}
		for(int i = 0; i < arr.length; i++){
			for(int j = 1; j < arr.length - i; j++){
				if (arr[j - 1] >  arr[j]){
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

}
