package scanner;

import java.util.Scanner;

public class NeonNumber40 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	int pro=num*num;
	int sum=0;
	int temp=num;
	
	while (pro>0) {       //9        //8.5
		int rem=pro%10;     //81%10=1    //64%10=4
		sum=rem+sum;    //1+0=1      //1+4=5
		pro=pro/10;     //81/10=8.5  //8.5/10
	}
	if (sum==temp) {
		System.out.println("neon no");
	}
	else
		System.out.println("not neon no");
		
	}
}

