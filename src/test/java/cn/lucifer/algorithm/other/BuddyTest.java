package cn.lucifer.algorithm.other;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.lucifer.algorithm.BaseTest;

public class BuddyTest extends BaseTest {

	@Test
	public void testAllocBlock() {
		Buddy buddy = new Buddy();
		printlnJson(buddy.freePages);

		int blockSize = 128;
		while (buddy.allocBlock(blockSize)) {
			printlnJson(buddy.freePages);
		}
	}

}
