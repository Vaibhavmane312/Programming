package scanner;

import java.util.Scanner;

public class areaOfCircle10 {
static double pie=3.14;

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter value of the radius ");
	int rad=sc.nextInt();
	areaofcircle(rad);
   }

public static void areaofcircle(int rad) {
	double res=pie*rad*rad;
	System.out.println("Area of circle is: "+ res);
    }
}
