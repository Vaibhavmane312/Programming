package scanner;

import java.util.Scanner;

public class factorialOfnLoop21 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	int base=1;
	int facto=1;
	
	for (int i = num; i>= base; i--) {
		facto=i*facto;
	}
	System.out.println("Factorial of "+num+ " is :"+facto);
}
}
