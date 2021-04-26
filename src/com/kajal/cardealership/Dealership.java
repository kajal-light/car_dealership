package com.kajal.cardealership;

public class Dealership {

	/*
	 * A program to stimulate a car dealer ship sale process.
	 * we will have employees working to sell vehicle to customers from the dealership
	 * The amount of money customer has, will be checked and accordingly,
	 * we can know that if customer can buy vehicle on loan/on cash or cant buy i
	 */
	public static void main(String[] args) {
		Customer a = new Customer();
		a.setName("kajal");
		a.setAddress("123 quter");
		a.setCashOnHand(22000);

		Vehicle vehicle = new Vehicle();
		vehicle.setMake("honda");
		vehicle.setModel("Accord");
		vehicle.setPrice(15000);
		
		Emplyoee emp = new Emplyoee();

		a.purchase(vehicle, emp, false);

		// handleCustomer(Customer cust,boolean finance,Vehicle vehicle)
		// if(finance==true)
		// runCreditHistory(Customer cust,double doubleAmount)
		// elseif(vehicle.getPrise()<=cust.getCashonhand());
		// processTransancation(Customer cust,Vehicle vehicle)
		// else
		// tell customer to bring money

	}
}
