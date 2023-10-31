package scanner;

import java.util.Scanner;

public class eligibleForBloodDonation07{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age ");
	int age=sc.nextInt();
	
	System.out.println("Enter weight ");
	int weight=sc.nextInt();
	
	if (age>18) {
		if (weight>55) {
			System.out.println("Eligible for blood donation");
		}
	} else {
		System.out.println("Not eligible for blood donation");

	}
}
}
