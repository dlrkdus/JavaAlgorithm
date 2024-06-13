package com.ureca.day2;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		int[][] ia = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int[] a : ia)
			System.out.println(Arrays.toString(a));
		System.out.println("--------------");

		// 8방탐색 : 2,3,6,9,8,7,4,1
		for (int i = 0; i < ia.length; i++) {
			for (int j = 0; j < ia[i].length; j++) {
				if (ia[i][j] == 5) {
					System.out.println(ia[i - 1][j + 0]); // 2
					System.out.println(ia[i - 1][j + 1]); // 3
					System.out.println(ia[i + 0][j + 1]); // 6
					System.out.println(ia[i + 1][j + 1]); // 9
					System.out.println(ia[i + 1][j + 0]); // 8
					System.out.println(ia[i + 1][j - 1]); // 7
					System.out.println(ia[i + 0][j - 1]); // 4
					System.out.println(ia[i - 1][j - 1]); // 1
					System.out.println("---------");
					// 상우하좌 - 시계 방향
					int[] di = { -1, -1, 0, 1, 1, 1, 0, -1 };
					int[] dj = { 0, 1, 1, 1, 0, -1, -1, -1 };

					for (int d = 0; d < 8; d++) {
						int ni = i + di[d];
						int nj = j + dj[d];
						System.out.println(ia[ni][nj]);
					}
				}
			}
		}

//		// 4방탐색 : 3, 9, 7, 1
//		for (int i = 0; i < ia.length; i++) {
//			for (int j = 0; j < ia[i].length; j++) {
//				if (ia[i][j] == 5) {
//					System.out.println(ia[i - 1][j + 1]); // 3
//					System.out.println(ia[i + 1][j + 1]); // 9
//					System.out.println(ia[i + 1][j - 1]); // 7
//					System.out.println(ia[i - 1][j - 1]); // 1
//
//					// 상우하좌 - 시계 방향
//					int[] di = { -1, 1, 1, -1 };
//					int[] dj = { 1, 1, -1, -1 };
//
//					for (int d = 0; d < 4; d++) {
//						int ni = i + di[d];
//						int nj = j + dj[d];
//						System.out.println(ia[ni][nj]);
//					}
//				}
//			}
//		}

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

//		// 2방탐색 : 2, 8
//		for (int i = 0; i < ia.length; i++) {
//			for (int j = 0; j < ia[i].length; j++) {
//				if (ia[i][j] == 5) {
//					System.out.println(ia[i - 1][j + 0]); // 2
//					System.out.println(ia[i + 1][j + 0]); // 8
//
//					int[] di = { -1, 1 };
//					int[] dj = { 0, 0 };
//
//					for (int d = 0; d < di.length; d++) {
//						int ni = i + di[d];
//						int nj = j + dj[d];
//						System.out.println(ia[ni][nj]);
//					}
//				}
//			}
//		}

//		// 2방탐색 : 6,4
//		for (int i = 0; i < ia.length; i++) {
//			for (int j = 0; j < ia[i].length; j++) {
//				if (ia[i][j] == 5) {
//					System.out.println(ia[i + 0][j + 1]); // 6
//					System.out.println(ia[i + 0][j - 1]); // 4
//
//					int[] di = { 0, 0 };
//					int[] dj = { 1, -1 };
//
//					for (int d = 0; d < di.length; d++) {
//						int ni = i + di[d];
//						int nj = j + dj[d];
//						System.out.println(ia[ni][nj]);
//					}
//				}
//			}
//		}

//		// 1방탐색 : 5
//		for (int i = 0; i < ia.length; i++) {
//			for (int j = 0; j < ia[i].length; j++) {
//				if (ia[i][j] == 5) {
//					System.out.println(ia[i+0][j+0]); // 5
//					
//					int[] di = {0};
//					int[] dj = {0};
//					
//					for(int d = 0; d < 1;  d++) {
//						int ni = i + di[d];
//						int nj = j + dj[d];
//						System.out.println(ia[ni][nj]);
//					}
//				}
//			}
//		}

	}

}
