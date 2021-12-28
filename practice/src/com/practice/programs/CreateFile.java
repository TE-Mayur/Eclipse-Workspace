package com.practice.programs;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {

			try {
				File ref=new File("G:\\Qspiders\\Mayur.txt");
				boolean s=ref.exists();
				if(s==false){
					ref.createNewFile();
					System.out.println("The file is created successfully");
				}else{
					System.out.println("File already exists");
				}
			} catch (IOException e){
				System.out.println("an error occured");
			}
			
		}
	}

