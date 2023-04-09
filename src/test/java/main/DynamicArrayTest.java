package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DynamicArrayTest {

	@Test
	public void addItem() {
		DynamicArray<Integer> list = new DynamicArray<Integer>();
		
		assertEquals(list.size(), 0);
		assertEquals(list.getRealSize(), 2);
		
		list.add(1);
		assertEquals(list.size(), 1);
		assertEquals(list.getRealSize(), 2);
		
		list.add(1);
		assertEquals(list.size(), 2);
		assertEquals(list.getRealSize(), 2);
		
		list.add(1);
		assertEquals(list.size(), 3);
		assertEquals(list.getRealSize(), 4);

	}
	
	@Test
	public void removeItem() {
		DynamicArray<Integer> list = new DynamicArray<Integer>();
		
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.remove(1);
		assertEquals(list.size(), 3);
	}

}
