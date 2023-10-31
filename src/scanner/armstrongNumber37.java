package scanner;

import java.util.Scanner;
                                   //15  //1*1=1  //2*2=4   //5
public class armstrongNumber37 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	int rem,temp,pro=0;
	temp=num;
	
	while (num>0) {                                                //0>0=FALSE
		rem=num%10;      //153%10=3   //15%10=5      //1%10=1         
		pro=(rem*rem*rem)+pro; //3*3*3=27  //5*5*5=125+27=152  //1*1*1=1+152=153
		num=num/10;      //153/10=15       //15/10=1           //1/10=0
	}
	if (pro==temp) {
		System.out.println("Given number is Armstrong no");
	}
	else {
		System.out.println("Given no is not Armstrong no");
	}
}
}
