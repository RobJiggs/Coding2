package coding3;

public class Palindrome {
   static Boolean Pal(int a) {
	   String s= a+"";
	   String s2="";
	   String s3="";
	   if(s.length()%2==1) {
		   int j= ((s.length()-1)/2);
		   for(int i=0;i<j;i++ ) {
			   s2=s2+s.substring(i,i+1);
			   
			   
		   }
		   for(int i=s.length();i>j+1;i-- ) {
			   s3=s3+s.substring(i-1,i);
			   
			   
		   }
		  
		   if(s2.equals(s3)) {
			   
			   return true;
		   }
		   
	   }
	   
	   if(s.length()%2==0) {
		   
		   int j = (s.length()/2);
		   for(int i=0;i<j;i++ ) {
			   s2=s2+s.substring(i,i+1);
			   
			   
		   }
		   for(int i=s.length();i>j;i-- ) {
			   s3=s3+s.substring(i-1,i);
			   
			   
		   }
		   
		   if(s2.equals(s3)) {
			   
			   return true;
		   }
		   
		   
		   
	   }
	   return false;
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Pal(123321));
	
	}

}
