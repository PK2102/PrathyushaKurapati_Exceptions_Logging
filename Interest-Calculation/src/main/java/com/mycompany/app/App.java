package com.mycompany.app;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;






/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
	public static void Main()
	{
		//PropertyConfigurator.configure("log4j.properties");
		Scanner scan = new Scanner(System.in);
		String principal,rate,time;
		logger.error("Enter the principal amount");
		principal = scan.next();
		logger.error("Enter the rate of interest");
		rate  = scan.next();
		logger.error("Enter the duration of time");
		time = scan.next();
		
		Functionalites ob = new Functionalites();
		
		float simple_interest=ob.simpleInterest(principal,rate,time);
		float compound_interest = ob.compoundInterset(principal,rate,time);
		if(simple_interest == 0 && compound_interest==1)
			logger.error("You entered wrong input");
		else {			
		logger.error("Simple Interest is: "+simple_interest);
		logger.error("Compound Interest is:"+compound_interest);
	}
	}
    public static void main( String[] args )
    {
        Main();
    }
}
