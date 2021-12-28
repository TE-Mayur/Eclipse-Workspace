package org.te.jdbcpractice;

public class Rotate {
	
	public static void main(String[] args) {
		int [] arr = {1,4,2,6,7};
		int n = 2;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		for (int i = 0; i < n; i++) {
			int j , first;
			
			first = arr[0];
			for (j = 0; j < arr.length-1; j++) {
				arr[j] =arr[j+1]; 
			}
			arr[j] = first;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
