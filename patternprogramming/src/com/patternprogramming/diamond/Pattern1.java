package com.patternprogramming.diamond;

public class Pattern1 {
	public static void main(String[] args) {
		int n = 4;
		int xy = n;
		int yx = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < n * 2; j++) {
				if (j >= xy && j <= yx) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			xy--;
			yx++;
			System.out.println();
		}
	}
}
