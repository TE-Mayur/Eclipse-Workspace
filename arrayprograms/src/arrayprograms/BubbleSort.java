package arrayprograms;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {14,2,44,63,12,87,34};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1 ; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;				
			}
		}
	}
		sort(arr);
		System.out.println("Largest Number " + arr[0]);
		System.out.println("Smallest number " + arr[arr.length-1]);
		
}

public static void sort(int[] arr) {
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
} 
}
