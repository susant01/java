import java.util.Scanner;

public class Random{
public static void main(String[] args){
	int ln= (int) (Math.random()*100);
//	int ln = 55;
	Scanner hhh = new Scanner (System.in);
	int un = hhh.nextInt();
	int fln=ln/10;
	int lln=ln%10;
	int fun=un/10;
	int lun=un%10;
	if ( ln == un)
	{
		System.out.println("Congratulation you own");
	}
	else if ( fln == lun && lln == fun)
	{
		System.out.println("you won by 50%");
	}
	else if (fln == fun || fln ==lun || lln == fun || lln == lun )
		System.out.println("you won by 25 %");
	else
		System.out.println("you loose try again");
		System.out.println("lottery number" + ln);
}

}
