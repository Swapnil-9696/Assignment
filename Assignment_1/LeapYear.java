import java.util.Scanner;

class LeapYear
{


	public void m1(int m)
	{
		if(m%100==0)
			{
			if(m%400==0)
				System.out.println("this is a leap year");
			else
				System.out.println("this is not a leap year");
			}
		else
			{
			if(m%4==0)
				System.out.println("this is a leap year");
			else
				System.out.println("this is not a leap year");
			}
		
	}



	public static void main(String args[])
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("please enter the number");
	int a=s1.nextInt();
	LeapYear obj= new LeapYear();
	obj.m1(a);

	}
	

}