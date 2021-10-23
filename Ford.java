package com.bridgelabz;

public class Ford extends Car {

	int year;
	int manufacturerDiscount;
	double getSalePrice() {
		this.regularPrice -= manufacturerDiscount;
		return this.regularPrice;
	}
	
	public Ford(String color, int speed, double regularPrice, int year, int manufacturerDiscount) {
		super(color, speed, regularPrice);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
}
