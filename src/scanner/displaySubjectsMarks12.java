package scanner;

import java.util.Scanner;

public class displaySubjectsMarks12 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter math subject marks");
	int math=sc.nextInt();
	System.out.println("Enter physics subject marks");
	int phy =sc.nextInt();
	System.out.println("Enter chemistry subject marks");
	int chem =sc.nextInt();
	System.out.println("Enter biology subject marks");
	int bio =sc.nextInt();
	
	double scoredmarks=math+phy+chem+bio;
	System.out.println("Enter total marks");
	int totalmarks =sc.nextInt();
	
	
	double res=((scoredmarks/totalmarks)*100);
	System.out.println(res);
	
}
}
