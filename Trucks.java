package com.bridgelabz;

class Truck extends Car{

	int weight;
	double getSalePrice() {
		if (this.weight > 2000) {
			this.regularPrice = regularPrice*0.10;
		}
		else {
			this.regularPrice = regularPrice*0.20;
		}
		return this.regularPrice;
	}
	
	public Truck(String color, int speed, double regularprice, int weight) {
		super(color, speed, regularprice);
		this.weight = weight;
	}

}
