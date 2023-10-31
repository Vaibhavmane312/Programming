package scanner;

import java.util.Scanner;

public class fiveSubMarksInput12 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks of 5 subject");
	double s1=sc.nextDouble();
	double s2=sc.nextDouble();
	double s3=sc.nextDouble();
	double s4=sc.nextDouble();
	double s5=sc.nextDouble();
	
	double PERCENTAGE=(s1+s2+s3+s4+s5/5);
	
	if (PERCENTAGE>=35) {
		System.out.println("PASS");
	}
	else 
		System.out.println("FAIL");
}
}
