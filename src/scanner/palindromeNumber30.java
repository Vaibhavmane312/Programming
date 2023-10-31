package scanner;

import java.util.Scanner;

public class palindromeNumber30 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int temp=num;  
		int rem;
		int sum=0;
		
		while (num>0) {  
			rem=num%10;     
			sum=(sum*10)+rem; 
			num=num/10; 
		}
		if (temp==sum) 
			System.out.println("Given number is palindrome");
		
		else 
			System.out.println("Given number is not a palindrome");
			
}

}
