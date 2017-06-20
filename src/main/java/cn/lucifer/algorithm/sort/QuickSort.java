package cn.lucifer.algorithm.sort;

public class QuickSort {

	public void quickSort(int[] a) {
		if (null == a || a.length < 2) {
			return;
		}
		quickSort(a, 0, a.length - 1);
	}

	protected void quickSort(int[] a, int low, int high) {
		if (low < high) {
			int p = partition(a, low, high);
			quickSort(a, low, p - 1);
			quickSort(a, p + 1, high);
		}
	}

	private int partition(int[] a, int low, int high) {
		int pivot = a[low];

		while (low < high) {
			while (low < high && a[high] >= pivot) {
				high--;
			}
			a[low] = a[high];
			while (low < high && a[low] <= pivot) {
				low++;
			}
			a[high] = a[low];
		}
		a[low] = pivot;

		return low;
	}
}
