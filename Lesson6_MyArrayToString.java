package com.gmail.fedorenko.kostia;

import java.util.Arrays;
import java.util.Random;

/**
 * Написать свой вариант метода Arrays.toString() для int[].
 *
 */
public class MyArrayToString {
	static StringBuffer int_to_str(int[] c, StringBuffer b) {
		for (int i = 0; i < c.length; i++) {
			if (i == 0) {
				b.append(c[i]);
			} else {
				b.append("," + c[i]);
			}
		}
		return b;
	}

	public static void main(String[] args) {
		Random rn = new Random();
		int[] a = new int[rn.nextInt(10)];
		for (int i = 0; i < a.length; i++) {
			a[i] = rn.nextInt(10);

		}
		System.out.println("Array is : " + Arrays.toString(a));
		StringBuffer sb = new StringBuffer();
		int_to_str(a, sb);
		String str = sb.toString();
		System.out.println("String is: " + str);
	}

}
