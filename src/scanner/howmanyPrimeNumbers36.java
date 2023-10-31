package scanner;                  

import java.util.Scanner;

public class howmanyPrimeNumbers36 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int rem,count=0,count1=0;

		while (num>0) {  //125
			rem=num%10;  //125%10=5

			for (int i = 1; i <=rem; i++) {
				if (rem%i==0) {   //5%1=1 //5%2=1  //5%3  5%4 
					count++;      //
				}
			}
			num=num/10;
			System.out.println(count1);
		}
		//System.out.println(count1);
	}
}
