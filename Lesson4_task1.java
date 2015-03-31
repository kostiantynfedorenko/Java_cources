package com.gmail.fedorenko.kostia;

import java.util.Scanner;

/**
 * «Перевернуть массив» (При выполнении задания использовать дополнительный
 * массив нельзя)
 */
public class MyTask1 {

	public static void main(String[] args) {
		// Generate massive b
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Please enter square massive length ' '");
		n = sc.nextInt();
		int[][] b = new int[n][n];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				if ((j >= 0) && (j < b[0].length / 2)) {
					b[i][j] = 0;
				} else {
					b[i][j] = 1;
				}
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
		// generate reverse massive from b
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				if ((j >= b[0].length / 2) && (j < b[0].length) && (i >= 0)
						&& (i < b.length / 2)) {
					b[i][j] = 0;
				} else if ((j >= 0) && (j < b[0].length / 2)
						&& (i >= b.length / 2) && (i < b.length)) {
					b[i][j] = 1;
				}
			}
		}
		// print changed array b
		System.out.println("Reverse array");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
