package com.java8.interview.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Java8_20 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(2);

		Integer orElse = Optional.ofNullable(list).orElseGet(ArrayList<Integer>::new).stream().max(Integer::compareTo)
				.orElse(null);

		System.out.println(orElse);

	}

}
