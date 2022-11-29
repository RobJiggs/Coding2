package coding4;

public class ArrayEquals {
	
	
		
		static Boolean Equals(int[]a, int [] b) {
			if(a.length != b.length) {
				return false;
				
				
			}
			
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					return false;
					
					
					
				}
			
				
				
			}
		
			return true;
			
		}


	public static void main(String[] args) {
		int [] a= {1,123,77,65,35,11,100,12};
		int [] b= {1,123,77,65,35,11,101,12};
		if(Equals(a,b)) {
			
			System.out.println("The Arrays are equal");
			
			
		}
		else {
			System.out.println("They arent equal");
			
			
		}
		
	}
}