package scanner;

import java.util.Scanner;

public class noofDaysInMonth03 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter month ");
	int  month=sc.nextInt();

	switch(month)
	{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		System.out.println("Number of Days 31..");
		break;
		case 4:
		case 6:
		case 9:
		case 11:
		System.out.println("Number of Days 30..");
		break;
		case 2:
		System.out.println("Number of Days 28..");
		break;
		default:
			System.out.println("Invalid...Please Enter from 1 to 12...");
			break;
	}
	
//	switch (month) {
//	case "Jan":System.out.println("31 days");
//	break;
//	case "Feb":System.out.println("30 days");
//	break;
//	case "March":System.out.println("31 days");
//	break;
//	case "April":System.out.println("30 days");
//	break;
//	case "May":System.out.println("31 days");
//	break;
//	case "June":System.out.println("30 days");
//	break;
//	case "July":System.out.println("31 days");
//	break;
//	case "Aug":System.out.println("31 days");
//	break;
//	case "Sept":System.out.println("30 days");
//	break;
//	case "Oct":System.out.println("31 days");
//	break;
//	case "Nov":System.out.println("30 days");
//	break;
//	case "Dec":System.out.println("31 days");
//	break;
//	}
}
}
