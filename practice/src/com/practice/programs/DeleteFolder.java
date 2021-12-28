package com.practice.programs;

import java.io.File;

public class DeleteFolder {
	public static void main(String[] args) {
		File ref=new File("G:\\Qspiders\\Mayur");
		boolean s = ref.exists();
		ref.delete();
		if(s==true) {
			System.out.println("The folder deleted successfully");
		}else {
			System.out.println("The folder not found ");
		}
	}

}
