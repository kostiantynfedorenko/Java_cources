package com.gmail.fedorenko.kostia;

/**
 * Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1). -
 * (При выполнении задания использовать дополнительный массив нельзя)
 *
 */
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class MyTask2 {
	public static void main(String[] args) {
		// Generate random array
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter square massive length ' '");
		int n = sc.nextInt();
		Random rn = new Random();
		int[] a = new int[n];
		for (int i=0;i<a.length;i++){
			a[i] = rn.nextInt(10);
		}
		System.out.println("Massive a before change: "+Arrays.toString(a));
		if ((n%2)==0){
			for(int i = 0;i <= a.length/2-1;i++){
	            int k = a[i];
	            a[i] = a[a.length-i-1];
	            a[a.length-i-1] = k;
	        }
		}
		else {
		 for(int i = 0;i <= a.length/2;i++){
	            int k = a[i];
	            a[i] = a[a.length-i-1];
	            a[a.length-i-1] = k;
	        }
		}
		 System.out.println("Massive a after change: "+Arrays.toString(a));
		sc.close();
	}

}
