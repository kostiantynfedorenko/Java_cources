package com.gmail.kostia.fedorenko;

import java.util.Scanner;

public class MyTaskThreeSecondLesson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R; // Circle radius
		System.out.println("Input circle radius: ");
		R = Math.abs(sc.nextDouble());
			double L = 2 * Math.PI * R;
			System.out.println("Circle's length equals to " + L);
		sc.close();
	}

}
