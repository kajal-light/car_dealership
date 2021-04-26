package com.kajal.cardealership;

public class Customer {

	private String name;
	private String address;
	private double cashOnHand;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

//Examples of customizing setter as per our own need
	public void setAddress(String address) {
		address += "NAGAR";
		this.address = address;
	}

	public void setCashOnHand(double cashOnHand) {
		cashOnHand += 500;
		this.cashOnHand = cashOnHand;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void purchase(Vehicle vehicle, Emplyoee emp, boolean fin) {
		emp.handleCustomer(this, fin, vehicle);

	}
}
