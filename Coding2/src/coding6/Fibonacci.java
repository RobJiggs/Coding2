package coding6;

public class Fibonacci {
	static int Fib(int x) {
		int sum=0;
		if(x<2) {
			return x;
			
		}
		return Fib(x-1)+Fib(x-2);
	}
	public static void main(String[] args) {
		int x=5;
		System.out.println(Fib(x));
	}

}
