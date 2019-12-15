import java.util.*;
public class Divisible{
	public static void main(String[] args){
	Scanner inp = new Scanner(System.in);
	System.out.println("enter a number to check");
	int inpp = inp.nextInt();
	if ( inpp%5==0 && inpp%7==0)
		System.out.println("number is divisible by 5 and 7");
	else if(inpp % 7 == 0)
		System.out.println(" number is divisible by 7");
	else if(inpp%5==0)
		System.out.println("divisible by 5");
	else
		System.out.println("not divisible by 5 or 7 or both");
	}
}
