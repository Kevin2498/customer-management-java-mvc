package com.tcs.ilp.bean;

public class Customer 
{
	private int customerId;
	private String customerName;
	private int age;
	private String Country;
	private String address;
	private String gender;
	private String areasOfInterest;
	
	public int getCustomerId()
	{
		return customerId;
	}
	public void setCustomerId(int customerId)
	{
		this.customerId=customerId;
	}
	
	public String getCustomerName()
	{
		return customerName;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName=customerName;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public String getCountry()
	{
		return Country;
	}
	public void setCountry(String country)
	{
		this.Country=country;
	}
	
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	
	public String getAreasOfInterest()
	{
		return areasOfInterest;
	}
	public void setAreasOfInterest(String areasOfInterest)
	{
		this.areasOfInterest=areasOfInterest;
	}
}
