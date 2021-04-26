package com.kajal.cardealership;

public class Emplyoee {

	public void handleCustomer(Customer cust, boolean fin, Vehicle vehicle) {

		if (fin == true) {

			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);

		} else if (vehicle.getPrice() <= cust.getCashOnHand()) {

			// customer pay in cash
			processTransancation(cust, vehicle);
		} else {

			System.out.println("cust need more money");
		}

	}

	public void runCreditHistory(Customer cust, double loanAmount) {
//Dummy method to check for credit
		System.out.println("Run credit history");
		System.out.println("Customer has ben approved to purchase the vehicle");
	}

	public void processTransancation(Customer cust, Vehicle vehicle) {
//Dummy method to process transaction
		System.out.println("Customer has purchased the vehicle:" + vehicle + "for the price" + vehicle.getPrice());
	}
}
