package coding5;

import java.util.Random;

public class Interchange {
	public static void main(String[] args) {
		
	
	int max = 15;
	int min = -15;
	int[][] mat = new int[4][4];
	int temp=0;
	

	Random rand = new Random();

	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat.length; j++) {
			int int_random = rand.nextInt(max - min) + min;
			mat[i][j] = int_random;
			System.out.print(" "+mat[i][j]);

		}
		System.out.println(" ");
	}
	
	for(int i=0; i<mat.length;i++) {
		for(int j=0; j<mat.length;j++) {
			if(i==0) {
				temp=mat[i][j];
				mat[i][j]=mat[mat.length-1][j];
				mat[mat.length-1][j]=temp;			    	
				
			}
			
			
			
		}
		
		
		
	}
	
	System.out.println("------------------");
	for(int i=0;i<mat.length;i++) {
		for(int j=0;j<mat.length;j++) {
			System.out.print(" "+mat[i][j]);
			
			
		}
		System.out.println(" ");
		
	}
	
	
}

}


