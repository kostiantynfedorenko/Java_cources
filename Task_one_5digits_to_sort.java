package com.gmail.kostia.fedorenko;

import java.util.Scanner;

public class MyTaskOneSecondLesson {

	public static void main(String[] args) {
		/*
		 * create a program that will take 5-digit number and output digits in
		 * order
		 */
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Input x");
		x = sc.nextInt(); //to check that 5-digit number was entered 
		String xstr = Integer.toString(x);
		if (xstr.length() == 5) {
			int x1 = 10000;
			for (int i = 1; i < xstr.length() + 1; i++) {
				int x2 = x / x1;
				System.out.println(x2);
				x = x % x1;
				x1 = x1 / 10;
			}
		} else
			System.out.println("Please enter 5-digit number");
		sc.close();
	}

}
