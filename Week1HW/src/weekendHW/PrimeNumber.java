package weekendHW;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 100;
		boolean prime;
		List<Integer> num = new ArrayList<>();
		
		for(int i = 0; i <= max; i++){
			prime = primeCheck(i);
			if(prime){
				num.add(i);
			}
		}
		System.out.println("Prime numbers between 0 and " + max + " are: ");
		System.out.println(num);
	}
	
	public static boolean primeCheck(int n){
		
		for(int i = 2; i < n/2; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}

}
