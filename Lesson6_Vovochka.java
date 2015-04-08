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
		String str_check1 = "0";
		String str_check2 = "0";
		for (int len = 1; len < Vovochka_char.length; len++) {
			if (Vovochka_char[len] == checkpoint) {
				index = len;
				str_check1 = Vovochka.substring(0,index);
				str_check2 = Vovochka.substring(index,index+index);
				if (str_check1.equals(str_check2) == true){
					break;	
				}
			}
		}
		System.out.println("Time: " + (System.currentTimeMillis() - t));
		System.out.println("Vovochka's minimal number is: "+str_check1);
		sc.close();
	}

}
