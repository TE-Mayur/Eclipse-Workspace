package com.testyantra.com;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of elements you want in a array :");
		Scanner a=new Scanner(System.in);
		int	count =a.nextInt();
		int arr[]=new int[count];
		System.out.println("Enter the elements :");
			for(int i=0;i<count;i++){
				arr[i]=a.nextInt();
				}
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]<arr[j]){
					arr[i]=(arr[i]+arr[j])-(arr[j]=arr[i]);	
					}
				}
			}
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}


	}

}
