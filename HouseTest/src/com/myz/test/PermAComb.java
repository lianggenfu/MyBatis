package com.myz.test;

import java.util.ArrayList;
import java.util.List;

public class PermAComb {
	static List<int[]> allSorts = new ArrayList<int[]>();
	static int[][] secquence;

	public static void permutation(int[] nums, int start, int end) {
		if (start == end) { // ��ֻҪ���������һ�����ֽ���ȫ����ʱ��ֻҪ�Ͱ��������������
			int[] newNums = new int[nums.length]; // Ϊ�µ����д���һ����������
			for (int i = 0; i <= end; i++) {
				newNums[i] = nums[i];
			}
			allSorts.add(newNums); // ���µ�������ϴ������
		} else {
			for (int i = start; i <= end; i++) {
				int temp = nums[start]; // ���������һ��Ԫ���������Ԫ��
				nums[start] = nums[i];
				nums[i] = temp;
				permutation(nums, start + 1, end); // ����Ԫ�صݹ�ȫ����
				nums[i] = nums[start]; // ������������黹ԭ
				nums[start] = temp;
			}
		}
	}

	static {
		int[] numArray = { 0, 1, 2, 3, 4 };
		permutation(numArray, 0, numArray.length - 1);
		int[][] a = new int[allSorts.size()][]; // ��Ҫ�Ķ�ά����a
		allSorts.toArray(a);

		secquence = a;
	}

}
