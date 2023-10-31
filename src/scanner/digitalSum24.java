package scanner;

import java.util.Scanner;

public class digitalSum24 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	int num=sc.nextInt();
	int temp=num;
	int sum=0; 
	int rem;
	
	while (num>0) {
		rem=num%10;      // 145%10= 5  //14%10=4     1%10=1
		
		sum=sum+rem;     // 0+5=6      //6+4=10      10+4=14
		
		num=num/10;     // 145/10=14  // 10/10=1     1/10=0	
	}
	System.out.println("Digital sum of "+ temp + " is: "+sum);
}
}
