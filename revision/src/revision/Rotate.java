package revision;

import java.util.Collection;
import java.util.Collections;

public class Rotate {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 7};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			System.out.println(arr[i]);
		}
		System.out.println("maximum diff between");
		System.out.println(arr[(arr.length-1)-arr[0]]);
	}
Collections
}
