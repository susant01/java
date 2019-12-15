import java.util.Scanner;
public class Arraydel{

	public static void main(String[] args){
	Scanner inp=new Scanner(System.in);
	System.out.println("enter  size of an array");
	int size=inp.nextInt();
	int[] ar=new int[size];
	System.out.println("enter value");
	int p=1;
	while (p!=0)
	{

	System.out.println("1 for insert value \n2 for delete\n3 insert value \n4 for display\n0 for exit");	
	p=inp.nextInt();
	if(p==1){
	for(int i=0;i<size;i++){
	ar[i]=inp.nextInt();
	
	
	}
	}
	else if(p==2){
	System.out.println("enter index to delete value");
	int index=inp.nextInt();
	for(int j=index;j<size-1;j++){
		ar[j]=ar[j+1];
	}
	size=size-1;
	}
	else if(p==3){
	int ins=inp.nextInt();
	
	for (int i=size+1;i<ins;i++){
	
	}
	}

	else if (p==4){
	for(int i=0;i<size;i++){
	System.out.println(ar[i]);
	}
	}
	
	else
		System.out.println("please enter valid number");
	}
	}
}
