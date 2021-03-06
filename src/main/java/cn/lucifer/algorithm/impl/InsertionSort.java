package cn.lucifer.algorithm.impl;

import cn.lucifer.algorithm.SortBase;

public class InsertionSort extends SortBase{

	@Override
	public void sort(int[] array) {
		for (int j = 1, len = array.length; j < len; j++) {
			int key = array[j];
			int i = j - 1;
			while (i > -1 && array[i] > key) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}
}
