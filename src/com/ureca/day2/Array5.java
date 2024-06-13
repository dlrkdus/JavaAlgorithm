package com.ureca.day2;

import java.util.Arrays;

public class Array5 {
	// 변하지 않는 값 -> 상수로 만들어 줌 final
	// 상우하좌 - 시계 방향
	static final int[] di = { -1, 0, 1, 0 };
	static final int[] dj = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		int[][] ia = { { 1, 2, 3 }, 
					   { 4, 5, 6 },
					   { 7, 8, 9 }
					 };
		
		// 코드 찍기

		for (int[] a : ia)
			System.out.println(Arrays.toString(a));
		System.out.println("--------------");

		int N = ia.length;
		int M = ia[0].length;
		
		

		// 4방탐색 : 5,9,?,7
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (ia[i][j] == 8) {
					for (int d = 0; d < 4; d++) {
						int ni = i + di[d];
						int nj = j + dj[d];
						if (ni >= 0 && nj >= 0 && ni < N && nj < M) { //처음 짤 때부터 규칙적으로, 틀리면 캐치하기 힘들다
							System.out.println(ia[ni][nj]);
						}
					}
				}
			}
		}

//		// 4방탐색 : 2, 6, 8, 4
//		for (int i = 0; i < ia.length; i++) {
//			for (int j = 0; j < ia[i].length; j++) {
//				if (ia[i][j] == 5) {
//					System.out.println(ia[i - 1][j + 0]); // 2
//					System.out.println(ia[i + 0][j + 1]); // 6
//					System.out.println(ia[i + 1][j + 0]); // 8
//					System.out.println(ia[i + 0][j - 1]); // 4
//
//					// 상우하좌 - 시계 방향
//					int[] di = { -1, 0, 1, 0 };
//					int[] dj = { 0, 1, 0, -1 };
//
//					for (int d = 0; d < 4; d++) {
//						int ni = i + di[d];
//						int nj = j + dj[d];
//						System.out.println(ia[ni][nj]);
//					}
//				}
//			}
//		}

	}

}
