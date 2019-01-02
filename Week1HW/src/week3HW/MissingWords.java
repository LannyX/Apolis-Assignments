package week3HW;

import java.util.ArrayList;
import java.util.List;

public class MissingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static List<String> missing(String s, String t){
		List<String> res = new ArrayList<>();
		
		String[] s_new = s.trim().split(" ");
		String[] t_new = t.trim().split(" ");
		
		for(int i=0,j=0;i<s_new.length;){
			if(j<t_new.length && s_new[i].equals(t_new[j])){
			    i++;
			    j++;
			 }else{
			    res.add(s_new[i]);
			    i++;
			 }
		}
		return res;
	}

}
