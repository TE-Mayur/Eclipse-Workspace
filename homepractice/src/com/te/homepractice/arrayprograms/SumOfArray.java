package com.te.homepractice.arrayprograms;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {

		int num = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		num = scanner.nextInt();
		int ref[] = new int[num];
		System.out.println("Enter the elements:");
		for (int i = 0; i < num; i++) {
			ref[i] = scanner.nextInt();
			sum = sum + ref[i];
		}
		System.out.println("The sum of the array is " + sum);
		scanner.close();
	}

}
