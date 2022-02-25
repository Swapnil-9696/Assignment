import java.util.Scanner;

class Gcd
{

	public void m1(int a,int b)
	{
		while(a!=b)
		{
			if(a>b)
			a=a-b;
			else
			b=b-a;
				
		}
		System.out.println("GCD of two number is: "+a);
				
	}



	public static void main(String args[])
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("please enter first number");
	int a=s1.nextInt();
	System.out.println("please enter Second number");
	int b=s1.nextInt();
	Gcd obj= new Gcd();
	obj.m1(a,b);
	
	}

}