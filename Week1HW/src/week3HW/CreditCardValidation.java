package week3HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreditCardValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String CARD = "card";
	public static String IS_VALID = "isValid";
	public static String IS_ALLOWED = "isAllowed";
	static List<Map<String, Object>> validateCards(String[] bannedPrefixes, String[] cardsToValidate) {
	       	return printJson(bannedPrefixes,cardsToValidate);
	    }

		private static List<Map<String, Object>> printJson(String[] bannedPrefixes, String[] cardsToValidate){
			 List<Map<String, Object>> list = new ArrayList<>();
	        for (String card : cardsToValidate) {
	            Map<String, Object> map = new HashMap<>();
	            map.put(CARD , card);
	            map.put(IS_VALID , luhnCheck(card));
	            map.put(IS_ALLOWED , checkAllowed(card, bannedPrefixes));
	            list.add(map);
	        }
	        return list;
	}

	    private static boolean luhnCheck(String cardNumber) {
	        final int lastDigit = Integer.parseInt(cardNumber.substring(cardNumber.length()-1, cardNumber.length()));
	        
	        int sum = 0;
	        for (int i = 0; i < cardNumber.length()-1; i++) {
	            sum += Integer.parseInt(cardNumber.substring(i, i+1)) * 2;
	        }
	        
	        if (lastDigit == sum % 10) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    private static boolean checkAllowed(String cardNumber, String[] prefixs) {
	        for (String pref : prefixs) {
	            if (cardNumber.startsWith(pref)) {
	                return false;
	            }
	        }
	        return true;
	    }

	

}
