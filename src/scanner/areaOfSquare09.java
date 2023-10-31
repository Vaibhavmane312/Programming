package scanner;

import java.util.Scanner;

public class areaOfSquare09{
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter value of the side ");
	int side=sc.nextInt();
	areaofsquare(side);
}
public static void areaofsquare(int a) {
	int res=a*a;
	System.out.println("Area of square is: "+ res);
}
}
