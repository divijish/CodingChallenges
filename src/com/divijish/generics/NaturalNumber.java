package com.divijish.generics;

public class NaturalNumber<T extends Integer> {

	private T n;

	public NaturalNumber(T n) {
		this.n = n;
	}

	public boolean isEven() {

		return n.intValue() % 2 == 0;

	}
	
	
	
	public static void main(String...strings) {
		
		NaturalNumber<Integer> intNumber = new NaturalNumber<>(1);
		
//			NaturalNumber<Float> floatNumber = new NaturalNumber<>(1); //This gives compiletime error Bound mismatch.
	
		
	}

}