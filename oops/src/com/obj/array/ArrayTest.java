package com.obj.array;

public class ArrayTest {
	public static void main(String[] args) {
		 int arr[]=new int[10];
		 int []arr1=new int[10];
		 int[]arr2=new int[10];
//		 []int arr3 = new int[10]; not works
		 int arr3[]= {1,2,3,4,5,6};
		 
		 for (int i = 0; i < arr1.length; i++) {
			 arr[i] = i+1;
			
		}
		 for (int i = 0; i < arr.length; i++) {
			 System.out.println(arr[i]);
			
		}
		 
		 System.out.println("===================for each=============");
		 
		 for (int number : arr3) {
			 System.out.println(number);
			
		}
	}
}
