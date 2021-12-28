package com.te.homepractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePractice {

	public static void main(String[] args) {

		try {
			File file = new File("G:\\Mayur.txt");
			Scanner scan = new Scanner(file);

			while (scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
