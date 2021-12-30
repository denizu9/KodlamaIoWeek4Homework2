package coffeeProject;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adapters.MernisCheckService;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "Name", "Surname", 1990, 54689347896L);
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisCheckService());
		customerManager.save(customer);

	}

}
