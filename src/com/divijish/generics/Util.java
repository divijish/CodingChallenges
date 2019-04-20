package com.divijish.generics;

public class Util {

	public static <K, V> void display(OrderedPair<K, V> box) {

		System.out.println("Key : " + box.getKey() + " || Value : " + box.getValue());

	}

	public static <U extends Number> void findClass(Box<U> box) {

		System.out.println("box is of type : " + box.getT().getClass());

	}

}
