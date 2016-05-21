package cn.lucifer.algorithm;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InsertionSortTest extends BaseTest {

	protected InsertionSort insertionSort = new InsertionSort();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBaseSort() {
		int[] array = generateArray(20);
		printlnJson(array);
		insertionSort.sort(array);
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
