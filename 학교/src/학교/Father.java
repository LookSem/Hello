package 학교;

public class Father {
	String name;
	private int age;
	Father(String name){
		this.name = name;
		System.out.println("부모 Father 생성자");
	}
	void setAge(int age) {
		this.age = age;
	}
	int getAge() {
		return this.age; 
	}
}
