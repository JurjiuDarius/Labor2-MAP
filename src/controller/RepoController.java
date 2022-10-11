package controller;

import model.Customer;
import model.CustomerRepo;
import view.View;

import java.util.ArrayList;
import java.util.Scanner;

public class RepoController {

	private final View view;
	private final CustomerRepo repo;

	public RepoController(View view, CustomerRepo repo) {
		this.view = view;
		this.repo = repo;
	}

	public void addCustomer(Customer customer) {
		repo.addCustomer(customer);
	}

	public ArrayList<Customer> getAllCustomers() {
		return repo.allCustomers();
	}

	public Customer getCustomerById(Integer id) {
		return repo.getCustomerById(id);
	}

	public void deleteCustomerById(Integer id) {
		repo.deleteCustomerById(id);
	}

	public void updateCustomer(Customer customer) {
		repo.updateCustomer(customer);
	}

	public void runCommand(Integer commandId) {
		switch (commandId) {
			case 1: {
				for (Customer customer : getAllCustomers()) {
					view.displayCustomer(customer.getId(), customer.getBirthYear(), customer.getName());
				}
			}
			case 2: {
				Scanner sc = new Scanner(System.in);
				Integer id = sc.nextInt();
				repo.deleteCustomerById(id);
			}
			case 3: {
				Scanner sc = new Scanner(System.in);
				Integer id = sc.nextInt();
				Customer customer = repo.getCustomerById(id);
				view.displayCustomer(customer.getId(), customer.getBirthYear(), customer.getName());
			}
		}
	}

}
