package 학교;

public class student {
	static final String school = "로봇고";
	student(){
		count++;
		printcount();
	}
	
	student( String name, int age){
		this();
		this.name = name;
		this.age = age;
	}
	String name;
	int age;
	private String phone;
	static int count = 0;
	void print() {
		System.out.println(school + name + " : " + age);
		this.printcount();
	}
	
	void print(int age) {
		System.out.println("나이 : "+ age);
	}
	
	void print(String name) {
		System.out.println("이름 " + name);
	}
	void printcount() {
		System.out.println("현재 등록된 학생은 " + count + "명 입니다.");
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
	String getphone() {
		return this.phone;
	}
	int getAge(){
		return this.age;
	}
}
