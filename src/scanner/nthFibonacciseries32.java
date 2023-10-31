package scanner;

import java.util.Scanner;

public class nthFibonacciseries32 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int nthFibonacci=0;

		if (num == 1) {
			nthFibonacci = a;
		}
		else if (num == 2) {
			nthFibonacci = b;
		}
		else {
			for (int i = 3; i <= num; i++) {

				nthFibonacci=a+b; //1  //2  //3
				a=b;              //1  //1  //2
				b=nthFibonacci;   //1  //2  //
			}
		}
		System.out.println("The "+num+" th Fibonacci number is: "+nthFibonacci);
	}
}
