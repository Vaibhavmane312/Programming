package scanner;

import java.util.Scanner;

public class digitalProduct25 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	int temp=num;
	int pro=1; 
	int rem;
	
	while (num>0) {
		rem=num%10;     
		
		pro=pro*rem;   
		
		num=num/10;            
	}
	System.out.println("Digital product of "+ temp + " is: "+pro);
}
}
