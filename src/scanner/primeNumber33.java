package scanner;

import java.util.Iterator;
import java.util.Scanner;

public class primeNumber33 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		callPrime(num);
	}
	public static void callPrime(int num) {
		int count=0;
		for (int i = 1; i <=num; i++) {   //1<=3    
			if (num%i==0) {              //3%1=0  //3%2=1   3%3 =0
				count++;                 //1                //1
			}
		}	
		if (count==2) {
			System.out.println("Given number is prime");
		}
		else {
			System.out.println("Given number is not prime");
		}
	}

}
