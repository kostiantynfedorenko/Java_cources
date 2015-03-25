package com.gmail.kostia.fedorenko;

import java.util.Scanner;

public class MyTaskTwoSecondLesson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double c;
		System.out.println("Input trilangle sides with delimiter ' '");
		a = Math.abs(sc.nextDouble()); //Math.abs - to deal with positive values
		b = Math.abs(sc.nextDouble());
		c = Math.abs(sc.nextDouble());
		if (c < (a + b) && a < (c + b) && b < (a + c)) {
			// Geron's formula
			double p = (a + b + c) / 2;
			double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			System.out.println("Triangle's square equals to " + S);
		} else
			System.out.println("Triangle's dimensions entered are wrong, sorry");
		sc.close();
	}

}
