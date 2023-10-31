package scanner;

import java.util.Scanner;

public class firsttonNfibonacciSeries31 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		
		System.out.print("First " + num + " Fibonacci numbers: ");
		
		if (num >= 1) {
			System.out.print(a + " ");
		}
		if (num >= 2) {
			System.out.print(b + " ");
		}
		if (num > 2) {
			for (int i = 3; i <= num; i++) {
				sum = a + b;
				System.out.print(sum + " ");
				a = b;
				b = sum;
			}

		}
	}
}

