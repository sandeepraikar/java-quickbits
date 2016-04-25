package edu.maverick.sraikar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReverseMap {

	public static void main(String args[]){
		Map<String,Integer> frequencyMap = new HashMap<>();
		frequencyMap.put("harshit", 10);
		frequencyMap.put("sandeep", 10);
		frequencyMap.put("shobha", 20);
		frequencyMap.put("narasimha", 20);
		frequencyMap.put("john", 25);
		frequencyMap.put("kevin",15);
		frequencyMap.put("sarah",25);	
		frequencyMap.put("paul",15);
		
		Map<Integer, ArrayList<String>> reverseMap = new HashMap<>();

		for (Map.Entry<String,Integer> entry : frequencyMap.entrySet()) {
		    if (!reverseMap.containsKey(entry.getValue())) {
		        reverseMap.put(entry.getValue(), new ArrayList<String>());
		    }
		    ArrayList<String> keys = reverseMap.get(entry.getValue());
		    keys.add(entry.getKey());
		    reverseMap.put(entry.getValue(), keys);
		}
		
		System.out.println("Reveresed map!!");
		for(Map.Entry<Integer, ArrayList<String>> entry: reverseMap.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		System.out.println();
		System.out.println("Listing only the keys...");		
		for(ArrayList<String> keys: reverseMap.values()){
			for (String string : keys) {
				System.out.print(string+" ");
			}
			System.out.println();
		}
	}
}