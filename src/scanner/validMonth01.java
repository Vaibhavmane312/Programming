package scanner;

import java.util.Scanner;

public class validMonth01 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter month number");
	int month=sc.nextInt();
	
	if (month<=12) {
		System.out.println("Given month is valid.");
	}
	else {
		System.out.println("Given month is not valid.");
	}
}
}
