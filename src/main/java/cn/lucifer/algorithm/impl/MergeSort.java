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
			System.out.println("+--+" + leftIndex + "," + rightIndex);
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
		System.out.println(getStr(array, leftIndex, leftEndIndex).toString()
				+ " -- " + getStr(array, rightIndex, rightEndIndex).toString());
		int n1 = leftEndIndex - leftIndex + 1;
		int n2 = rightEndIndex - rightIndex + 1;
		System.out.println("++++ l=" + leftIndex + ",le=" + leftIndex + ",r="
				+ rightIndex + ",rn=" + rightEndIndex + ",n1=" + n1 + ",n2="
				+ n2);
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
			System.out.println(k + ":" + left[i] + "," + right[j]);
			if (left[i] <= right[j]) {
				array[k] = left[i];
				i++;
			} else {
				array[k] = right[j];
				j++;
			}
		}
		printlnJson(array);
	}
}
