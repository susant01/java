import java.util.Scanner;
public class ArraySum{

	public static void main(String[] args){
		Scanner inp=new Scanner(System.in);
		System.out.println("enter 5 different value in array");
		int[] ar=new int[5];
		int sum=0;
		for(int i=0;i<5;i++){
			ar[i]=inp.nextInt();
			sum =sum+ar[i];
		}
		System.out.println("sum of entered array value are : " + sum);

	}
}
