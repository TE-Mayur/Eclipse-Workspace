package com.patternprogramming.diamond;

public class pattern4 {
	public static void main(String[] args) {
		int n = 4;				// size of the pattern
		int x = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * n; j++) {
				if ((j >= x) != false && j <= 2 * n - x + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			x--;
		}
	}
}
