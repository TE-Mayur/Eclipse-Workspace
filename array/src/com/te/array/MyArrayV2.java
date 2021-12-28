package com.te.array;

public class MyArrayV2 {

	private int[] arr;
	private int position = 0;
	private final int DEFAULT_SIZE = 5;

	public MyArrayV2() {
		arr = new int[DEFAULT_SIZE];
	}

	public MyArrayV2(int initsize) {
		arr = new int[initsize];

	}

	public boolean add(int element) {
		arr = enSureCapacity(arr);
		arr[position++] = element;
		return true;
	}

	private int[] enSureCapacity(int[] arr) {
		return (position < arr.length) ? arr : grow(arr, arr.length);
	}

	private int[] grow(int[] arr, int oldCapacity) {
		int newSize = oldCapacity + (oldCapacity >> 1);
		int[] arr2 = new int[newSize];
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		return arr2;
	}

	public int get(int index) {
		return arr[index];
	}

	public int size() {
		return arr.length;
	}

	@Override
	public String toString() {
		StringBuilder data =new StringBuilder("[");
		for (int i = 0; i < position - 1; i++) {
			data =data.append(arr[i] + ",");
		}
		data =data.append(arr[position - 1] + "]");
		return data.toString();
	}
}
