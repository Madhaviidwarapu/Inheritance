package single;

import java.util.Scanner;

public class Armstrong {
 
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int num;
		int sum=0;
		int count=0;
		System.out.println("enter a number");
		num=sc.nextInt();
		int cnum=num;
		while(cnum>0)
		{
			int remainder=cnum%10;
			sum=(remainder*remainder*remainder)+sum;
			cnum=cnum/10;
			
		}
		
		if(sum==num)
			System.out.println( "enter number is armstrong  "  +num );
		else
		{
			System.out.println( "enter number is not armstrong  " +num );
		}
	}
}
