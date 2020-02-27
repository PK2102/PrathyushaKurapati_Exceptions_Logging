package com.mycompany.app;

public class Functionalites {
	float principal,rate,time;
	public void check(String principal1,String rate1,String time1 )
	{
		try
		{
			principal = Float.parseFloat(principal1);
			rate  = Float.parseFloat(rate1);
			time = Float.parseFloat(time1);
			
		}catch(Exception e)
		{
			
		}
	}
	public float simpleInterest(String principal1,String rate1,String time1)
	{
		check(principal1,rate1,time1);
		return principal*rate*time;
	}
	public float compoundInterset(String principal1,String rate1,String time1)
	{
		check(principal1,rate1,time1);
		return (int) Math.pow((principal*(1+(rate/100))),time);
	}

}
