package session2.assignment4;

import java.util.Scanner;

public class TotalDaysInMonth {
//	enum Months{Jan, Feb, Mar, Apr, May, Jun,Jul, Aug, Sep, Oct, Nov, Dec}
	public static void main(String[] args) {
//		Months m;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the month from 1 to 12:");
		int m=sc.nextInt();
		switch(m){
		case 1: 
			System.out.println("Number of days in January are 31");
			break;
		case 2:
			System.out.println("Number of days in February are either 28 or 29");
			break;
		case 3:
			System.out.println("Number of days in March are 31");
			break;
		case 4:
			System.out.println("Number of days in April are 30");
			break;
		case 5:
			System.out.println("Number of days in May are 31");
			break;
		case 6:
			System.out.println("Number of days in June are 30");
			break;
		case 7:
			System.out.println("Number of days in July are 31");
			break;
		case 8:
			System.out.println("Number of days in August are 31");
			break;
		case 9:
			System.out.println("Number of days in September are 30");
			break;
		case 10:
			System.out.println("Number of days in October are 31");
			break;
		case 11:
			System.out.println("Number of days in November are 30");
			break;
		case 12:
			System.out.println("Number of days in December are 31");
			break;
		default:
			System.out.println("??? Enter valid month");
				
		
		}
		
		
	}

}
