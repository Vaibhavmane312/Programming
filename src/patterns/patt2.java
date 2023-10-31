package patterns;

import java.util.Scanner;

public class patt2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	
	for (int r = 1; r <=num; r++) {
		for (int c = 1; c <=num; c++) {
			System.out.print(" * ");
		}
		System.out.println();
	}
}
}
