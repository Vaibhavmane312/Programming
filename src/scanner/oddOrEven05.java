package scanner;

import java.util.Scanner;

public class oddOrEven05 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number ");
	int num=sc.nextInt();
	
	if (num%2==0) {
		System.out.println("Entered number is Even");
	} else {
        System.out.println("Entered number is odd");
	}
}
}
