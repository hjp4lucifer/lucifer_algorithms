package cn.lucifer.math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CombinationTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAllCombinations() {
		String array[] = { "胸", "手", "腹", "小腿", "大腿", "臀部" };
		String[][] r = new Combination().allCombinations(array);
		if (true) {
			return;
		}
		String[] item;
		for (int i = 1, ilen = r.length; i < ilen; i++) {
			item = r[i];
			System.out.print(i + "\t");
			for (int j = 0, jlen = item.length; j < jlen; j++) {
				if (null == item[j]) {
					System.out.print("　\t");
				} else {
					System.out.print(item[j] + "\t");
				}
			}
			System.out.println();
		}
	}

}
