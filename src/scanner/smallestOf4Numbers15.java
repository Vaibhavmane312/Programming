package scanner;

import java.util.Scanner;

public class smallestOf4Numbers15{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st number");
	int num1=sc.nextInt();
	System.out.println("Enter 2nd number");
	int num2=sc.nextInt();
	System.out.println("Enter 3rd number");
	int num3=sc.nextInt();
	System.out.println("Enter 4th number");
	int num4=sc.nextInt();
	
	int res=num1<num2 && num1<num3 && num1<num4? num1:num2<num3 && num2<num4? num2:num3<num4? num3:num4;
	
    System.out.println("Smallest number among 4 number is "+res);
}
}
