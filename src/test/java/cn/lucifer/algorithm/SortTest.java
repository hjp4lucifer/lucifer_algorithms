package cn.lucifer.algorithm;

import static org.junit.Assert.*;

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

	@Test
	public void testInsertionSort() {
		InsertionSort sort = new InsertionSort();
		int[] array = generateArray(20);
		printlnJson(array);
		sort.sort(array);
		printlnJson(array);
	}

	@Test
	public void testMergeSort() {
		MergeSort sort = new MergeSort();
		 int[] array = generateArray(19);
//		int[] array = new int[] { 899, 198 };
		printlnJson(array);
		sort.sort(array);
		printlnJson(array);
	}
}
