package com.gmail.fedorenko.kostia;
import java.util.Scanner;
/**
 * Task about vovochka
 *
 */
public class MyVovochka {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter vovochka's sequence");
		String Vovochka = sc.nextLine();
		long t = System.currentTimeMillis();
		char[] Vovochka_char = Vovochka.toCharArray();
		char checkpoint = Vovochka_char[0];
		int index = 0;
		for (int len = 1; len < Vovochka_char.length; len++) {
			if (Vovochka_char[len] == checkpoint) {
				index = len;
				break;
			}
		}
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i <= index-1; i++){
			sb.append(Vovochka_char[i]);
		}
		String str = sb.toString();
		System.out.println("Time: " + (System.currentTimeMillis() - t));
		System.out.println("Vovochka's minimal number is: "+str);
		sc.close();
	}

}
