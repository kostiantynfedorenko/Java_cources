package com.gmail.fedorenko.kostia;

import java.util.Scanner;

/**
 * Draw a figure with help of 1 cycle
 */
public class MyTask4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int x;
		int y;
		y = 1;
		x = 0;
		System.out.println("Enter figure's height");
		n = sc.nextInt();
		for (int i = 1; i < Math.pow(n, 2) + 1; i++) {
			System.out.print("*");
			x++;
			if (y == x) {
				System.out.println("");
				x = 0;
				if (i < (n * ((n + 1) / 2))) {
					y++;
				} else {
					y--;
				}

			}
		}
		sc.close();
	}
}
