package com.ureca.day2;

import java.util.Arrays;

public class Array9 {
	// 변하지 않는 값 -> 상수로 만들어 줌 final
	// 상우하좌 - 시계 방향
	static final int[] di = { -1, 0, 1, 0 };
	static final int[] dj = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		int[][] ia = { { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 9, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };

		for (int[] a : ia)
			System.out.println(Arrays.toString(a));
		System.out.println("--------------");

		int N = ia.length;
		int M = ia[0].length;

		// 4방탐색 : 상우하좌
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (ia[i][j] == 9) {
					for (int k = 1; k <= 3; k++) {
						for (int d = 0; d < 4; d++) {
							int ni = i + di[d] * k;
							int nj = j + dj[d] * k;
							if (ni >= 0 && nj >= 0 && ni < N && nj < M) {
								ia[ni][nj] = k;
							}
						}
					}
				}
			}
		}

		for (int[] a : ia)
			System.out.println(Arrays.toString(a));
	}
}
