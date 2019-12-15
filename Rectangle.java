import java.util.Scanner;

public class Rectangle{
	double x,y,area;
	Rectangle(){
	this.x=0;
	this.y=0;
	this.area=0*0;
	}

	Rectangle(double a){
	this.x=a;
	this.y=a;
	this.area=a*a;
	}
	Rectangle(double a, double b){
		this.x=a;
		this.y=b;
		this.area=a*b;
	}

	public static void main(String[] args){

Scanner inp= new Scanner(System.in);
double length=inp.nextDouble();
double breadth=inp.nextDouble();
Rectangle no=new Rectangle();
Rectangle sqr=new Rectangle(length);
Rectangle rect=new Rectangle(length,breadth);
System.out.println(no.area);
System.out.println(sqr.area);
System.out.println(rect.area);




	}

}
