package 학교;

public class Car {
	String color;
	String name;
	int velocity;
	Car(){}
	Car(String color, String name, int veloicty){
		this.color = color;
		this.name = name;
		this.velocity = veloicty;
	}
	void speedUp() {
		System.out.println(name + "속도 올리기");
	}
	void speedDown() {
		System.out.println(name + "속도 내리기");
	}
	void print() {
		System.out.println("[CAR]");
	}
	
}
