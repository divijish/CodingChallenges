package com.divijish.generics;

public class OrderedPair<M, V> implements Pair<M, V> {
	private M key;
	private V value;

	public M getKey() {
		return key;
	}

	public void setKey(M key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "OrderedPair [key=" + key + ", value=" + value + "]";
	}

	OrderedPair(M key, V value) {
		this.key = key;
		this.value = value;
	}

	public static void main(String... args) {

		OrderedPair<String, String> stringBox = new OrderedPair<>("key", "value");

		OrderedPair<Integer, Integer> integerBox = new OrderedPair<>(1, 1000);

		OrderedPair<String, OrderedPair<String, String>> orderedPair = new OrderedPair<>("orderedPair",
				new OrderedPair<>("keyOrderedPair", "valueOrderedPair"));

		OrderedPair rawPair = new OrderedPair("RawKey", "RawValue");

		OrderedPair<String, String> cloneRawPair = rawPair;// raw type is assignable to generic type.

		System.out.println("Displaying OrderePair<String, String>");
		Util.display(stringBox);

		System.out.println("Displaying OrderedPair<Integer, Integer>");
		Util.display(integerBox);

		System.out.println("Displaying OrderedPair<String, OrderedPair<String, String>");
		Util.display(orderedPair);

		System.out.println("Displaying Raw OrderedPair");
		Util.display(rawPair);

	}

}
