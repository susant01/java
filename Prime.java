import java.util.Scanner;
public class Prime{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count=0;
		int z;
		for( int i =2 ; i<=(num/2);i++){
			z = num%i;	
			if ( z == 0){
				count = 1;
		//		System.out.println(i);
				break;
			}
		}
			if (count==1)
				System.out.println("not a prime number");
			else 
				System.out.println("prime number");
	}
}

