package com.gmail.fedorenko.kostia;

import java.util.Scanner;

/**
 * To check whether point is inside triangle with coordinates: A(0,0) B(4,4)
 * C(6,1)
 */
public class MyTask3 {
	public static void main(String[] args) {
		// inputs
		Scanner sc = new Scanner(System.in);
		double X;
		double Y;
		System.out.println("Input coordinates X and Y with delimeter ' '");
		X = sc.nextDouble();
		Y = sc.nextDouble();
		/**
		 * Sides of triangle can be described with equations: AB: X-Y=0 BC:
		 * 3X+2Y=20 AC: X-6Y=0 Point must be lower than AB and BC but higher
		 * than AC to be inside triangle
		 */
		System.out.println(((X - Y > 0) && (3 * X + 2 * Y < 20)
				&& (X - 6 * Y < 0) ? "Yes" : "No"));
		sc.close();
	}

}
