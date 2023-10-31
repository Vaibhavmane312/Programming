package scanner;

import java.util.Scanner;

public class areaOfRectangle11 {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length of rectangle");
	int l=sc.nextInt();
	System.out.println("Enter Width of rectangle");
	int w =sc.nextInt();
	
	System.out.println("area of rectangle "+areaofrectangle(l,w));
    }

public static int areaofrectangle(int l, int w) {
	int res=l*w;
	return res;
   }
}
