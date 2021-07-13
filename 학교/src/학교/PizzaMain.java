package 학교;

public class PizzaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza piz1 = new Pizza();
		piz1.setType("슈퍼슈프림");
		piz1.setSize(12);
		
		Pizza piz2 = new Pizza("포테이토");
		piz2.setSize(24);
		
		Pizza piz3 = new Pizza("불고기",12);
		
		piz1.toPrint();
		piz2.toPrint();
		piz3.toPrint();
	}

}
