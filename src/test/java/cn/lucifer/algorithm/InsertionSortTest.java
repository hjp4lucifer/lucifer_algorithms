package cn.lucifer.algorithm;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InsertionSortTest extends BaseTest {

	protected int[] array;

	protected InsertionSort insertionSort = new InsertionSort();

	@Before
	public void setUp() throws Exception {
		array = generateArray(20);
		printlnJson(array);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBaseSort() {
		insertionSort.baseSort(array);
		printlnJson(array);
	}

	protected int[] generateArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = (int) (Math.random() * 1000);
		}
		return array;
	}

}
