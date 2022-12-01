package coding6;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CountChar {
	
	static Map<Character,Integer> Count(String s){
		String [] arr=s.split("");
		char [] arr2= new char[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i].charAt(0);
			
		}
		
		Map<Character,Integer> map= new HashMap<>();
		for(int i=0;i<arr2.length;i++) {
			if(map.containsKey(Character.valueOf(arr2[i]))) {
				map.put(Character.valueOf(arr2[i]), map.get(Character.valueOf(arr2[i]))+1);
				
				
				
			}
			
			
			else {
				
				map.put(Character.valueOf(arr2[i]),1);
				
				
				
				
			}
			
		}
		
		 List<Map.Entry<Character, Integer> > list =
	               new LinkedList<Map.Entry<Character, Integer> >(map.entrySet());
		 
		 
		 for (Map.Entry<Character, Integer> entry : list) {
			System.out.println("There are " + entry.getValue()+ " amount of the Character " + entry.getKey() );
		}
		return map;
		
	}
	
	public static void main(String[] args) {
		String str="Hello this a test to count the Character  ";
		Count(str);
		
		
	}

}
