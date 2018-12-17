package weekendHW;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = insertionSort(arr1);
        for(int i:arr2){
            System.out.println(i);
        }

	}
	
	static int[] insertionSort(int[] arr){
		if(arr == null || arr.length == 0){
			return arr;
		}
		
		for(int i = 0; i < arr.length; i++){
			for(int j = i; j > 0; j--){
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		return arr;
	}

}
