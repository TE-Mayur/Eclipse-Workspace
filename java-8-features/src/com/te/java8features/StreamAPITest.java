package com.te.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPITest {
	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<Integer>();
		integers.add(49);
		integers.add(7);
		integers.add(64);
		integers.add(12);
		integers.add(16);
		integers.add(3);
		integers.add(2);

		System.out.println("org " + integers);

		System.out.println("--------------------map---------------------");
		List<Integer> mapOutPut = integers.stream().map(x -> x * x).collect(Collectors.toList());

		// Convert manipulated data to set

		Set<Integer> mapSetOutPut = integers.stream().map(x -> x * x).collect(Collectors.toSet());

		System.out.println(" Map " + mapOutPut);
		System.out.println(" Set " + mapSetOutPut);
		// integers = mapOutPut; --> reassigning the data
		System.out.println("after map opertaion " + integers);

		System.out.println("--------------------sorted---------------------");
		// sort the elements in ascending order
		List<Integer> sortedList = integers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		System.out.println(" org " + integers);

		System.out.println("--------- Even numbers----------");
		List<Integer> evenNumbers = integers.stream().map((a) -> {
			if (a % 2 == 0) {
				return a;
			} else {
				return a + 1;
			}
		}).collect(Collectors.toList());

		System.out.println(" Even " + evenNumbers);

		System.out.println("--------- Square root----------");

		List<Double> squareRoot = integers.stream().map((a) -> Math.sqrt(a)).collect(Collectors.toList());
		System.out.println("Square root " + squareRoot);
		System.out.println(" Original " + integers);

		System.out.println("--------- odd numbers----------");
		List<Integer> oddNumbers = integers.stream().map((a) -> {
			if (a % 2 == 0) {
				return a - 1;
			} else {
				return a;
			}
		}).collect(Collectors.toList());
		System.out.println(" Odd " + oddNumbers);
		
		
		System.out.println("--------- distinct----------");
		 
		List<Integer> disList = integers.stream().distinct().collect(Collectors.toList());
		System.out.println("distinct list " + disList);
		
		System.out.println("--------- count ----------");
		long count = integers.stream().count();
		System.out.println("count " + count);
		
		System.out.println("---------skip----------");
		List<Integer> skippedList = integers.stream().skip(5).collect(Collectors.toList());
		System.out.println("After skip"+ skippedList);
		
		System.out.println("---------filters----------");
		System.out.println("original " + integers);
		
		List<Integer> filteredList = integers.stream().filter(x-> x% 2 != 0).collect(Collectors.toList());
		System.out.println("Filtered Lis4t " + filteredList);
		
	}

}
