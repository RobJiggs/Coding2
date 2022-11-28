package coding2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Snippet {
	 public static void main(String[] args) {
		 int [] arr= {1,4,2,4,5,6};
		 IntStream intstream= IntStream.of(arr);
		 IntStream intstream2= IntStream.of(arr);
		 IntStream intstream3= IntStream.of(arr);
		 OptionalDouble d=intstream.average();
		 
		 OptionalInt a=intstream2.max();
		 OptionalInt b=intstream3.min();
		 
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(d);
	}

}
