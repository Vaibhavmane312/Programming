package scanner;

import java.util.Scanner;

public class factorialOfnUsingRecursion22 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	System.out.println( "factorial of number " + num +" is: "+facto(num));
}
public static int facto(int num) {//6  
	 if (num<=0) {
		return 1;
	}             
		int store=num*facto(num-1);  
		             //6*(6-1)=30  //30*(5-1)=120  //120*(4-1)=360 //360*(3-1)=720  //720*(2-1)=720
		return store;
	
		
		
	}
}

