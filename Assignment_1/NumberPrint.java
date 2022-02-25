
class NumberPrint
{


	public static int m1(int m)
	{
		if(m<11)
		{
			System.out.println(m);
			m1(m+1);
			return m;
		}
		else
		{
			System.out.println("Table completed");
			return 0;
		}	
		
	}



	public static void main(String args[])
	{
	int a=1;
	m1(a);
	}

}