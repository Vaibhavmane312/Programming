package scanner;

import java.util.Scanner;

public class DRY {
	 public static void main(String args[]){ 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number");
		 int num=sc.nextInt();   //153
		 int temp=num;
		 int rem,pro=0;
   
		  while(num>0){    
		   rem=num%10;     
		   pro= (rem*rem*rem)+pro;    
		   num=num/10;    
		  }  
	
		  if(temp==pro)    
		   System.out.println("Armstrong number ");    
		  else    
		   System.out.println("not Armstrong number");    
}  
}  

