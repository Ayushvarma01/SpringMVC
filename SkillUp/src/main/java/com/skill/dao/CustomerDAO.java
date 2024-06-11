package com.skill.dao;

import java.util.List;

import com.in.skill.model.Customer;

public interface CustomerDAO {

	public void addCustomer(Customer customer);

	public void updateCustomer(Customer customer);

	public List<Customer> getallCustomer(Customer customer);

	public Customer getCustomer(Long id);

	public void deleteCustomer(Long id);
}