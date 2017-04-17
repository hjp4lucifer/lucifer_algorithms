package cn.lucifer.math;

import static org.junit.Assert.*;

import org.apache.commons.lang.text.StrBuilder;
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
		String array[] = { "全身", "腿部", "腹部", "手臂", "胸背", "臀部" };
		String[][] r = new Combination().allCombinations(array);
		String[] item;
		StrBuilder builder = new StrBuilder(1024);
		for (int i = 1, ilen = r.length; i < ilen; i++) {
			item = r[i];
			builder.append(i).append("\t");
			for (int j = 0, jlen = item.length; j < jlen; j++) {
				if (null == item[j]) {
					builder.append("　\t");
				} else {
					builder.append(item[j]).append("\t");
				}
			}
			builder.append("\n");
		}
		System.out.println(builder.toString());
	}

}
