import java.util.Scanner;

class RecursiveFactorial
{


	static int m1(int m)
	{
		if(m==0)
		return 1;
		else return m*m1(m-1);
	}



	public static void main(String args[])
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("please enter the number");
	int a=s1.nextInt();
	System.out.println(m1(a));
	
	}

}