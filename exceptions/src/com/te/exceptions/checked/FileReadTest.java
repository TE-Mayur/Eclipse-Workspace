package com.te.exceptions.checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadTest {
	public static void main(String[] args) {

		try {
			File file = new File("G:\\Mayur.txt");
			Scanner scanner = new Scanner(file);

			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
