package cn.lucifer.algorithm.count;

import java.util.ArrayList;

import org.junit.Test;

/**
 * 方形数量
 * 
 * @author Lucifer
 *
 */
public class RectangleCount {

	public Rectangle[] getAllRectangle(int width, int height) {
		int count = sumRectangleCount(width, height);
		Rectangle[] array = new Rectangle[count];

		int index = 0;
		for (int y = 0; y < height; y++) {
			for (int y2 = y; y2 < height; y2++) {
				for (int x = 0; x < width; x++) {
					for (int x2 = x; x2 < width; x2++) {
						Rectangle r = new Rectangle(x, x2, y, y2);

						array[index++] = r;
						
//						if (index >= count) {
//							return array;
//						}
					}
				}
			}
		}

		return array;
	}

	/**
	 * 
	 * @param x
	 *            横多少个长方形
	 * @param y
	 *            竖多少个长方形
	 * @return 一共多少个长方形
	 */
	public int sumRectangleCount(int x, int y) {
		// int sum = y * leijia(1, x) + x * leijia(1, y) - x * y;
		// if (x > 0 && y > 0) {
		// sum += sumRectangleCount(x - 1, y - 1);
		// }
		int sum = leijia(1, x) * leijia(1, y);
		return sum;
	}

	/**
	 * ∑num
	 * 
	 * @return
	 */
	public int leijia(int staterNum, int endNum) {
		int sum = 0;
		// for (int i = staterNum; i <= endNum; i++) {
		// sum += i;
		// }
		sum = (staterNum + endNum) * (endNum - staterNum + 1) / 2;
		return sum;
	}
}
