package com.gmail.fedorenko.kostia;

import java.util.Scanner;

/**
 * A program that prints max of 4 entered numbers.
 *
 */
public class MyTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		System.out.println("Input 4 values with delimeter ' '");
		a = sc.nextInt(); // Math.abs - to deal with positive values
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		if (a < b) {
			a = b;
		}
		if (a < c) {
			a = c;
		}
		if (a < d) {
			a = d;
		}
		System.out.println(a);
		sc.close();
	}

}
