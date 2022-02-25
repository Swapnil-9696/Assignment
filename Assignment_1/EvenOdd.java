import java.util.Scanner;

class EvenOdd
{


	public void m1(int n)
	{
		int ans=n%2;
		if(ans==0)
		System.out.println("given number is even");
		else
		System.out.println("given number is odd");
	}



	public static void main(String args[])
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("please enter the number");
	int num=s1.nextInt();
	EvenOdd ob1 = new EvenOdd();
	ob1.m1(num);
	}

}