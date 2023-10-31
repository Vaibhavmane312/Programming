package scanner;

import java.util.Scanner;

public class leapYear04 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Year ");
	int year=sc.nextInt();
	
	if ((year%4==0) && (year%100!=0) || year%400==0) {
		System.out.println("Entered year is Leap Year");
	} else {
        System.out.println("Entered year is not Leap Year");
	}
}
}
