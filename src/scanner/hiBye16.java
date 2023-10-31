package scanner;

import java.util.Scanner;

public class hiBye16 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	
	if (num%3==0) {
		System.out.println("HI");
	}
	else if (num%5==0) {
		System.out.println("BYE");
	}
	else if (num%3==0 && num%5==0) {
		System.out.println("HIBYE");
	}
	else {
		System.out.println("NUMBER IN REST OF THE CASES");
	}
			
	
}
}
