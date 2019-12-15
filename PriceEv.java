import java.util.Scanner;
public class PriceEv{
	public static void main(String[] args){
	Scanner inp= new Scanner (System.in);
	System.out.println("ener price for product in ruppee");
	double price1= inp.nextDouble();
	System.out.println("enter weight for product in kg");
	double weight1 = inp.nextDouble();
	System.out.println("enter price for second product in ruppee");
	double price2=inp.nextDouble();
	System.out.println("enter weight for second product in kg");
	double weight2=inp.nextDouble();
	double eval1= price1 / weight1;
	double eval2 = price2 / weight2;
	if (eval1<eval2){
		System.out.println("product 1 is more cheaper than product 2 per kg");

	}
	else if (eval1==eval2){
		System.out.println("both product are equal");
	}
	else if (eval2<eval1){
		System.out.println("product 2 is more cheaper tha prodct 1 per kg");
	}
	

	}
}
