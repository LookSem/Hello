package �б�;

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
		System.out.println(name + "�ӵ� �ø���");
	}
	void speedDown() {
		System.out.println(name + "�ӵ� ������");
	}
	void print() {
		System.out.println("[CAR]");
	}
	
}
