package scanner;

import java.util.Scanner;

public class digitalProductOfEvenDigits27 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	int num=sc.nextInt();
	int sum=1; 
	int rem;
	
	while (num>0) {
		rem=num%10; 
		
		if (rem%2==0) {
			sum=sum*rem;
		}
		
		num=num/10;
	}
	System.out.println("Digital product of even digits is: "+sum);
}
}
