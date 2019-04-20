package com.divijish.range;

import java.util.Arrays;
import java.util.Scanner;

import com.divijish.sort.BubbleSort;

public class Range {

	public static void main(String... args) {

		System.out.println("Enter an array with distinct elements in sorted order");

		Scanner scanner = new Scanner(System.in);

		String numbers = scanner.nextLine();

		String[] numStringArray = numbers.split(" ");

		int[] numberArray = new int[numStringArray.length];

		numberArray = getIntArrayFromStringArray(numStringArray, numberArray);

		numberArray = BubbleSort.bubbleSort(numberArray);

		StringBuilder sb = rangeGetter(numberArray);

		System.out.println(sb.toString());

	}

	/*
	 * This method maps all strings in string array to all integers in int array.
	 */

	static int[] getIntArrayFromStringArray(String[] stringArray, int[] numberArray) {

		for (int i = 0; i < stringArray.length; i++) {

			numberArray[i] = Integer.parseInt(stringArray[i]);

		}

		return numberArray;
	}

	/*
	 * This method performs the main logic and gets the range of elements which are
	 * in consecutive order.
	 */
	static StringBuilder rangeGetter(int[] numberArray) {

		StringBuilder sb = new StringBuilder("[");

		int beginning = numberArray[0];

		int memory = numberArray[0];

		int end;
		if (numberArray.length > 1) {
			for (int i = 1; i < numberArray.length; i++) {

				end = numberArray[i];

				if (end != memory + 1) {

					sb = makeString(beginning, memory, sb);

					beginning = end;

					memory = end;

				} else {

					memory = end;

				}

				if (i == numberArray.length - 1) {
					sb = makeString(beginning, memory, sb);
									}

			}
		} else {
			
			sb = makeString(beginning, memory, sb);

		}
		
		sb.replace(sb.length() - 1, sb.length(), "");


		sb.append("]");

		return sb;
	}

	/*
	 * This method checks if distinct numbers are sent and returns the expected
	 * range with '->' between the two. If two numbers are equal then returns the
	 * single number itself in quotes.
	 */
	static StringBuilder makeString(int beginning, int end, StringBuilder sb) {

		if (beginning == end) {

			sb.append("\"" + beginning + "\",");

		} else {

			sb.append("\"" + beginning + "\"->\"" + end + "\",");

		}

		return sb;
	}

}
