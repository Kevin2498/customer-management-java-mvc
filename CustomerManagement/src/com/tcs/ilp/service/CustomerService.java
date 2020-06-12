package com.tcs.ilp.service;

import com.tcs.ilp.bean.Customer;
import com.tcs.ilp.dao.CustomerDAO;
import com.tcs.ilp.dao.CustomerDAOImpl;

public class CustomerService 
{
	public int createCustomer(Customer customer) throws Exception
	{
		CustomerDAO customerdao = new CustomerDAOImpl();
		return customerdao.addCustomerDetails(customer);
	}

}
