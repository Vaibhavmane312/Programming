package scanner;

import java.util.Scanner;

public class oneTonNumbers18{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	int ii=1;
	
// using for loop	
	for (int i = 1; i <= num; i++) {
		System.out.println(i);
	}
//	while loop
	
	while (ii<=num) {
		ii++;
		System.out.println(ii);
	}
//	using do while loop
	
	do {
		System.out.println(ii);
		ii++;
	} while (ii<=num);
}
}
