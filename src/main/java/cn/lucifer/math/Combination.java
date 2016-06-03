package cn.lucifer.math;

/**
 * 组合数
 * 
 * @see <a href='https://en.wikipedia.org/wiki/Combination'>wiki for
 *      Combination</a>
 * @author Lucifer
 *
 */
public class Combination {

	/**
	 * 打印全部组合
	 * @param array
	 * @return
	 */
	public String[][] allCombinations(String[] array) {
		int arrayLen = array.length;
		final int count = 1 << arrayLen;
		if (count < 0) {
			throw new RuntimeException("array too large !");
		}
		String[][] r = new String[count][];
		String[] item;
		for (int i = 1; i < count; i++) {
			item = new String[arrayLen];
			r[i] = item;
			for (int j = 0; j < arrayLen; j++) {
				if (((i & (1 << j)) >> j) == 1) {
					item[j] = array[j];
				}
			}
		}
		return r;
	}

	/**
	 * <p>
	 * k个元素里面选择n个, 返回一共可选的数量
	 * </p>
	 * <p>
	 * n choose k
	 * </p>
	 * 
	 * @return
	 */
	public int numberOfCombinations(int n, int k) {
		return factorial(n) / (factorial(k) * factorial(n - k));
	}

	/**
	 * <p>
	 * 阶乘
	 * </p>
	 * <p>
	 * where n! denotes the factorial of n
	 * </p>
	 * 
	 * @return
	 */
	public int factorial(int n) {
		int sum = 1;
		for (int i = n; i > 1; i--) {
			sum *= i;
		}
		return sum;
	}
}
