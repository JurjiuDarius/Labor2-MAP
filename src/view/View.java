package view;

import java.util.Scanner;

public class View {

	String menu = "1.All customers\n2.Get by id\n3.Delete by id";

	public void displayCustomer(Integer id, Integer birthYear, String name) {
		System.out.println("Id: " + id.toString());
		System.out.println("Birth Year: " + birthYear.toString());
		System.out.println("Name: " + name + "\n");

	}

	public Integer displayOptions() {
		System.out.println(menu);
		Scanner sc = new Scanner(System.in);
		Integer x = sc.nextInt();
		return x;
	}

}
