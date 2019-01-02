package week3HW;

public class SubarrayProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static long count(int[] num, int k){
		int start = 0;
		int end = 0;
		int cur = 1;
		long ans = 0;
		
		while(end < num.length){
			cur *= num[end];
			while (start <= end && cur >= k) {
				cur /= num[start];
				start++;
			}
			ans += (end - start + 1);
			end++;
		}
		return ans;
	}

}
