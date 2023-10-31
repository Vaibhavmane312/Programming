package scanner;

import java.util.Scanner;

public class reverseNumberPrint28 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	int rem;
	
	while (num>0) {
		rem=num%10;      
		System.out.print(rem);    
		num=num/10; 
	}
}
}
