import java.util.Scanner;

class SumOfTwo
{


	public void m1(int a,int b)
	{
		while(b>0)
		{
			a=a+1;
			b--;
		}
		System.out.println("sum of two number is: "+a);
				
	}



	public static void main(String args[])
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("please enter first number");
	int a=s1.nextInt();
	System.out.println("please enter Second number");
	int b=s1.nextInt();
	SumOfTwo obj= new SumOfTwo();
	obj.m1(a,b);
	
	}

}