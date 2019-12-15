import java.util.Scanner;
public class BankSystem{
	static Scanner inp = new Scanner(System.in);
	static String bank_name = "Rajesh dai ko bank";
	static String bank_addr="";
	String cust_id;
	double tamount;
//	String address;
//	double contactNo;
//	double ammount;
	double accNo;
//	double pinCode;
	BankSystem(){
		this.tamount=0;
		this.cust_id=" ";
		this.accNo=0;

	}
	BankSystem(String cust,double acc){
		this.cust_id=cust;
		this.accNo=acc;

	}

	static void welcomToAll(){
		System.out.println("Welcome to " + bank_name);
		System.out.println("sathi ko lagi haat salam, dushman ko lagi haat falam");
	}


	void Account(double accno){

	void Opening(double acc){
		System.out.println("hello");
		this.accNo=acc;
		double hello=this.accNo;
		System.out.println("Congtarulation your new account number is : "  + hello);
	}
	void deposit(double amount )
	{
		this.tamount+=amount;
	}
	void widraw(double ammount){
		this.tamount-=ammount;
		if (ammount>this.tamount){
			System.out.println("Sorry, you dont have sufficient amount to widraw");
	
		}
	}
	void total(){
		System.out.println("your total balance is : " + this.tamount);
	}
	}


public static void  main(String[] args){

	char x='a';
	BankSystem ram = new BankSystem();
	double amount=0;
	while ( x != 'q'){
	welcomToAll();

		System.out.println("enter o for opening account\nd for deposit\nw for widrawl\nt for total\nenter q for quite");
		x=inp.next().charAt(0);
		if (x=='o'){
			ram.Opening(123414);
		}
		else if (x=='d'){
			amount=inp.nextDouble();
			ram.deposit(amount);
		}
		else if (x=='w'){
			amount=inp.nextDouble();
			ram.widraw(amount);
		}
		else if (x=='t'){
			ram.total();
		}
	}
}

}

