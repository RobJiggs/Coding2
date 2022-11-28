package coding3;

public class ReverseString {
	static String reverse(String s) {
		String s1="";
		for(int i=s.length(); i>0;i-- ) {
			s1=s1+s.substring(i-1, i);
			
			
			
		}
		
		
		return s1;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("1234"));

	}

}
