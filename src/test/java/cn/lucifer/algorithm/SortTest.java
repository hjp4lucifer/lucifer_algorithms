package cn.lucifer.algorithm;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cn.lucifer.algorithm.impl.InsertionSort;
import cn.lucifer.algorithm.impl.MergeSort;

public class SortTest extends BaseTest {

	private static int[] array;

	@Before
	public void setUp() throws Exception {
		int size = 9000;
		if (null == array) {
			array = generateArray(size);
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	public int[] getArray() {
		// printlnJson(array);
		return Arrays.copyOf(array, array.length);
	}

	@Test
	public void testJdkSort() {
		int[] array = getArray();
		// printlnJson(array);
		Arrays.sort(array);
	}

	@Test
	public void testInsertionSort() {
		// System.out.println("testInsertionSort");
		InsertionSort sort = new InsertionSort();
		int[] array = getArray();
		// printlnJson(array);
		sort.sort(array);
		// printlnJson(array);
	}

	@Test
	public void testMergeSort() {
		// System.out.println("testMergeSort");
		MergeSort sort = new MergeSort();
		int[] array = getArray();
		// int[] array = new int[] { 899, 198 };
		// printlnJson(array);
		sort.sort(array);
		// printlnJson(array);
	}

}
