import java.util.*;
public class Hcf{
	public static void main(String[] args){
	Scanner inp = new Scanner(System.in);
	System.out.println("enter first number");
	int first = inp.nextInt();
	System.out.println("enter second number");
	int second = inp.nextInt();
	int hcf=1;
	for (int i=1;i<=first && i <= second;i++){
	if (first%i==0 && second%i==0)
	{	hcf=i;
	//	System.out.println(i);	
	}
	}
	System.out.println("hcf = " + hcf);
	}
}
