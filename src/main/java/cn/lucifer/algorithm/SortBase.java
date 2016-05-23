package cn.lucifer.algorithm;

import org.apache.commons.lang.text.StrBuilder;

import com.alibaba.fastjson.JSON;

public abstract class SortBase {
	
	public abstract void sort(int[] array);

	protected void printlnJson(Object object) {
		System.out.println(JSON.toJSON(object));
	}

	protected void printlnArray(int[] array, int start, int end) {
		StrBuilder builder = getStr(array, start, end);
		System.out.println(builder.toString());
	}

	protected StrBuilder getStr(int[] array, int start, int end) {
		StrBuilder builder = new StrBuilder("[");
		for (int i = start; i <= end; i++) {
			if (i != start) {
				builder.append(',');
			}
			builder.append(array[i]);
		}
		builder.append("]");
		return builder;
	}
}
