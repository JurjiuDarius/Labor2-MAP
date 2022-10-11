import controller.Controller;
import model.Customer;
import model.CustomerRepo;
import view.View;

public class Main {

	public static void main(String[] args) {

		Customer model = new Customer(1, 2000, "Cristi");
		View view = new View();
		CustomerRepo repo = new CustomerRepo();
		Controller controller = new Controller(model, view, repo);
		controller.updateView();
		controller.setName("Marcel");
		controller.updateView();
	}

}