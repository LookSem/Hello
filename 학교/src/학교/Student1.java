package 학교;

public class Student1 {
	private String name;
	private int hakbun, age; 
	Student1(){}
	Student1(String name, int hakbun, int age){
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
	}
	void toPrint() {
		System.out.println("이름 : " + name + " 학번 : " + hakbun + " 나이 : " + age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
