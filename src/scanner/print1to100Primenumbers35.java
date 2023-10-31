package scanner;

import java.util.Scanner;

public class print1to100Primenumbers35 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int count;
		// FIRST 10 PRIME NUMERS:- (int i = 2; count<10 ; i++)
		for (int i = 2; i <=num; i++) {   //i=2, i=3, i=4            //2<3
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
