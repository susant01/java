import java.util.Scanner; 

public class Firts{
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		System.out.println("hello enter any string");
		String hel = inp.nextLine();
		String bel = inp.nextLine();
		int height = inp.nextInt();
		int breadth = inp.nextInt();
		double a = inp.nextDouble();
		double b = inp.nextDouble();
		String cel = hel + bel ;
		int area = height * breadth;
		double sum = a + b;
		
		System.out.println(cel);
		System.out.println(area);
		System.out.println(sum);

	}

}

