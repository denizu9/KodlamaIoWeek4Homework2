package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	CustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}
	@Override
	
	public void save(Customer customer) {
		
		if(_customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db : " + customer.firstName);
		}
		else
			System.out.println("Not a valid person");
	}

}
