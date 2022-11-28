package coding2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayElements {
	static Set<Integer> checkelements(int [] a,int [] b){
		
		Set<Integer> set = new HashSet<>();
		
		if(a.length>b.length) {
			for(int i=0;i<a.length-1;i++) {
			
			if(Arrays.asList(b)
	                  .contains(a[i])) {
			set.add(a[i]);
			
			}
			
			}
		}
		
		if(a.length<b.length) {
			for(int i=0;i<b.length-1;i++) {
			if(Arrays.asList(a).contains(b[i])){
			set.add(b[i]);
			}
		
			
			}
		}
		
		
		return set;
	}
	
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		int [] b= {2,3,4,5,7};
		Set<Integer> set= checkelements(a,b);
		System.out.println(set.toString());
	}
	}

