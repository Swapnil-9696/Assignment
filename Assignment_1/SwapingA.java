import java.util.Scanner;

class SwapingA
{


	public void m1(int m,int n)
	{
		m=m+n;
		n=m-n;
		m=m-n;
		
		
		System.out.println(m);
		System.out.println(n);
	}



	public static void main(String args[])
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("please enter the number");
	int a=s1.nextInt();
	int b=s1.nextInt();
	SwapingA ob1 = new SwapingA();
	ob1.m1(a,b);
	}

}