package com.mmk.spring_rest_ackson;

import java.util.Arrays;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private boolean active;
	private String[] languages;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private Address address;

	public Student() {
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	@Override
	public String toString() {
		return getClass().getName() + " {\n\tid: " + id + "\n\tfirstName: " + firstName + "\n\tlastName: " + lastName
				+ "\n\tactive: " + active + "\n\tlanguages: " + Arrays.toString(languages) + "\n\taddress: " + address
				+ "\n}";
	}
}
