package coding6;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CountDigit {
	static Map<Integer,Integer> Count(int a){
		String s=String.valueOf(a);
		String [] list=	s.split("");
		
		Map<Integer,Integer>map= new HashMap<>();
		for(int i =0;i<list.length;i++) {
			if(map.containsKey(Integer.valueOf(list[i]))) {
				map.put(Integer.valueOf(list[i]), map.get(Integer.valueOf(list[i]))+1);
				
				
				
			}
			else {
				
				map.put(Integer.valueOf(list[i]), 1);
				
				
				
			}
			
			
		}
		List <Map.Entry<Integer,Integer>> list2=new LinkedList <Map.Entry<Integer,Integer>> (map.entrySet());
		for (Map.Entry<Integer, Integer> entry : list2) {
			System.out.println("There are " + entry.getValue()+ " copies of digit "+entry.getKey() );
		}
		return map;
		
		
	}
	public static void main(String[] args) {
	int a=1032495671;
	Count(a);
		
		
	}

}
