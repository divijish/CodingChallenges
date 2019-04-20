package com.divijish.symantics;

public class RideBicycle {

	public static void main(String... strings) {

		Bicycle b = new Bicycle("raodster");
		System.out.println("Calling static field from object: " + b.count);

		System.out.println(b.getName());

	}
}
