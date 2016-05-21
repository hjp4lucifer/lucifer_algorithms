package cn.lucifer.algorithm;

import com.alibaba.fastjson.JSON;

public class BaseTest {

	protected void printlnJson(Object object) {
		System.out.println(JSON.toJSON(object));
	}
	
}
