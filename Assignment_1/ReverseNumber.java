import java.util.Scanner;
import java.lang.Math;

class ReverseNumber
{


	public void m1(int a)
	{
		int temp=a;
		int rev=0;
		int n=0;
		while(a>0)
		{
			n++;
			a=a/10;
		}
		
		while(temp>0)
		{
			int b=temp%10;
			int c=(int)Math.pow(10,n-1);
			rev=rev+b*c;
			n--;
			temp=temp/10;
		}
		

		System.out.println("Reverse number is : "+rev);

				
	}



	public static void main(String args[])
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("please enter first number");
	int a=s1.nextInt();
	ReverseNumber obj= new ReverseNumber();
	obj.m1(a);
	
	}

}