package com.practice.programs;

import java.util.Scanner;

public class LargestNumber {

	public static int getLarge(int[] arr, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					// arr[i]=(arr[i]+arr[j])-(arr[j]=arr[i]);
				}
			}
		}
		return arr[total - 1];
	}

	public static void main(String[] args) {
		int arr[] = { 4, 5, 7, 3, 2 };
		System.out.println("Largest number is " + getLarge(arr, 5));

	}

}
