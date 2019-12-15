public class Person{

	String name;
	int id;
	int phone;
	String address;

	Person(){
	this.name="-";
	this.id=0;
	this.phone=0;
	this.address="-";

	}

	Person(String a,int b, int c, String d)
	{
		this.name=a;
		this.id=b;
		this.phone=c;
		this.address=d;
	}

	public static void main(String[] args){

		Person sandesh = new Person("sandesh aanjakhya",0,9843212,"bhaktapur");
	
		Person susant = new Person("susant shrestha",1,9876123,"bhaktapur");
		Person ujen = new Person ("ujen kurunju",2,123457,"bhaktapur");
		System.out.println(sandesh.name);
		System.out.println(susant.name);
		System.out.println(ujen.name);

	}
}
