package com.java8.interview.practice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.strings.Notes;

public class Java8_17_List_To_Map {

	public static void main(String[] args) {

		List<Notes> noteLst = new ArrayList<>();
		noteLst.add(new Notes(1, "note1", 11));
		noteLst.add(new Notes(2, "note2", 22));
		noteLst.add(new Notes(3, "note3", 33));
		noteLst.add(new Notes(4, "note4", 44));
		noteLst.add(new Notes(5, "note5", 55));

		noteLst.add(new Notes(6, "note4", 66));

		LinkedHashMap<String, Integer> collect = noteLst.stream().collect(Collectors.toMap(Notes::getTagName,
				Notes::getTagId, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

		System.out.println(collect);
	}

}
