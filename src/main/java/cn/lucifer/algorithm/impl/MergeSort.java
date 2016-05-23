package cn.lucifer.algorithm.impl;

import cn.lucifer.algorithm.SortBase;

public class MergeSort extends SortBase {

	@Override
	public void sort(int[] array) {
		sort(array, 0, array.length - 1);
	}

	public void sort(int[] array, int leftIndex, int rightEndIndex) {
		int size = rightEndIndex - leftIndex;
		if (size > 0) {
			int middleIndex = (leftIndex + rightEndIndex) / 2;
			if (size > 1) {
				sort(array, leftIndex, middleIndex);
				sort(array, middleIndex + 1, rightEndIndex);
			}
			merge(array, leftIndex, middleIndex, rightEndIndex);
		}
	}

	public void merge(int[] array, int leftIndex, int leftEndIndex,
			int rightEndIndex) {
		int n1 = leftEndIndex - leftIndex + 1;
		int n2 = rightEndIndex - leftEndIndex;
		int[] left = new int[n1 + 1];
		int[] right = new int[n2 + 1];
		for (int i = 0; i < n1; i++) {
			left[i] = array[leftIndex + i];
		}
		for (int j = 0; j < n2; j++) {
			right[j] = array[leftEndIndex + j + 1];
		}
		left[n1] = Integer.MAX_VALUE;
		right[n2] = Integer.MAX_VALUE;
		for (int k = leftIndex, i = 0, j = 0; k <= rightEndIndex; k++) {
			if (left[i] <= right[j]) {
				array[k] = left[i];
				i++;
			} else {
				array[k] = right[j];
				j++;
			}
		}
	}

}
