package coding6;

public class ReverseString {

	
	public static void main(String[] args) {
		
		  String input = "Strings";
		  
	        StringBuilder input1 = new StringBuilder();
	  
	        // append a string into StringBuilder input1
	        input1.append(input);
	  
	        // reverse StringBuilder input1
	        input1.reverse();
	        
	        input=input1.toString();
	
}
}
