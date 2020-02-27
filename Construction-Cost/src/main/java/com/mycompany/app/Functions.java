package com.mycompany.app;

public class Functions {
	float total_area;
	public void check(String str)
	{
		try
		{
			total_area = Float.parseFloat(str);
		}catch(Exception e)
		{
			
		}
	}
	public float constructioncost(int cost,String total_area_1)
	{
		check(total_area_1);
		return cost*total_area;
	}
}
