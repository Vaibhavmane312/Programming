package scanner;

import java.util.Iterator;
import java.util.Scanner;

public class nto1Numbers19{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	int i=1;
 //using for loop
	
	for (int r=num; r>=i; r--) {
		System.out.println(r);
	}
//using do while loop
	
	do {
		System.out.println(num);
		num--;
	} while (num>=i);
	
//using while loop
	while (num>=i) {
		System.out.println(num);
		num--;
	}

}
}
