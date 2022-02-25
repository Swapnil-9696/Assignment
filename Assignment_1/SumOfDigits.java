import java.util.Scanner;

class SumOfDigits
{


	public void m1(int m)
	{
		int sum=0;
		while(m>0)
		{
			int dig=m%10;
			sum=sum+dig;
			m=m/10;
		}
		System.out.println(sum);
	}



	public static void main(String args[])
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("please enter the number");
	int a=s1.nextInt();
	SumOfDigits obj= new SumOfDigits();
	obj.m1(a);
	
	}

}