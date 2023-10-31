package scanner;

import java.util.Iterator;
import java.util.Scanner;

public class sumOfnNaturalNumbers20 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	int add=0;
	
	for (int i = 1; i <=num; i++) {
		 add=i+add;
	}
	System.out.println(add);
}
}
