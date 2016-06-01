package edu.maverick.sraikar;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GetMinValue {

	public static void main(String[] args) {
		Map<String,Integer> mapper = new HashMap<>();
		mapper.put("a",100);
		mapper.put("b",25);
		mapper.put("c",55);
		mapper.put("d",90);
		mapper.put("e",35);
		mapper.put("f",95);
		mapper.put("g",15);
		mapper.put("h",99);
		
		//If you want both key and value
		Entry<String, Integer> min = null;
		for (Entry<String, Integer> entry : mapper.entrySet()) {
            if (min == null || min.getValue() > entry.getValue()) {
                min = entry;
            }
        }
		System.out.println("Min value in map --> "+ min.getKey()+" : "+min.getValue());
		
		//If you want only the value!
		System.out.println("Min value : "+Collections.min(mapper.values()));
		
		//Simple 1 liner with Java 8
		String minKey = Collections.min(mapper.entrySet(), Map.Entry.comparingByValue()).getKey();
		String maxKey = Collections.max(mapper.entrySet(), Map.Entry.comparingByValue()).getKey();
		System.out.println("Min Value: "+minKey);
		System.out.println("Min Value: "+maxKey);
	}

}
