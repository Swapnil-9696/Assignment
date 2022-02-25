import java.util.Scanner;

class Lcm
{

	public void m1(int a,int b)
	{
		int temp=0;
		int i=0;
		if(a>b)
			temp=a;
		else
			temp=b;
		for(i=temp;i<=a*b;i=i+temp)
		{
			if(i % a == 0 && i % b == 0)  
			break;  
		}
		System.out.println("LCM of two number is: "+i);
				
	}



	public static void main(String args[])
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("please enter first number");
	int a=s1.nextInt();
	System.out.println("please enter Second number");
	int b=s1.nextInt();
	Lcm obj= new Lcm();
	obj.m1(a,b);
	
	}

}