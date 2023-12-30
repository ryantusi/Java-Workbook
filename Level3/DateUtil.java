// Interesting program to check the date's validity and returns the day of the date

import java.util.Scanner;

public class DateUtil {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Year: ");
		int yr=scan.nextInt();
		System.out.println("Enter Month: ");
		int mn=scan.nextInt();
		System.out.println("Enter Date: ");
		int dt=scan.nextInt();
		
		//Testing all methods
		if(isLeapYear(yr)) {
			System.out.println(yr +" is a Leap Year.");
		}else {
			System.out.println(yr + " is not a Leap Year.");
		}
		if(isValidDate(yr,mn,dt)) {
			System.out.println("Valid Date");
		}else {
			System.out.println("Invalid Date");
		}
		System.out.println(getDayOfWeek(yr,mn,dt));
		System.out.println(toString(yr,mn,dt));
	}
	
	public static boolean isLeapYear(int year) {
		boolean flag = false;
		if(year%4==0) {
			flag = true;
		}
		return flag;
	}
	
	public static boolean isValidDate(int year, int month, int date) {
		boolean flag = false;
		if(year>=1 || year<=9999) {
			switch(month) {
			case 1: 
				if(date>=1 && date<=31) {
					flag = true;
				}
				break;
			case 2:
				if(isLeapYear(year)) {
					if(date>=1 && date<=29) {
						flag = true;
					}
				}else {
					if(date>=1 && date<=28) {
						flag = true;
					}
				}
				break;
			case 3:
				if(date>=1 && date<=31) {
					flag = true;
				}
				break;
			case 4:
				if(date>=1 && date<=30) {
					flag = true;
				}
				break;
			case 5:
				if(date>=1 && date<=31) {
					flag = true;
				}
				break;
			case 6:
				if(date>=1 && date<=30) {
					flag = true;
				}
				break;
			case 7: 
				if(date>=1 && date<=31) {
					flag = true;
				}
				break;
			case 8:
				if(date>=1 && date<=31) {
					flag = true;
				}
				break;
			case 9:
				if(date>=1 && date<=30) {
					flag = true;
				}
				break;
			case 10:
				if(date>=1 && date<=31) {
					flag = true;
				}
				break;
			case 11:
				if(date>=1 && date<=30) {
					flag = true;
				}
				break;
			case 12:
				if(date>=1 && date<=31) {
					flag = true;
				}
				break;
			default:
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static String getDayOfWeek(int year, int month, int day) {
		String str;
		String[] arr = {"Sunday ", "Monday ", "Tuesday ", "Wednesday ", "Thursday ", "Friday ", "Saturday "};
		
		int ltd = year%100;
		
		int result = ltd + (ltd/4) + day;
		
		if((year>=1700 && year<1800) || (year>=2100 && year<2200)) {
			result += 4;
		}else if((year>=1800 && year<1900) || (year>=2200 && year<2300)) {
			result += 2;
		}else if((year>=1900 && year<2000) || (year>=2300 && year<2400)) {
			result += 0;
		}else if((year>=2000 && year<2100) || (year>=2400 && year<2500)) {
			result += 6;
		}
		
		
		switch(month) {
		case 1:
			if(isLeapYear(year)) {
				result += 6;
			}else {
				result += 0;
			}
			break;
		case 2:
			if(isLeapYear(year)) {
				result += 2;
			}else {
				result += 3;
			}
			break;
		case 3:
			result += 3;
			break;
		case 4:
			result += 6;
			break;
		case 5:
			result += 1;
			break;
		case 6:
			result += 4;
			break;
		case 7:
			result += 6;
			break;
		case 8:
			result += 2;
			break;
		case 9:
			result += 5;
			break;
		case 10:
			result += 0;
			break;
		case 11:
			result += 3;
			break;
		case 12:
			result += 5;
			break;
		}
		
		str = arr[result%7];
		return str;
	}
	
	public static String toString(int year, int month, int date) {
		String str = "";
		if(isValidDate(year,month,date)) {
			str = getDayOfWeek(year, month, date) + date + " ";
			switch(month) {
			case 1: 
				str += "January ";
				break;
			case 2:
				str += "Febraury ";
				break;
			case 3:
				str += "March ";
				break;
			case 4:
				str += "April ";
				break;
			case 5:
				str += "May ";
				break;
			case 6:
				str += "June ";
				break;
			case 7: 
				str += "July ";
				break;
			case 8:
				str += "August ";
				break;
			case 9:
				str += "September ";
				break;
			case 10:
				str += "October ";
				break;
			case 11:
				str += "November ";
				break;
			case 12:
				str += "December ";
				break;
			}
			
			str += year;
		}else {
			str = "Invalid date";
		}
		return str;
	}
}
