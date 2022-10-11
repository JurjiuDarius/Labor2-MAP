package controller;

import model.Customer;
import model.CustomerRepo;
import view.View;

public class Controller {

	private final View view;
	private final CustomerRepo repo;
	private final Customer customer;

	public Controller(Customer customer, View view, CustomerRepo repo) {
		this.customer = customer;
		this.view = view;
		this.repo = repo;
	}

	public void setId(Integer id) {
		customer.setId(id);
	}

	public void setBirthYear(Integer birthYear) {
		customer.setBirthYear(birthYear);
	}

	public void setName(String name) {
		customer.setName(name);
	}

	public void updateView() {
		view.displayCustomer(customer.getId(), customer.getBirthYear(), customer.getName());

	}

}
