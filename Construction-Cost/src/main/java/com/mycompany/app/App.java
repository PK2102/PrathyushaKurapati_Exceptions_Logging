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
		Scanner scan = new Scanner(System.in);
		//PropertyConfigurator.configure("log4j.properties");
		logger.error("Enter the material standard you want");
		logger.error("1.Standard material");
		logger.error("2.Above standard material");
		logger.error("3.High standard");
		logger.error("4. High standard Automation Home");
		logger.error("Enter your choice");
		String choice;
		choice =  scan.next();
		int user_choice;
		logger.error("Enter the total area of the home");
		String total_area = scan.next();
		float total_cost  = 0.0f;
		Functions object1 = new Functions();
		try
		{
			user_choice = Integer.parseInt(choice);
		}catch(Exception e)
		{
			user_choice = 0;
		}
		
		
		switch(user_choice)
		{
		case 1:
			total_cost  = object1.constructioncost(1200, total_area);
			break;
		case 2:
			total_cost  = object1.constructioncost(1500, total_area);
			break;
		case 3:			
			total_cost = object1.constructioncost(1800, total_area);			
			break;
		case 4:
			total_cost = object1.constructioncost(2500, total_area);
			break;
		default:
			logger.error("The choice you made is currently not available");
			break;
			
				
		}
		if (total_cost ==0)
			logger.error("You entered wrong input");
		else
			logger.error("The total construction cost is "+total_cost);
		
		
	}
    public static void main( String[] args )
    {
        Main();
    }
}
