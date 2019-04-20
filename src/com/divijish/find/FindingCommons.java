package com.divijish.find;

import java.util.ArrayList;
import java.util.List;

public class FindingCommons {

	public static void main(String[] args) {

		List<String> agentList = new ArrayList<>();
		List<String> dbList = new ArrayList<>();

		agentList.add("cheetah");
		agentList.add("lion");
		agentList.add("deer");
		agentList.add("elephant");

		dbList.add("cheetah");
		dbList.add("elephant");
		dbList.add("kangaroo");

		dbList.stream().filter(n -> !agentList.parallelStream().anyMatch(m -> {

			return n.equals(m);
		})).forEach(System.out::println);
		;
	}

}
