package �б�;

public class PizzaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza piz1 = new Pizza();
		piz1.setType("���۽�����");
		piz1.setSize(12);
		
		Pizza piz2 = new Pizza("��������");
		piz2.setSize(24);
		
		Pizza piz3 = new Pizza("�Ұ��",12);
		
		piz1.toPrint();
		piz2.toPrint();
		piz3.toPrint();
	}

}
