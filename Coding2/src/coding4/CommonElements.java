package coding4;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    static Set<Integer> Common(int []a,int [] b){
    	Set<Integer> c = new HashSet<>();
    	for(int i=0;i<a.length;i++) {
    		for(int j=0;j<b.length;j++) {
        		if(a[i]==b[j]) {
        			c.add(b[j]);
        			
        			
        		}
    			
    		}
    		
    		
    	}
    	
    	for(int i=0;i<b.length;i++) {
    		for(int j=0;j<a.length;j++) {
        		if(b[i]==a[j]) {
        			c.add(a[j]);
        			
        			
        		}
    			
    		}
    		
    		
    	}
    	
    	
    	return c;
    	
    	
    }
	public static void main(String[] args) {
		Set<Integer> c = new HashSet<>();
		int [] a= {1,123,77,65,35,211,100,12};
		int [] b= {12,23,57,25,135,211,142,65};
		c=Common(a,b);
		System.out.println(c.toString());
		
	}

}
