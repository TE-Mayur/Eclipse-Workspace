package com.patternprogramming.diamond;

public class pattern5 {
	public static void main(String[] args) {
		{
			int n = 3;
			int space = 2;

			for (int j = 1; j <= n; j++) {
				for (int i = 1; i <= space; i++) {
					System.out.print(" ");
				}
				space--;
				for (int i = 1; i <= 2 * j - 1; i++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			space = 1;
			for (int j = 1; j <= n - 1; j++) {
				for (int i = 1; i <= space; i++) {
					System.out.print(" ");
				}
				space++;
				for (int i = 1; i <= 2 * (n - j) - 1; i++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}
