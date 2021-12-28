package arrayprograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {

		int arr[] = { 2, 34, 1, 2, 97, 65, 76, 97 };

		// Logical Method to fetch only the duplicates values in an array
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
		// Using Collections fetch the duplicates from an array

//		Integer[] arr = {2,34,54,67,34,2,67,89}; 
//		Set<Integer> ref = new HashSet<Integer>();
//		for (Integer integer : arr) {
//			if (ref.add(integer) == false) {
//				System.out.println(integer + " ");
//			}
//		}

		// Using Collection fetch duplicates with non duplicates also from an array
//		Integer[] arr = { 2, 34, 54, 67, 34, 2, 67, 89 };
//		Set<Integer> ref = new HashSet<Integer>();
//
//		for (int i = 0; i < arr.length; i++) {
//			ref.add(arr[i]);
//		}
//		System.out.println(ref);
	}
}