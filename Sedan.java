package com.bridgelabz;

public class Sedan extends Car {

	int length;
	
	//return sale price
	public double getSalePrice() {
		//calculating discount
		double discount;
		if(length > 20) {
			discount = 0.05;
		}
		else {
			discount = 0.10;
		}
		this.regularPrice = regularPrice*discount;
		return this.regularPrice;
	}
	
	//Constructor
	public Sedan(String color, int speed, double regularprice, int length) {
		super(color, speed, regularprice);
		this.length = length;
	}
}
