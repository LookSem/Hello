package �б�;

public class Child extends Father{
	Child(String name){
		super(name);
		System.out.println("�ڽ� Child ������");
	}
	void gotoSchool() {
		System.out.println(name + " �б����ϴ�.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child me = new Child("ȫ�浿");
		me.setAge(10);
		
		System.out.println(me.name + me.getAge() + "��");
		me.gotoSchool();
	}
	

}
