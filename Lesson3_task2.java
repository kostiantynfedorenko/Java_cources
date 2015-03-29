package com.gmail.fedorenko.kostia;

import java.util.Scanner;

/**
 * A program that checks whether point with coordinates X and Y is inside
 * a circle with radius 4.
 */
public class MyTask2 {
	public static void main(String[] args) {
		// inputs
		Scanner sc = new Scanner(System.in);
		double X;
		double Y;
		System.out.println("Input coordinates X and Y with delimeter ' '");
		X = sc.nextDouble();
		Y = sc.nextDouble();
		/**
		 * Circle formula: X^2 + Y^2 = R^2 if center is (0,0)
		 * To check whether X and Y correspond to this equation.
		 */
		System.out.println(((X*X + Y*Y) < 16 ? "Yes" : "No"));
		sc.close();
	}

}
