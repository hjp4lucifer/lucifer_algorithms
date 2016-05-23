package cn.lucifer.algorithm.impl;

import cn.lucifer.algorithm.SortBase;

public class MergeSort extends SortBase {

	@Override
	public void sort(int[] array) {
		sort(array, 0, array.length - 1);
	}

	public void sort(int[] array, int leftIndex, int rightIndex) {
		int size = rightIndex - leftIndex;
		if (size > 0) {
			int middleIndex = (leftIndex + rightIndex) / 2;
			if (size > 1) {
				sort(array, leftIndex, middleIndex);
				sort(array, middleIndex + 1, rightIndex);
			}
			merge(array, leftIndex, middleIndex, middleIndex + 1, rightIndex);
		}
	}

	public void merge(int[] array, int leftIndex, int leftEndIndex,
			int rightIndex, int rightEndIndex) {
		int n1 = leftEndIndex - leftIndex + 1;
		int n2 = rightEndIndex - rightIndex + 1;
		int[] left = new int[n1 + 1];
		int[] right = new int[n2 + 1];
		for (int i = 0; i < n1; i++) {
			left[i] = array[leftIndex + i];
		}
		for (int j = 0; j < n2; j++) {
			right[j] = array[rightIndex + j];
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
