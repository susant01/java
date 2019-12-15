import java.util.*;
public class TaxSystem{
	public static void main(String[] args){
	
		Scanner inp = new Scanner(System.in);
		System.out.println("please enter your salary");
		double salary= inp.nextDouble();
		System.out.println ("please select your status 1 for single 2 for married and 3 for divorced");
		double tax=0;
		int status = inp.nextInt();
		
		if (status == 1){
			if (salary <=350000){

			tax = salary * 0.01;
			}
			else if (salary <= 450000){
				tax = 3500 + (salary-350000)*0.1;
			}
			else if ( salary <=650000){
				tax = 3500 + 10000 + (salary - 45000)* 0.2;
			}
			else if ( salary <= 2000000 ) {
				tax = 3500 + 10000 + 40000 + ( salary - 650000) *0.3;
			}
			else 
				tax = 3500 + 10000 + 40000 + 405000 + ( salary - 2000000) * 0.36;
		}
		
		else if (status == 2){
			if (salary <=400000){

			tax = salary * 0.01;
			}
			else if (salary <= 500000){
				tax = 4000 + (salary-400000)*0.1;
			}
			else if ( salary <=700000){
				tax = 4000 + 10000 + (salary - 500000)* 0.2;
			}
			else if ( salary <= 2000000 ) {
				tax = 4000 + 10000 + 40000 + ( salary - 700000) *0.3;
			}
			else 
				tax = 4000.0 + 10000.0 + 40000.0 + 390000 + ( salary - 2000000) * 0.36;
		}
		System.out.println("your salary before tax is " + salary );
		System.out.println("your applicable tax is " + tax );
		double total = salary - tax ;
		System.out.println ("your total salary after tax is " + total );
//#else if ( status == 2 )
//		{
//
//		}
//

	}

}
