package com.company.yantra;

public class RemovesDuplicate {
	public static void main(String[] args) {
	int arr[]= {1,5,6,5,1,2,3,4,4,6};
	int i,j,k;
	for(i=0;i<arr.length;i++) {
		for(j=i+1;j<arr.length;) {
			if(arr[j] == arr[i]) {
				for(k=j;k<arr.length;k++) {
					arr[k]=arr[k+1];
				}
		/*		int n = arr.length--;*/
				
			}
			else {
				j++;
			}
		}
			
		}
	System.out.println("\nNew array");
	for(i=0;i< arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
		}
	
}

