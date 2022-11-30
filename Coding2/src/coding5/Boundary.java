package coding5;

import java.util.Random;

public class Boundary {
	public static void main(String[] args) {
		int max=15;
		int min=-15;
		int[][]mat = new int[4][4];
		
		
	
		Random rand = new Random();
		
		for(int i=0;i<mat.length;i++) {
     		for(int j=0;j<mat.length;j++) {
     			 int int_random = rand.nextInt(max - min) + min;
     		     mat[i][j]=int_random;
     			 
     			
     		}
     		System.out.println(" ");
	}
		
		for(int i=0;i<mat.length;i++) {
     		for(int j=0;j<mat.length;j++) {
     			System.out.print(mat[i][j]+" ");
     			
     			
     		}
     		System.out.println("");
     	}
		
		for(int i=0;i<mat.length;i++) {
     		for(int j=0;j<mat.length;j++) {
     			
 
     			if(i==0) {
     				 System.out.println(mat[i][j]);
     				 
     				 
     			 }
     			 else if(i==mat.length-1) {
     				System.out.println(mat[i][j]);
     				 
     			 }
     			 else if(j==0) {
     				System.out.println(mat[i][j]);
     				 
     				 
     			 }
     			 else if(j==mat.length-1) {
     				System.out.println(mat[i][j]);
     				 
     				 
     				 
     			 }
     			
     		}
     		
	}
		
		
		
		
	}

}


