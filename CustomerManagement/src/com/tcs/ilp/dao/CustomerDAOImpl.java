package com.tcs.ilp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tcs.ilp.bean.Customer;
import com.tcs.ilp.util.DBConnection;

public class CustomerDAOImpl implements CustomerDAO
{
	private Connection connection = null;
	private PreparedStatement ps1 = null;
	private PreparedStatement ps2 = null;
	private ResultSet rs = null;
	
	@Override
	public int addCustomerDetails(Customer customer) throws Exception
	{
		int custId = 0;
		connection = DBConnection.getConnection();
		
		//insert the details using bean object and prepared statement
		ps1 = connection.prepareStatement("insert into customer_920525 values(customer_sequence_920525.nextval,?,?,?,?,?,?)");
		ps1.setString(1, customer.getCustomerName());
		ps1.setInt(2, customer.getAge());
		ps1.setString(3, customer.getCountry());
		ps1.setString(4, customer.getAddress());
		ps1.setString(5, customer.getGender());
		ps1.setString(6, customer.getAreasOfInterest());
		ps1.executeUpdate();
		
		//retrieves the generated customerID from dual
		ps2 = connection.prepareStatement("select customer_sequence_920525.currval from dual");
		rs = ps2.executeQuery();
		
		while(rs.next())
		{
			custId = rs.getInt(1);
		}
		
		return custId;
	}

}
