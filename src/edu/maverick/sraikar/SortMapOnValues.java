package edu.maverick.sraikar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class SortMapOnValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Double> map = new HashMap<>();
		map.put("a",5.7);
		map.put("b",11.4);
		map.put("c",2.6);
		map.put("d",5.5);
		map.put("e",55.2);
		map.put("f",16.0);
		
		Comparator<Map.Entry<String,Double>> compr = new Comparator<Map.Entry<String,Double>>(){
			@Override
			public int compare(Entry<String, Double> o1,Entry<String, Double> o2) {
				Double v1 = o1.getValue();
				Double v2 = o2.getValue();
				return v2.compareTo(v1);
			}			
		};
		Set<Entry<String,Double>> entries = map.entrySet();
		List<Entry<String,Double>> listEntries = new ArrayList<>(entries);
		
		Collections.sort(listEntries, compr);
		
		/*for (Entry<String, Double> entry : listEntries) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}*/
		
		LinkedHashMap<String, Double> sortedMap = new LinkedHashMap<>(listEntries.size());
		for (Entry<String, Double> entry : listEntries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		System.out.println("Sorted Map!!");
		for (Entry<String, Double> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
