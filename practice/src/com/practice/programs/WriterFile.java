package com.practice.programs;

//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;


public class WriterFile {

	public static void main(String[] args) {
		
	try {
			  
			FileWriter obj = new FileWriter("G:\\Kumar.txt");
			   obj.write(" Hi I am Mayur");
			   obj.write("\n");
			   obj.write(" I stays in Chennai");  
			   obj.flush();
			  } catch (IOException e) {
				System.out.println("The content is passed in the file");
			  }
			   
			
			/* File sal=new File("G:\\Qspiders\\Mayur.txt");
			  Scanner scanner = new Scanner(sal);
			  while (scanner.hasNext()) {
			   System.out.println(scanner.nextLine());
			   scanner.close();
			  }
			 } catch (Exception b) {
				 System.out.println("Hiii");*/
			 }

	}


