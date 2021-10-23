package com.bridgelabz;

public class Car {

	int speed;
	double regularPrice;
	String color;
	double getSalePrice() {
		return regularPrice;
	}
	
	Car(String color, int speed, double regularPrice){
		this.color = color;
		this.speed = speed;
		this.regularPrice = regularPrice;
	}
}
