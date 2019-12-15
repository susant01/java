import java.util.Scanner;
public class Prime2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count=0;
		int z;
		for (int j = 1 ;j<=100;j++)
		{
		for( int i =2 ; i<=j;i++){
			z = j%i;	
			if ( z == 0){
				count = 1;
				System.out.println(j);
				break;
			}
		}
//			if (count==1)
//				System.out.print("\t"+j+"\t" );
	}
	}
}

