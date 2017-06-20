package cn.lucifer.algorithm.other;

import java.util.LinkedList;

/**
 * 在操作系统内存管理中，为了避免产生过多的内存碎片，经常使用伙伴算法对内存进行管理，请实现伙伴算法，并提供内存分配与释放的方法。
 * <p>
 * 未校验结果
 * </p>
 * 
 * @author Lucifer
 *
 */
public class Buddy {

	protected int allocSize;
	protected LinkedList<Integer> freePages;

	public Buddy() {
		int len = 10;
		freePages = new LinkedList<>();
		for (int i = 0; i < len; i++) {
			freePages.add(1 << i);
		}
	}

	/**
	 * 
	 * @param blockSize
	 *            申请内存大小
	 * @return false表示没有剩余空间
	 */
	public synchronized boolean allocBlock(int blockSize) {
		int i = 0;
		for (Integer p : freePages) {
			if (p < blockSize) {
				i++;
				continue;
			}
			if (p == blockSize) {// 大小刚好相等
				allocSize += p.intValue();
				freePages.remove(i);
				return true;
			}

			// p 大于需要申请的内存
			int count = 0;// 分裂次数
			int p2, p3;// 分裂前、后
			do {
				p2 = p.intValue() >> count;
				p3 = p2 >> 1;
				if (p2 <= 0) {// 无内存可申请了, 理论上不应该存在
					return false;
				}
				if (p3 < blockSize) {// 比申请的分裂块小了
					// 确定使用范围
					allocSize += p2;
					freePages.remove(i);
					// 开始分裂
					for (int j = 0; j < count; j++) {
						p2 = p2 << j;
						freePages.add(i++, p2);

					}

					return true;
				}
				count++;
			} while (true);

		}

		return false;
	}

}
