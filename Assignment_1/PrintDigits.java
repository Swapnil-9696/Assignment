import java.util.Scanner;

class PrintDigits
{


	public static int m1(int m)
	{
		if(m==0)
			return 0;
		else
		{
			int dig = m%10;
			m=m/10;
			m1(m);
			System.out.println(dig);
			return dig;
		}
	}



	public static void main(String args[])
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("please enter the number");
	int a=s1.nextInt();
	m1(a);
	}

}