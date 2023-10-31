package scanner;

import java.util.Scanner;

public class eligibleForMarriage06{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age ");
	int age=sc.nextInt();
	
	if (age>21) {
		System.out.println("Eligible for marriage");
	} else {
        System.out.println("Not eligible for marriage");
	}
}
}
