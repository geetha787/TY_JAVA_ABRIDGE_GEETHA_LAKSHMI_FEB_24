package com.capgemini.assignments.day3;

public class Car {
String brand;
String color;
int cost;

	
public Car(String brand, String color, int cost) {
	super();
	this.brand = brand;
	this.color = color;
	this.cost = cost;
}



	public static void main(String[] args) {
		Car[] car=new Car[3];
		Car c1=new Car("audi","white",900000);
		Car c2=new Car("BMW","black",1100000);
		Car c3=new Car("toyota","blue",700000);

		car[0]=c1;
		car[1]=c2;
		car[2]=c3;
		printCarDetails(car);
		Car[] car1=getCar();
		printCarDetails(car);

	}
	static void printCarDetails(Car[]car) {
		for(int i=0;i<car.length;i++) {
			System.out.println("brand-"+car[i].brand);
			System.out.println("color-"+car[i].color);
			System.out.println("cost-"+car[i].cost);
		}
	}
	static Car[] getCar() {
		Car[] car=new Car[3];
		return car;
		}
	}


