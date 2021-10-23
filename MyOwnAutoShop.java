package com.bridgelabz;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		System.out.println("Welcome to My Auto Shop");
		
		//creating Sedan instance
		Sedan sedan = new Sedan( "Black", 180, 6000.00, 25);
		
		//creating two ford instances
		Ford ford1 = new Ford( "Grey", 250, 6500.00, 2020, 10);
		Ford ford2 = new Ford( "Red", 240, 6900.00, 2021, 20);
		
		//Creating car object
		Car car = new Car( "Orange", 150, 7000.00);
		
		//printing the sales value of different cars
		System.out.println("Saden sales price is : " + sedan.getSalePrice() + "\n");
		System.out.println("Ford car (1st) sales price is : " + ford1.getSalePrice() + "\n");
		System.out.println("Ford car (2nd) sales price is : " + ford2.getSalePrice() + "\n");
		System.out.println("Car sales price is :  " + car.getSalePrice() + "\n");
	}
}


