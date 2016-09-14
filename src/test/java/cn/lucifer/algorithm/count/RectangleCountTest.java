package cn.lucifer.algorithm.count;

import static org.junit.Assert.*;

import org.apache.commons.lang.text.StrBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RectangleCountTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRectangleCount() {
		int width = 2;
		int height = 4;
		int sum = new RectangleCount().sumRectangleCount(width, height);
		System.out.println(sum);
	}

	@Test
	public void testPrint() {
		int width = 2;
		int height = 4;
		Rectangle rectangle = new Rectangle();
		rectangle.x2 = 1;
		// rectangle.y2 = width - 1;

		StrBuilder builder = getPriStr(rectangle, width, height);

		System.out.println(builder);
	}

	@Test
	public void testGetAllRectangle() {
		int width = 2;
		int height = 2;

		Rectangle[] array = new RectangleCount().getAllRectangle(width, height);
		for (int i = 0; i < array.length; i++) {
			System.out.println((i + 1) + "：");
			System.out.println(getPriStr(array[i], width, height));
			System.out.println("----------------------------------------");
		}
	}

	protected StrBuilder getPriStr(Rectangle rectangle, int width, int height) {
		if (null == rectangle) {
			return null;
		}
		StrBuilder builder = new StrBuilder(1024);

		builder.append("┌");
		for (int i = 0; i < width; i++) {
			builder.append("─");
		}
		builder.append("┐\n");
		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {
				if (i == 0) {
					builder.append("│");
				}
				if (rectangle.checkIn(i, j)) {
					builder.append("■");
				} else {
					builder.append("□");
				}
				if (i + 1 == width) {
					builder.append("│");
				}
			}
			builder.append('\n');
		}
		builder.append("└");
		for (int i = 0; i < width; i++) {
			builder.append("─");
		}
		builder.append("┘");
		return builder;
	}
}
