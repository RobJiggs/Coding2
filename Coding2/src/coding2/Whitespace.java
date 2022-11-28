package coding2;

public class Whitespace {
	static String remove(String s) {
		s=s=s.replaceAll("\\s", "");
		return s;
		
	}
	public static void main(String[] args) {
		
		String words="Hey whats happening here.  ";
		
		System.out.println(remove(words));
		
	}
	
}
