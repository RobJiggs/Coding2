package coding4;

import java.util.Arrays;

public class CopyArray {
	static int [] Copy(int[] a, int [] b) {
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
			
			
		}
		return b;
		
	}
	public static void main(String[] args) {
		int [] a= {1,123,77,65,35,11,100,12};
		int [] b= {12,23,57,25,135,211,142,212};
		
		b=Copy(a,b);
		System.out.println(Arrays.toString(b));
		
	}

}
