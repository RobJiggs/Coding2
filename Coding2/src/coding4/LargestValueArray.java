package coding4;

import java.util.Arrays;

public class LargestValueArray {
	
	static int Largest(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j>0;j--) {
				
				if(a[j-1]>a[j]) {
					int temp;
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					
					
					
				}
				
				
			}
			
			
		}
		int b=0;
		b=a[a.length-1];
		return b;
		
	}
	
	static int [] Sort(int [] a) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j>0;j--) {
				
				if(a[j-1]>a[j]) {
					int temp;
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					
					
					
				}
				
				
			}
			
			
		}return a;
		
		
		
	}
	
	
	
static int [] SortDesc(int [] a) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j>0;j--) {
				
				if(a[j-1]<a[j]) {
					int temp;
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					
					
					
				}
				
				
			}
			
			
		}return a;
		
		
		
	}
public static void main(String[] args) {
	
	int [] a= {1,123,77,65,35,11,100,12};
    System.out.println(Arrays.toString(SortDesc(a)));	
	
	
}
}
