package scanner;

import java.util.Scanner;

//in below tax=500000=5%                 //tax/100*price
//in between 500000-100000=10%
//above 100000=20%
public class taxtoPaid17 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter price");
	double price=sc.nextDouble();
	double tax;
	
	if (price<500000) {
		tax=5;
		System.out.println("tax to paid "+ (tax/100)*price);
	}
	else if (price>500000 && price<1000000) {
		tax=10;
		System.out.println("tax to paid "+ (tax/100)*price);
	}
	else if (price>1000000) {
		tax=20;
		System.out.println("tax to paid "+ (tax/100)*price);
	}
}
}
