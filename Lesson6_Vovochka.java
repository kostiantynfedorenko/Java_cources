package com.gmail.fedorenko.kostia;

import java.util.Scanner;

/**
 * Task about vovochka
 *
 */
public class MyVovochka {
	static boolean checkstring(String a, int b){
		boolean check_bool = false;
		int c = Math.round(a.length()/b);//check_quantity
//		System.out.println("Check count:" + c);
		int n = 0;
		int k = b;
		String[] MAS1 = new String[a.length()];
		for (int i = 0; i < c; i++) {
			MAS1[i]=a.substring(n,k);
			n += b;
			k += b;
		}
		for(int i=1; i < c; i++){
			if (MAS1[i].equals(MAS1[0]) == true) {	
				check_bool = true;
			}
			else {
				check_bool = false;
				break;
			}
		}
		return check_bool;
	}

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
//				str_check1 = Vovochka.substring(0, index);
//				str_check2 = Vovochka.substring(index, index + index);
				
				if (checkstring(Vovochka,index) == true) {
					str_check1 = Vovochka.substring(0, index);
					break;
				}
			}
		}
		if (str_check1.equals("0") == true) {
			str_check1 = Vovochka;
		}
		System.out.println("Time: " + (System.currentTimeMillis() - t));
		System.out.println("Vovochka's minimal number is: " + str_check1);
		sc.close();
	}

}
