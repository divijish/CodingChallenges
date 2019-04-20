package com.divijish.generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

	public T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public Box(T t) {
		super();
		this.t = t;
	}

	public static void main(String... strings) {

		Box<String> box = new Box("string");
		Box<Integer> intBox = new Box(1);

		Box<Long> longBox = new Box(1L);

		Box<Float> floatBox = new Box(1F);

		List<Box> boxList = new ArrayList<Box>();

//		boxList.add(box);//This throws RuntimeException ClassCastException. String cannot be cast to number.

		boxList.add(intBox);
		boxList.add(longBox);
		boxList.add(floatBox);

		System.out.println("Printing all the elements: ");

		boxList.forEach(Util::findClass);

	}

}
