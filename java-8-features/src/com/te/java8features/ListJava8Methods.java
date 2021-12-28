package com.te.java8features;

import java.util.ArrayList;
import java.util.List;

public class ListJava8Methods {
	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<Integer>();
		integers.add(11);
		integers.add(7);
		integers.add(51);
		integers.add(12);
		integers.add(9);
		integers.add(3);
		integers.add(2);

 		System.out.println("original " + integers);
		integers.forEach(a -> 
		System.out.println(a * a));
		System.out.println("after forEach " + integers);
		
		System.out.println("----- method ref(non static)-----");
		integers.forEach(System.out::println);
////		
////		System.out.println("----- method ref (static)-------- ");
//////		integers.forEach(ListJava8Methods::getData(a));
////		
////		integers.removeIf(x-> x>7 );
////		
//////		
////		integers.removeIf(ListJava8Methods::filter);
////		
////		System.out.println("after removeIf " + integers); 
////	}
////	
//	public static void getData(int a) {
//		System.out.println(a + " form other Method ");	
//	}
	
//	public static boolean filter(int a) {
//		return a>7;
//		
	}
}

