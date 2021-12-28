package com.te.homepractice.arrayprograms;

public class DuplicateArray {
	
	public static void main(String[] args) {
		
		int [] arr=  {1,2,1,4,6,7,6,4,9,0,3,3 };
		System.out.println("Duplicate elements in the given array are :");
		
		for(int i = 0;i<arr.length;i++) { 
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.println(arr[j]);
					
				}
			}
		}
		
	}

}
