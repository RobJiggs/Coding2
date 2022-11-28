package coding3;

import java.util.ArrayList;
import java.util.List;

public class Substrings {
	static List<String> subs(String s) {
		List<String>slist= new ArrayList<>();
		for(int i=0; i<s.length();i++) {
			for(int j=i+1; j<s.length()+1; j++) {
				slist.add(s.substring(i, j));
					
				
				
				
			}		
			
		}

		return slist;
		
	}
	public static void main(String[] args) {
		
		System.out.println(subs("Happy").toString());
		
		
	}
}
