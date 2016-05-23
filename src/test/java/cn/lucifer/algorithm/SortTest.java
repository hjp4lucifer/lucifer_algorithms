package cn.lucifer.algorithm;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cn.lucifer.algorithm.impl.InsertionSort;
import cn.lucifer.algorithm.impl.MergeSort;

public class SortTest extends BaseTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	private final int size = 9000;

	@Test
	public void testInsertionSort() {
		// System.out.println("testInsertionSort");
		InsertionSort sort = new InsertionSort();
		int[] array = generateArray(size);
		// printlnJson(array);
		sort.sort(array);
		// printlnJson(array);
	}

	@Test
	public void testMergeSort() {
		// System.out.println("testMergeSort");
		MergeSort sort = new MergeSort();
		int[] array = generateArray(size);
		// int[] array = new int[] { 899, 198 };
		// printlnJson(array);
		sort.sort(array);
		// printlnJson(array);
	}
}
