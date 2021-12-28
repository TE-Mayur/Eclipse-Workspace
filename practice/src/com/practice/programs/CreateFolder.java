package com.practice.programs;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		File ref=new File("G:\\Qspiders\\Mayur");
		boolean s=ref.exists();
		if(s==false) {
			ref.mkdir();
			System.out.println("The folder is created");
		}else {
			System.out.println("The folder is already present");
		}
		
	}

}
