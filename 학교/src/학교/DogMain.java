package 학교;

public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog a = new Dog("푸들", 3, "초코색");
		Dog b = new Dog("불독", 5, "검정색");
		
		a.barking();
		a.hungry();
		b.sleeping();
		b.hungry();
		
		String str = b.toPrint();
		System.out.println(str);
		System.out.println(a.toPrint());
	}

}
