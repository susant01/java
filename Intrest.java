import java.util.Scanner;
public class Intrest{

double time;
double rate;
double principal;

Intrest(){
	this.time=0.0;
	this.rate=0.0;
	this.principal=0.0;

}
Intrest(double a, double b, double c){
	this.time=a;
	this.rate=b;
	this.principal=c;

}

	public static void main(String[] args){
		Scanner inp= new Scanner(System.in);
		System.out.println("Enter rate");
		double rate=inp.nextDouble();
		System.out.println("Enter time");
		double time=inp.nextDouble();
		System.out.println("Enter principal");
		double principal=inp.nextDouble();


		Intrest susant= new Intrest(time,rate,principal);

		double intrest=(susant.time*susant.rate*susant.principal)/100;

		System.out.println("intrest of given time rate and principal is : " + intrest);


	}
}
