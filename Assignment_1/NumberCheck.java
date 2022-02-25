import java.util.Scanner;

class NumberCheck
{


	public void m1(int m)
	{
		if(m<0)
		System.out.println("given number is negative");
		else if(m>0)
		System.out.println("given number is positive");
		else
		System.out.println("given number is zero");
	}



	public static void main(String args[])
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("please enter the number");
	int a=s1.nextInt();
	NumberCheck obj= new NumberCheck();
	obj.m1(a);
	}

}