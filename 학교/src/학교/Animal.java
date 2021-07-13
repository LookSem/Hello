package 학교;

public class Animal {
	String species;
	String name;
	int age;
	Animal(){
		System.out.println("Animal 기본생성자");
	}
	Animal(String name, int age){
		System.out.println("Animal 기본생성자");
	}
	
	void toPrint() {
		System.out.println("이 동물은 " + name);
	}
	public static void main(String[] args) {
		
	}
}
