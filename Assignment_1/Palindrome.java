package javafx.application;
import java.util.Scanner;



public class Application {
	public static void main(String[] args) {
		
		int r,temp;
		int sum = 0;
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		temp = n;
		while(n>0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n/10;
			
		}
		
		if(temp == sum)
			System.out.println("number is palindrome");
		
		
		else
			System.out.println("number is not palindrome");


}
}