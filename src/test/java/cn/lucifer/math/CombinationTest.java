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
	public void testPrintAllCombinations() {
		String array[] = { "胸", "手", "腹", "小腿", "大腿", "臀部" };
		new Combination().printAllCombinations(array);
	}

}
