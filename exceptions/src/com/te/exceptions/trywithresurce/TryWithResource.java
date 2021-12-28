
package com.te.exceptions.trywithresurce;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class TryWithResource {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in); 
			FileOutputStream stream = new FileOutputStream(new File(""))) {
			
			scanner.nextInt();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
