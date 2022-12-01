package coding6;

public class Toggle {
	static String toggle(String s) {
		String []s1=s.split("");
		char [] c= new char[s1.length];
		for(int i=0;i<s1.length;i++) {
			c[i]=s.charAt(i);
			
			
		}
		
		for (int i=0;i<c.length;i++) {
			if(Character.isUpperCase(c[i])) {
				
				c[i]=Character.toLowerCase(c[i]);
				
			}
			else {
				c[i]=Character.toUpperCase(c[i]);
				
				
				
			}
			
			
			
			
		}
		String s2="";
		for (char d : c) {
			s2=s2+d;
		}
		return s2;
		
	}
	public static void main(String[] args) {
		
		String test="tHIS IS a tEST";
		test=toggle(test);
		System.out.println(test);
		
		
	}

}
