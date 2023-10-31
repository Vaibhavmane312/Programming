package scanner;

import java.util.Scanner;

public class scanner {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter valid digit");
	int num=sc.nextInt();
	System.out.println(num);
	
	System.out.println("Enter double value");
	double value=sc.nextDouble();
	System.out.println(value);
	
	System.out.println("Enter valid char");
	char chara=sc.next().charAt(0);         
	System.out.println(chara);
	
	System.out.println("Enter on value");
	boolean cond=sc.nextBoolean();
	System.out.println(cond);
	
	System.out.println("Enter valid names");
	String names=sc.next();                  // to take single word from input
	                                         // if user enters two words 
	                                         // it will takes single word itself
	System.out.println(names);
	
	System.out.println("Enter valid name");
	String name=sc.nextLine();              // to take multiple words from input
	System.out.println(name);               // user can enter more than one word
	
	
}
}
