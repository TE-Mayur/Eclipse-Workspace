package com.testyantra.com;

public class Sum1 {

	 public static void main(String name[]) {
		int arr[]= {1,0,2,5,3,4,6,7};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]+arr[j]==7) {
					System.out.println(arr[i]+" , "+arr[j]);
				}
				
			}
		}

	}

}
