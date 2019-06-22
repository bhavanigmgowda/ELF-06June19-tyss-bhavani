package com.tyss.javaapp.array;

public class MyArrayList {

	private Object[] myArray;
	private int index;

	public MyArrayList() {
		this(10);
	}

	public MyArrayList(int size) {
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("size must be greater than 0");
		}
		myArray = new Object[size];
		index = 0;
	}

	public void add(Object val) {
		if(index >= myArray.length) {
			Object[] myArray2=new Object[myArray.length*2];
			System.arraycopy(myArray,0, myArray2, 0, myArray.length);
			myArray=myArray2;			
		}
			myArray[index] = val;
			index++;

	}

	public Object get(int position) {
		return myArray[position];
	}

	public void remove(int pos) {
		if(pos>myArray.length) {
			throw new ArrayIndexOutOfBoundsException("out of array length");
		}
		System.arraycopy(myArray, pos + 1, myArray, pos, myArray.length - 1 - pos);
	}
	public int getSize() {
		return index-1;
	}
}
