package coding4;

import java.util.Arrays;

public class ArrayRotation {
	static int [] Rotate(int [] a) {
		int temp = 0;
		int temp2=0;
		for(int i=0;i<a.length;i++) {
		if(i==0) {
			
			temp=a[1];
			a[1]=a[0];
			
		}
		if(i!=0 && i%2==1 ) {
			if(i!=a.length-1) {
			temp2=a[i+1];
			a[i+1]=temp;
			}
			else {
				temp2=a[0];
			    a[0]=temp;	
			}
			
		}
			
		if(i!=0 && i%2==0 ) {
			if(i!=a.length-1) {
			temp=a[i+1];
			a[i+1]=temp2;
			}
			else {
			
				temp=a[0];
			    a[0]=temp2;
				
			}
			
		}
		
		
			
		}return a;
		
		
	}
	public static void main(String[] args) {
		int [] a= {1,123,77,65,35,11,100};
		System.out.println(Arrays.toString(Rotate(a)));	
	}
		
	}


