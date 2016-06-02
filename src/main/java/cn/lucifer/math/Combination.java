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
	 * 
	 * @param array
	 */
	public void printAllCombinations(String[] array) {
		int arrayLen = array.length;
		int nBit = (0xFFFFFFFF >>> (32 - arrayLen));
		for (int i = 1; i <= nBit; i++) {
			System.out.print(i + "\t");
			for (int j = 0; j < arrayLen; j++) {
				if ((i << (31 - j)) >> 31 == -1) {
					System.out.print(array[j] + "\t");
				}
			}
			System.out.println();
		}
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
