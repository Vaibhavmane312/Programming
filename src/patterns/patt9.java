package patterns;

import java.util.Scanner;

public class patt9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		for (int r = 1; r <=num; r++) {
			for (int c = 1; c <=num; c++) {
				if (r*c==1 && r*c==2 && r*c==3 && r*c==4 && r*c==5 && 
						r*c==10 && r*c==15 && r*c==20 && r*c==25
						) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
