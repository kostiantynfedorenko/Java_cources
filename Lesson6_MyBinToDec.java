package com.gmail.fedorenko.kostia;

import java.util.Scanner;

/**
 * Ввести с консоли число в бинарном формате. Перевести его в int и вывести на
 * экран (“10” -> 2).
 *
 */
public class MyBinToDec {
	static int BinToDec(String binary) {
		int res = 0, temp1 = 0, temp2 = 0;
		char[] bin_char = binary.toCharArray();
		for (int len = bin_char.length - 1; len >= 0; len--) {
			double temp3 = 0;
			temp1 = Character.getNumericValue(bin_char[len]);
			temp3 = temp1 * Math.pow(2, temp2);
			temp2++;
			res += temp3;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number in binary format");
		String bin = sc.nextLine();
		int Result = BinToDec(bin);
		System.out.println("'" + bin + "' ---> '" + Result + "'");
		sc.close();
	}

}
