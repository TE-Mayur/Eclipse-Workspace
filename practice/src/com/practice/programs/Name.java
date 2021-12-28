package com.practice.programs;

public class Name {
	static int arr[] = {10,2,5,20};
	
 public static void main(String[] args) {
	for (int i = 0; i < arr.length-1; i++) {
		for(int j=i+1;j<arr.length-1;j++) {
			if(arr[i]>arr[j]) {
				arr[i] = (arr[i]+ arr[j])-(arr[j]=arr[i]);	
				}
		}
		
	}

	for (int string : arr) {
		System.out.println(string);
	}
 }
 

}
