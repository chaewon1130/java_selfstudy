package YH_Ch20_Math_Array;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		char input1 = sc.next().charAt(0);
//		int num1 = input1 - 0;
//		char input2 = sc.next().charAt(0);
//		int num2 = input2 - 0;
//		Random rand = new Random();
//		for(int i=0; i<10; i++) {
//			int result = rand.nextInt(num2-num1) + num1;
//			System.out.print((char)result + " ");
//		}
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int Z = sc.nextInt();
		int max, min;
		if(A >= Z) {
			max = A;
			min = Z;
		}else {
			max = Z;
			min = A;
		}
		Random rand = new Random();
		for(int i=0; i<10; i++) {
			int result = rand.nextInt(max-min+1) + min;
			System.out.print(result + " ");
		}
	}
}