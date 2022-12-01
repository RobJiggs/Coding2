package coding6;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class SortHashmap {

	static Map<String, Integer> Sort(Map<String, Integer> map){
		
		
		 List<Map.Entry<String, Integer> > list =
	               new LinkedList<Map.Entry<String, Integer> >(map.entrySet());
		 
		 
		 Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
	            public int compare(Map.Entry<String, Integer> o1,
	                               Map.Entry<String, Integer> o2)
	            {
	                return (o1.getValue()).compareTo(o2.getValue());
	            }
	        });
		 
		 System.out.println(list);
	 
		 Map<String, Integer> temp=new LinkedHashMap<>();
		 
		 for (Map.Entry<String, Integer> entry : list) {
			temp.put(entry.getKey(), entry.getValue());
		}
		
		return temp;
		
		
		
		
	}
	public static void main(String[] args) {
		Map<String, Integer> hp=new HashMap<>();
		Random rand = new Random(); //instance of random class
	      int upperbound = 100;
	       
	      hp.put("a", rand.nextInt(upperbound) );
	      hp.put("b", rand.nextInt(upperbound) );
	      hp.put("c", rand.nextInt(upperbound) );
	      hp.put("d", rand.nextInt(upperbound) );
	      hp.put("e", rand.nextInt(upperbound) );
	      hp.put("f", rand.nextInt(upperbound) );
	      hp.put("g", rand.nextInt(upperbound) );
	      System.out.println( Sort(hp).toString());
	     
	      
	      
	      
}
}
