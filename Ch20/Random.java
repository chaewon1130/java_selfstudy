package Ch20;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);
		int max = 0;
		int min = 0;
		if (ch1 > ch2) {
			max = ch1;
			min = ch2;
		} else {
			max = ch2;
			min = ch1;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print((char) (Math.floor(Math.random() * (max - min)) + min) + " ");
		}
	}
}