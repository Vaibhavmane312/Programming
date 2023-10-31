package scanner;

import java.util.Scanner;

public class smallestOf2Numbers13 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st number");
	int num1=sc.nextInt();
	System.out.println("Enter 2nd number");
	int num2=sc.nextInt();
	
	int res=num1<num2? num1:num2;
	
	System.out.println("Smallest number among 2 number is: "+res);
}
}
