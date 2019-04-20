package com.divijish.sort;

import java.util.Arrays;

public class BubbleSort {

	public static int[] bubbleSort(int[] unsortedArray) {

		int temp = 0;
		int count = 0;
		for (int i = 0; i < unsortedArray.length; i++) {

			for (int j = 0; j < unsortedArray.length - i - 1; j++) { // could be also j < unsortedArray.length-1 but
																		// this would increase number of iterations.
				count++;

				if (unsortedArray[j] > unsortedArray[j + 1]) {

					temp = unsortedArray[j];

					unsortedArray[j] = unsortedArray[j + 1];

					unsortedArray[j + 1] = temp;

				}

			}

		}
		System.out.println("Loop ran " + count + "times");

		return unsortedArray;
	}

	public static void main(String... strings) {
		int a[] = { 53, 445, 3, 2, 1, 5, 54, 34, 5 };

		a = bubbleSort(a);

		Arrays.stream(a).forEach(System.out::println);
	}

}
