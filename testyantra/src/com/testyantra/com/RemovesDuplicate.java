package com.testyantra.com;

import java.util.HashSet;

public class RemovesDuplicate {

	public static void main(String[] args) {
		
		int arr[]= {1,5,6,5,1,2,3,4,4,6};
			System.out.println("The arrays without duplicate values are:");
			HashSet<Integer> s=new HashSet<Integer>();
			for(int i=0;i<arr.length;i++) {
				s.add(arr[i]);
			}
			System.out.println(s);
		}

	}
