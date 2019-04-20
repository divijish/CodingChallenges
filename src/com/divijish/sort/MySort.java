package com.divijish.sort;

import java.util.Arrays;

public class MySort {

	public static void main(String[] args) {
		
		int arr[] = { 53, 445, 3, 2, 1, 5, 54, 34, 5 };
		
		arr = sort(arr);
		
		Arrays.stream(arr).forEach(System.out::println);

	}
	
	public static int[] sort(int [] arr) {
		int temp = 0;
		int count = 0;
		for(int i =0; i<arr.length; i++) {
			for(int j = i+1;j<arr.length; j++) {
				count++;
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Loop ran "+count+" times");
		return arr;
	}

}
