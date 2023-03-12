/**
   Document: Hello World.
   Created on: Jul. 23, 2022, 1:19:37 a.m.
   Author: Engineer. Howard Fernando Del Angel Leija.
**/

package com.mycompany.helloworld;

import java.util.Scanner;

public class HelloWorld 
{
    public static void main(String[] args) 
    {
	    final byte MONTHS_IN_YEAR = 12;
	    final byte PERCENT = 100;
	    
	    int principal = 0;
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    while(true)
	    {
		System.err.println("Principal: ");
		int principal = scanner.nextInt();
		if(principal >= 1000 && principal <=1_000_000)
			break;
		    System.out.println("Enter a value between 1000 and 1000000");
	    }
	    
	    while (true)
	    {
		System.out.println("Annual Interest Rate: ");
		float annualInterest = scanner.nextFloat();
		if (annualInterest >=1 && annualInterest <= 30)
		{
			break;
		}
		float monthlyInterest = annualInterest / PERCENT / MONTHNS_IN_YEAR;
	    }
		    
	    System.out.println("Period (Years): ");
	    byte years = scanner.nextByte();
	    int numberOfPayments = years * MONTHS_IN_YEAR;
	    
	    double mortgage = principal
		    * ()
	}
}