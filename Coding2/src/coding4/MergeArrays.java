package coding4;

import java.util.Arrays;

public class MergeArrays {
	
	static int [] Merge(int[]a, int [] b) {
		int []c= new int[a.length+b.length];
		for(int i=0; i<a.length;i++) {
			c[i]=a[i];
			
			
		}
	for(int i=0; i<b.length;i++) {
			c[i+a.length]=b[i];
			
			
		}
		return c;
		
	}
	public static void main(String[] args) {
		
		int [] a= {1,123,77,65,35,11,100,12};
		int [] b= {12,23,57,25,135,211,142,212};
		System.out.println(Arrays.toString(Merge(a,b)));	
	}

}
