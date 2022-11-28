package coding2;

public class removechar {
	static String remchar(String str,String x) {
	
	String strNew = str.replace(x, "");
	return strNew;
	}
	public static void main(String[] args) {
		String str = "Hello what are you up to";
		remchar(str,"a");
		
		
		
		
		
	}
	
	
}
