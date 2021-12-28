package revision;

import java.util.Arrays;

public class ArrayListImplOne {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };
		int[] arr1 = { 1, 6, 3 };

		if (Arrays.equals(arr, arr1)) {
			System.out.println("Arrays are equal ");
		}else {
			System.out.println("Arrays are not equal");
		}
	}
}
