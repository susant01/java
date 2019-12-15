import java.util.Scanner;
public class MyFunc{
	static Scanner inp = new Scanner(System.in);
	
	static int multiply(int x , int y){
	int multiply= x * y;
	return multiply;
	}
	static void hello(){
	String name = inp.nextLine();
	String address = inp.nextLine();
	int mobile= inp.nextInt();
	System.out.println("name = " + name + " address = " + address + " mobile number is  " + mobile);

	}

	public static void main (String[] args){
	
//		Scanner inp = new Scanner(System.in);
		int x;
		System.out.println("enter first number");
		x = inp.nextInt();
		int y;
		System.out.println("enter second number");
		y = inp.nextInt();
		int multi=multiply(x,y);
		System.out.println(multi);
		hello();
	//	int i;
	//	for (i=0;i<10;i++){
		
//		}

	}

}
