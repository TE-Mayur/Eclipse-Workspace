package com.te.exceptions.checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.security.PublicKey;
import java.util.Scanner;

public class Practice {
	
	public void getData(int a, int b, String fileName) {
		System.out.println(divide(a,b));
		fileReader(fileName);	
	}
	public int divide(int a,int b) {
		if(a>0 && b>0) {
			return a/b;
		}else {
			return 0;
		}
	}
	public void fileReader(String fileName) {
		
		try {
		Scanner scanner = new Scanner(new File(fileName));
		
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
			
		}
		scanner.close();
	}catch (FileNotFoundException e) {
		System.out.println("File not found");
		
	}
		
	}
		
}
