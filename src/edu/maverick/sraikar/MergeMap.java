package edu.maverick.sraikar;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeMap {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		Map<String, String> map3 = new HashMap<>();

		map1.put("1234", "{\"test1\":\"value1\",\"test2\":\"value2\"}");
		map1.put("5678", "{\"test5\":\"value5\",\"test6\":\"value6\"}");
		map1.put("7890", "{\"test7\":\"value7\",\"test8\":\"value8\"}");
		map1.put("6636", "{\"test7\":\"value7\",\"test8\":\"value8\"}");

		map2.put("1234",
				"{\"testing1\":\"testingvalue1\",\"testing2\":\"testingvalue2\",\"testing3\":\"testingvalue3\"}");
		map2.put("5678",
				"{\"testing5\":\"testingvalue5\",\"testing6\":\"testingvalue6\",\"testing7\":\"testingvalue7\"}");
		map2.put("7890",
				"{\"testing7\":\"testingvalue7\",\"testing8\":\"testingvalue8\",\"testing9\":\"testingvalue9\"}");
		map2.put("13123", "{\"test7\":\"value7\",\"test8\":\"value8\"}");

		map3.put("1234",
				"{\"map3testing1\":\"map3testingvalue1\",\"map3testing2\":\"map3testingvalue2\",\"map3testing3\":\"map3testingvalue3\"}");
		map3.put("5678",
				"{\"map3testing5\":\"map3testingvalue5\",\"map3testing6\":\"map3testingvalue6\",\"map3testing7\":\"map3testingvalue7\"}");
		map3.put("7890",
				"{\"map3testing7\":\"map3testingvalue7\",\"map3testing8\":\"map3testingvalue8\",\"map3testing9\":\"map3testingvalue9\"}");
		map3.put("345345", "{\"map3test7\":\"map3value7\",\"map3test8\":\"map3value8\"}");

		Map<String, String> merged = Stream.of(map1, map2, map3).map(Map::entrySet).flatMap(Set::stream)
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (a, b) -> {
					return a + "," + b;
				}));
		merged.forEach((k, v) -> System.out.println(k + " : " + v));

	}

}
