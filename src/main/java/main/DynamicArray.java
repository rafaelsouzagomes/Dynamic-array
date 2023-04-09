package main;

import java.util.Arrays;

public class DynamicArray<E>  {
	
	private static final long serialVersionUID = 1L;
	
	private E[] list;
	
	private int size = 0;
	
	private final int INITIAL_CAPACITY = 2;
	
	private int realSizeArrayList= 0;
	
	@SuppressWarnings("unchecked")
	public DynamicArray() {
		list = (E[]) new Object[INITIAL_CAPACITY];
		realSizeArrayList = INITIAL_CAPACITY;
	}

	public void add(E i) {
		controlCapacity();
		list[size] = i;
		size++;
	}

	private void controlCapacity() {
		grow();
	}

	private void grow() {
		if(size==list.length) {
			 int newCapacity = list.length * 2;
			 list = Arrays.copyOf(list, newCapacity);
			 this.realSizeArrayList = newCapacity;
		}
	}

	public E get(int index) {
		validateIndex(index);
		return list[index];
	}

	private void validateIndex(int index) {
		if(index >= list.length) {
			throw new RuntimeException("ArrayIndexOutOfBoundsException");
		}
	}

	public int size() {
		return size;
	}
	
	public int getRealSize() {
		return realSizeArrayList;
	}

	public E remove(int index_to_remove) {
		validateIndex(index_to_remove);
		
		E valueToRemove = list[index_to_remove];
		int numMoved = size - index_to_remove - 1;
		
		if (numMoved > 0)
			System.arraycopy(list, index_to_remove+1, list, index_to_remove,numMoved);
		
		
		 list[--size] = null;
		 return  valueToRemove;
	}
	
	
}
