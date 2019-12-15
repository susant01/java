public class Class{

	int x=10,y;
	Class (){  //constructor

		this.x=100;
	}
	Class (int a){
		this.x=a;
	}
	Class (int a,int b){
		this.x=a;
		this.y=b;
	}
	public static void main(String[] args){
	Class hello=new Class();
	Class hello2=new Class(20,30);
	System.out.println(hello.x);
	System.out.println(hello2.x +" <= x y => "+ hello2.y);
	System.out.println(hello.x);
	System.out.println(hello2.y);
	}
}
