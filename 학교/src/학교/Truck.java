package ÇÐ±³;

public class Truck extends Car {
	int ton;
	public Truck(String color, String name, int velocity) {
		// TODO Auto-generated constructor stub
		super(color, name, velocity);
		ton = 5;
	}
	void print() {
		System.out.println("[Truck]" + name + ton);
	}
}
