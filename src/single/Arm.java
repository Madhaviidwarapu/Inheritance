package single;

import java.util.Scanner;

public class Arm {
	public static void main(String[] args) {
		int sum = 0;
	      // creating instance of Scanner class
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number to check Armstrong number: ");
	      // to take input number
	      int num = sc.nextInt();
	      // copying the input to variable named copy
	      int copy = num;
	      // converting integer to string
	      String n = Integer.toString(num);
	      // storing the length of converted string
	      int len = n.length();
	      // loop to check armstrong number
	      while(num != 0) {
	         int rem = num % 10;
	         int mul = 1;
	         for(int i = 1; i <= len; i++) {
	            mul = mul*rem;
	         }
	         sum =sum+ mul;
	         num = num/10;
	      }
	      // to print the result
	      if(sum == copy) {
	         System.out.println(copy + " is an Armstrong number");
	      } else {
	         System.out.println(copy + " is not an Armstrong number");
	      }
	   }
	}