package com.gmail.fedorenko.kostia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Ввести с консоли дату. Сравнить ее с текущей датой в системе. Вывести
 * отличающиеся части (год, месяц) на экран.
 *
 */
public class MyDiffData {
	static int[] ToInt(String[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		return b;
	}

	public static void main(String[] args) {
		long t;
		t = System.currentTimeMillis();
		SimpleDateFormat stf1 = new SimpleDateFormat("dd:MM:y");
		SimpleDateFormat stf2 = new SimpleDateFormat("dd:MM:y");
		Date dd = new Date(t);
		String res = stf1.format(dd);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Date DD:MM:YYYY");
		String str = sc.nextLine();
		Date dd2 = new Date(t); // -так правильно
		try {
			dd2 = stf2.parse(str);
		} catch (ParseException e) {
			System.out.println("Wrong input");
		}
		String res2 = stf1.format(dd2);
		String[] res_arr = res.split(":");
		String[] res2_arr = res2.split(":");
		int[] res_arr_int = new int[res_arr.length];
		int[] res2_arr_int = new int[res2_arr.length];
		ToInt(res_arr, res_arr_int);
		ToInt(res2_arr, res2_arr_int);
		System.out.println(" Month difference: "
				+ Math.abs((res_arr_int[1] - res2_arr_int[1]))
				+ " Year difference: "
				+ Math.abs((res_arr_int[2] - res2_arr_int[2])));
		sc.close();

	}

}
