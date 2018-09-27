package com.myz.test;

import java.util.ArrayList;
import java.util.List;

public class PermAComb {
	static List<int[]> allSorts = new ArrayList<int[]>();
	static int[][] secquence;

	public static void permutation(int[] nums, int start, int end) {
		if (start == end) { // 当只要求对数组中一个数字进行全排列时，只要就按该数组输出即可
			int[] newNums = new int[nums.length]; // 为新的排列创建一个数组容器
			for (int i = 0; i <= end; i++) {
				newNums[i] = nums[i];
			}
			allSorts.add(newNums); // 将新的排列组合存放起来
		} else {
			for (int i = start; i <= end; i++) {
				int temp = nums[start]; // 交换数组第一个元素与后续的元素
				nums[start] = nums[i];
				nums[i] = temp;
				permutation(nums, start + 1, end); // 后续元素递归全排列
				nums[i] = nums[start]; // 将交换后的数组还原
				nums[start] = temp;
			}
		}
	}

	static {
		int[] numArray = { 0, 1, 2, 3, 4 };
		permutation(numArray, 0, numArray.length - 1);
		int[][] a = new int[allSorts.size()][]; // 你要的二维数组a
		allSorts.toArray(a);

		secquence = a;
	}

}
