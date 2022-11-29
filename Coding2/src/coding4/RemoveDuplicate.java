package coding4;

import java.util.Arrays;
import java.util.Random;

public class RemoveDuplicate {
	static int [] RemoveDup(int []a) {
		
		Random rand = new Random(); //instance of random class
	      int upperbound = 100;
	        //generate random values from 0-24
	      int random = rand.nextInt(upperbound); 
		for(int i=0;i<a.length;i++) {
			for(int j=i; j<a.length;j++) {
				if(a[i]==a[j]) {
					if(i!=j) {
						a[j]=random;
						
						
						
					}
					
					
					
				}
				
				
			}
			
		}
		
		return a;
		
	}
	public static void main(String[] args) {
		
		int [] a= {1,55,11,65,35,11,100,1};
	    System.out.println(Arrays.toString(RemoveDup(a)));	
		
	}

}
