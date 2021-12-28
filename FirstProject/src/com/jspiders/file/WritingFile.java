package com.jspiders.file;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {
	
	        public static void main(String[] args) {
	        	FileWriter ref=null;
	        	try {
	        		ref=new FileWriter("E://javafiles.txt");
	        		ref.write("FileWriter Class used by Developers to write the content on file");
	        		ref.flush();
	        	}catch(IOException obj) {
	        		System.out.println("IOException hanled");
	        	}finally {
	        		try {
	        			ref.close();
	        		}catch(IOException ref1) {
	        			System.out.println("IO Exception handled");
	        		}
	        	}
	        }
	}
