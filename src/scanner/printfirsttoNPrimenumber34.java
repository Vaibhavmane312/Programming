package scanner;

import java.util.Iterator;
import java.util.Scanner;

public class printfirsttoNPrimenumber34 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int count;
		
		for (int i = 2; i <=num; i++) {   //i=2, i=3, i=4
			count=0;

			for (int j = 2; j <i; j++) {
				if (i%j==0) {           //2%2=0 //3%2=1  //4%2=0
					count++;           //1     //-       //1
					break;
				}
			}
			if (count==0) 
				System.out.println(i);
		}

	}
}


