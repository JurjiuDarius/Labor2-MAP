package model;

public class Customer {

	private int id;
	private int birthYear;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer(int id, int birthYear, String name) {
		this.id = id;
		this.birthYear = birthYear;
		this.name = name;
	}

}
