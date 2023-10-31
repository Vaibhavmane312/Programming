package scanner;

import java.util.Scanner;

public class reverseNumberAndStore29 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int rem;
		
		while (num>0) {
			rem=num%10;       
			num=num/10; 
		}
	}
}
