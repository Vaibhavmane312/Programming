package scanner;

import java.util.Scanner;

public class simpleInterest08{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Principal Amount ");
	int PA=sc.nextInt();
	System.out.println("Enter Intrest Rate");
	double IR=sc.nextDouble();
	System.out.println("Enter Time Duration");
	int time=sc.nextInt();
	
	double res=PA*IR*time/100;
	System.out.println("Simple interest for "+ time + " month is: " + res);
}
}
