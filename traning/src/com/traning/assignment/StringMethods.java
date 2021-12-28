package com.traning.assignment;

public class StringMethods {

	public static void main(String[] args) {
		
		String str="TestYantra";
		String str1="TechnoElevate";
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.contains("Yantra"));
		System.out.println(str.concat("TechnoElevate"));
		System.out.println(str1.startsWith("Tech"));
		System.out.println(str.endsWith("vate"));
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,4));
		System.out.println(str.toString());
		System.out.println(str1.hashCode());
		System.out.println(str.equals(str1));
	//	System.out.println(str.reverse());

	}

}
