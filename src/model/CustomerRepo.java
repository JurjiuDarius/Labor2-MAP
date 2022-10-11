package model;

import java.util.ArrayList;

public class CustomerRepo {

	private ArrayList<Customer> customers;

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public void deleteCustomerById(Integer id) {
		for (Customer customer : customers) {
			if (customer.getId() == id) {
				customers.remove(customer);
			}
		}
	}

	public ArrayList<Customer> allCustomers() {
		return customers;
	}

	public Customer getCustomerById(Integer id) {
		for (Customer customer : customers) {
			if (customer.getId() == id) {
				return customer;
			}
		}
		return null;
	}

	public Customer updateCustomer(Customer customer) {
		for (Customer customerIter : customers) {
			if (customer.getId() == customer.getId()) {
				return customer;
			}
		}
		return null;
	}

}
