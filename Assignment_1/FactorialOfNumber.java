import java.util.Scanner;

class FactorialOfNumber
{


	public void m1(int n)
	{
		int a=1;
		while(n>0)
		{
			
			a=a*n;
			n--;
		}
		
		System.out.println("factorial of given number is");
		System.out.println(a);
	}



	public static void main(String args[])
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("please enter the number");
	int num=s1.nextInt();
	FactorialOfNumber ob1 = new FactorialOfNumber();
	ob1.m1(num);
	}

}