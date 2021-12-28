package com.te.array;

public class MyArrayV4 {

	private Object[] arr;
	private int position = 0;
	private static final int DEFAULT_SIZE = 5;

	public MyArrayV4() {
		arr = new Object[DEFAULT_SIZE];
	}

	public MyArrayV4(int initsize) {
		arr = new Object[initsize];

	}

	public boolean add(Object element) {
		arr = enSureCapacity(arr);
		arr[position++] = element;
		return true;
	}

	private Object[] enSureCapacity(Object[] arr) {
		return (position < arr.length) ? arr : grow(arr, arr.length);
	}

	private Object[] grow(Object[] arr, int oldCapacity) {
		int newSize = oldCapacity + (oldCapacity >> 1);
		Object[] arr2 = new Object[newSize];
	        //System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		return arr2;
	}

	public Object get(int index) {
		return arr[index];
	}

	public int size() {
		return position;
	}

	public void set(int index, Object element) {
		arr[index] = element;
	}

	public void remove(int index) {
		int length = arr.length - index - 1;
		System.arraycopy(arr, index + 1, arr, index, length);
		position--;
	}

	@Override
	public String toString() {
		StringBuilder data = new StringBuilder("[");
		for (int i = 0; i < position - 1; i++) {
			data = data.append(arr[i] + ",");
		}
		data = data.append(arr[position - 1] + "]");
		return data.toString();
	}
}
