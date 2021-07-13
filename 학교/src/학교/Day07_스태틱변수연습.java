package 학교;

public class Day07_스태틱변수연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student a = new student();
		a.name = "홍길동";
		a.age = 10;
		a.print();
		
		student b = new student();
		b.name = "노지후";
		b.age = 12;
		b.print();
		
		student c = new student("신경화",13);
		c.print();
		//a.school = "서울고";
		a.print();
		b.print();
		b.print(10);
		b.print("박찬호");
		c.setPhone("010-9999-9999");
		System.out.println();
		
		System.out.println(a.getAge());
		System.out.println(b.getAge());
		System.out.println(c.getAge());
	}

}
