import java.util.Scanner;
public class Grades {

 public static void main(String[] args) {
	 Scanner inp=new Scanner(System.in);
	double x[]=new double[20];
	double y[]=new double[20];
	double z[]=new double[20];
	double sum=0,gradeTotal=0,cgpa=0;
	System.out.println("number of subject grade ?");
	int a=inp.nextInt();
	System.out.println("enter grade obitain");

	for (int i=0;i<a;i++){
	x[i]=inp.nextDouble();

	}

	System.out.println("enter subject credit");
	for (int i=0;i<a;i++){
	y[i]=inp.nextDouble();
	z[i]=y[i]*x[i];
	sum = sum+y[i];
	gradeTotal+=z[i];
	}
	cgpa=gradeTotal/sum;
	System.out.println("CGPA = "+ cgpa);
 
 }

}

