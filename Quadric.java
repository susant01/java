import java.util.Scanner;
public class Quadric{

	public static void main(String[] args){
	double root1=0;
	double root2=0;
	Scanner inp = new Scanner(System.in);
	System.out.println("enter value of a : ");
	double a = inp.nextDouble();
	System.out.println("enter value of b : ");
	double b = inp.nextDouble();
	System.out.println("enter value of c : ");
	double c = inp.nextDouble();
	double determinant = (b*b)-(4*a*c);
	double sqr= Math.sqrt(determinant);
	if (determinant>0){
		root1=(-b+sqr)/(2*a);
		root2=(-b-sqr)/(2*a);
		System.out.println("Roots are : " + root1 + " second root : " + root2);
	}
	else if(determinant == 0){
		System.out.println("Roots if : " + (-b + sqr)/(2*a));
	}

	}
}
