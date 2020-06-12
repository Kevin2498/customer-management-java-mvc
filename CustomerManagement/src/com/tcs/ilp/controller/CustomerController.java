package com.tcs.ilp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tcs.ilp.bean.Customer;
import com.tcs.ilp.service.CustomerService;

public class CustomerController extends HttpServlet
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try 
		{
			String interest="";
			Customer customer = new Customer();
			CustomerService customerService = new CustomerService();
			
			//reads all content from request object
			String customerName = request.getParameter("Name");
			String age = request.getParameter("Age");
			String country = request.getParameter("Country");
			String address = request.getParameter("Address");
			String gender = request.getParameter("Gender");
			String[] areaOfInterest = request.getParameterValues("areaOfInterest");
			for(int i=0;i<areaOfInterest.length;i++)
			{
				if(i != areaOfInterest.length-1)
				{
					interest = interest + areaOfInterest[i] + ", ";
				}
				else
				{
					interest = interest + areaOfInterest[i]; //to exclude comma from last entry
				}
			}
			
			//forms bean object with the request object
			customer.setCustomerName(customerName);
			customer.setAge(Integer.parseInt(age));
			customer.setCountry(country);
			customer.setAddress(address);
			customer.setGender(gender);
			customer.setAreasOfInterest(interest);
			
			//invoking customer service method
			int custId = customerService.createCustomer(customer);
			
			//PrintWriter to send the response back to the user as generated customerId
			PrintWriter out = response.getWriter();
			out.println("The generated Customer ID is = "+custId);
		}
		catch(Exception exe)
		{
			exe.printStackTrace();
		}
	}

}
