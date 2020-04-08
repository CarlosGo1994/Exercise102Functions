package com.exercise102fuctions.app;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Variables declaration
		long factorial= 1;
		int number=-1;
		
		Scanner input= new Scanner (System.in);
		
		do
		{
			System.out.println("Number to calculate factorial:");
			number=input.nextInt();
			if (number<=0)
			{
				System.out.println("You must inut a positive value");
			}
			
		}while(number<=0);
		
		factorial = GiveFactorial(number);
		System.out.println("the factorial of "+ number +" is :"+factorial+"\nwhich is gotten by "
				+ "multiplying several times "+ number);
	}
	
	public static long GiveFactorial(int number)
	{
		int factorial =1;
		for(int i=1;i<=number;i++)
		{
			factorial=factorial*i;
		}
		return factorial;
	}

	

}
