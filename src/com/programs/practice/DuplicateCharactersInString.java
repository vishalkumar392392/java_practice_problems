package com.programs.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {

	public static void main(String[] args) {

		String name = "vishal palla";
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < name.length(); i++) {

			for (int j = 1; j < name.length(); j++) {

				if (i != j && name.charAt(i) == name.charAt(j)) {
					if (map.containsKey((Object) name.charAt(j))) {
						int count = map.get((Object) name.charAt(j));
						map.put(name.charAt(j), count + 1);
					} else {
						map.put(name.charAt(j), 1);
					}
					break;
				}
			}
		}
		System.out.println("Repeated letters: "
				+ map.entrySet().stream().map(x -> x.getKey().toString()).collect(Collectors.joining(",")));

	}
}
