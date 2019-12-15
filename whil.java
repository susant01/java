import java.util.Scanner;
public class whil{
	public static void main (String[] args){
		int a=0;
		int sum=0;
		int b=0;
		int sub=0;
		Scanner input = new Scanner(System.in);
		int num;
		while (a<5){
			num = input.nextInt();
			sum += num;
			a++;
		}
		System.out.println (sum);

		do{
			num= input.nextInt();
			sub -=num;
			b++;

		} while (b<5);
		System.out.println (sub);
	}
}


