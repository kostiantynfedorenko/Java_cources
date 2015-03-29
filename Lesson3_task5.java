package com.gmail.fedorenko.kostia;

import java.util.Scanner;

/**
 * Calculate n! where 4<n<16
 *
 */
public class MyTask5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int res = 1;
		System.out.println("Enter n between 4 and 16");
		n = sc.nextInt();
		if ((n > 4)&&(n<16)) {
			for (int i=1; i <= n; i++) {
			res = res*i;
			}
			System.out.println(n+"! = " + res);
		}
		else {
			System.out.println("Whong n entered");
		}
		sc.close();

	}

}
