package coding4;

public class SearchArray {
	
	static Boolean Search(int [] a, int b) {
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==b) {
				
				return true;
			}
			
			
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		int [] a= {1,2,4,5,67,21,35};
		
		if(Search(a,3)) {
			
			System.out.println("That value is in the Array");
			
			
		}
		else {
			System.out.println("That value is not in the Array");
			
		}
		
		
	}

}
