package coding4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveOccurance {
	static int [] Remove(int [] a,int b) {
		List<Integer> c = Arrays.stream(a).boxed().collect(Collectors.toList());
		System.out.println("That value is not in that array");
		if(c.contains(b)) {
			c.remove(Integer.valueOf(b));
			
		}
		return c.stream().mapToInt(i -> i).toArray();
		
	}
	public static void main(String[] args) {
		int [] a= {1,123,77,65,35,11,100,12};
		System.out.println(Arrays.toString(Remove(a,1)));
	}

}
