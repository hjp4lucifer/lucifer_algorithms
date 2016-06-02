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
	 * <ul>
	 * <li>算法说明：当n大于2时，n个数的全组合一共有(2^n)-1种。</li>
	 * <li>当对n个元素进行全组合的时候，可以用一个n位的二进制数表示取法。</li>
	 * <li>1表示在该位取，0表示不取。例如，对ABC三个元素进行全组合， 100表示取A，010表示取B，001表示取C，</li>
	 * <li>101表示取AC 110表示取AB，011表示取BC，111表示取ABC</li>
	 * <li>注意到表示取法的二进制数其实就是从1到7的十进制数</li>
	 * <li>推广到对n个元素进行全排列，取法就是从1到2^n-1的所有二进制形式</li>
	 * <li>要取得2^n，只需将0xFFFFFFFF左移32-n位，再右移回来就可以了。</li>
	 * <li></li>
	 * </ul>
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
