package 학교;

public class Child extends Father{
	Child(String name){
		super(name);
		System.out.println("자식 Child 생성자");
	}
	void gotoSchool() {
		System.out.println(name + " 학교갑니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child me = new Child("홍길동");
		me.setAge(10);
		
		System.out.println(me.name + me.getAge() + "세");
		me.gotoSchool();
	}
	

}
