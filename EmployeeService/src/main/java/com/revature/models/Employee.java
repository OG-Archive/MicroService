package com.revature.models;

import java.util.List;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private List<Reinbursment> reinburents;
	
	public Employee() {
		super();
	}

	public Employee(int id, String firstName, String lastName, String username, String password,
			List<Reinbursment> reinburents) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.reinburents = reinburents;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Reinbursment> getReinburents() {
		return reinburents;
	}

	public void setReinburents(List<Reinbursment> reinburents) {
		this.reinburents = reinburents;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
				+ ", password=" + password + ", reinburents=" + reinburents + "]";
	}
	

}
