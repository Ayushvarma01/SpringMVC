package com.skill.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.in.skill.model.Customer;
import com.skill.dao.CustomerDAO;

@Component
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public void addCustomer(Customer customer) {
		hibernateTemplate.save(customer);

	}

	@Override
	public void updateCustomer(Customer customer) {
		hibernateTemplate.update(customer);

	}

	public List<Customer> getallCustomer(Customer customer) {
		return hibernateTemplate.loadAll(Customer.class);

	}

	public Customer getCustomer(Long id) {
		return hibernateTemplate.load(Customer.class, id);

	}

	public void deleteCustomer(Long id) {
		hibernateTemplate.delete(hibernateTemplate.load(Customer.class, id));

	}



}