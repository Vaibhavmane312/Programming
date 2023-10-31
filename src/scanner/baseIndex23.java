package scanner;

import java.util.Scanner;

public class baseIndex23 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter base number");
	int base=sc.nextInt();   //2
	
	System.out.println("Enter index number");
	int index=sc.nextInt();  //4
	int indexmul=1;
	
	for (int i = 1; i <=index; i++) {     //1 2 3 
	    indexmul=indexmul*base;           // 1*2=2   //2*2=4  // 4*2=8       
	}
	
	System.out.println(indexmul);
	
}
}
