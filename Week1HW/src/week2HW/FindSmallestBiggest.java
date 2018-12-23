package week2HW;

public class FindSmallestBiggest {

	public static void main(String[] args) {
		
		int[] arr = new int[] {-3, 2, 8, 3, 99, -64, 888};

		System.out.println("Smallest number in this array is: " + findSmallest(arr));
		System.out.println("Biggest number in this array is: " + findBiggest(arr));

	}
	
	static int findSmallest(int[] arr){
		int min = 9999;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
	
	static int findBiggest(int[] arr){
		int max = -9999;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}

}
