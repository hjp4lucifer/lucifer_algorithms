package cn.lucifer.algorithm.sort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import cn.lucifer.algorithm.BaseTest;

public class QuickSortTest extends BaseTest {

	@Test
	public void testQuickSortIntArray() {
		int[] a = new int[(int) (Math.random() * 20 + 10)];
		int len = a.length;
		for (int i = 0; i < len; i++) {
			a[i] = (int) (Math.random() * 1000);
		}
		// printlnJson(a);

		// 留比较用
		int[] a2 = Arrays.copyOf(a, len);
		// printlnJson(a2);

		new QuickSort().quickSort(a);
		// printlnJson(a);

		Arrays.sort(a2);
		// printlnJson(a2);
		assertArrayEquals(a2, a);
	}

}
