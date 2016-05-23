package cn.lucifer.algorithm;

import com.alibaba.fastjson.JSON;

public class BaseTest {

	protected void printlnJson(Object object) {
		System.out.println(JSON.toJSON(object));
	}

	protected int[] generateArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = (int) (Math.random() * 1000);
		}
		return array;
	}
}
