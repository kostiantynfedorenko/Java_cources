package com.gmail.fedorenko.kostia;

/**
 * Число-палиндром с обеих сторон (справа налево и слева направо) читается
 * одинаково. Самое большое число-палиндром, полученное умножением двух
 * двузначных чисел – 9009 = 91 × 99. Найдите самый большой палиндром,
 * полученный умножением двух трёхзначных чисел. (4 часа)
 *
 */
public class MyTask2 {
	static boolean ispal(int a, int b) {
		int temp = a * b;
		int f = 1;
		boolean tbool = false;
		String temp_srt = Integer.toString(temp);
		char[] temp_srt_ch = temp_srt.toCharArray();
		for (int i = 0; i < (temp_srt_ch.length) / 2; i++) {
			if (temp_srt_ch[i] == temp_srt_ch[temp_srt_ch.length - 1 - i]) {
				f = f * 1;
			} else {
				f = f * 0;
			}
		}
		if (f == 1) {
			tbool = true;
		}
		return tbool;
	}

	public static void main(String[] args) {
		int currval = 0;
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				boolean palindr = ispal(i, j);
				if (palindr == true) {
					currval = i * j;
				}
			}
		}
		System.out.println(currval);
	}

}
