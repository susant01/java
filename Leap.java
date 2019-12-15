import java.util.*;
public class Leap{
	public static void main(String[] args){
	Scanner inp = new Scanner(System.in);
	System.out.println("enter a year to check wheather leap year or not");
	int year = inp.nextInt();
	if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
		System.out.println("year " + year +" is leap year");
	else
		System.out.println("year " +year +" is not a leap year");
	}
}
