package �б�;

public class student {
	static final String school = "�κ���";
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
		System.out.println("���� : "+ age);
	}
	
	void print(String name) {
		System.out.println("�̸� " + name);
	}
	void printcount() {
		System.out.println("���� ��ϵ� �л��� " + count + "�� �Դϴ�.");
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
