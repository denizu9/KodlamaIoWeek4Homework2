package Entities;

import Abstract.Entity;

public class Customer implements Entity{
	public Customer(int id,String firstName,String lastName,int dateOfBirth,long string) {
		this.id = id;
		this.firstName =firstName;
		this.lastName =lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = string;
	}
	public int id;
	public String firstName;
	public String lastName;
	public int dateOfBirth;
	public long nationalityId;
}
