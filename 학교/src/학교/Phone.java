package �б�;

public class Phone {
	Phone(){
		total++;
	}
	
	static int total;
	void printTotal() {
		System.out.println("���� �� " + total + "�� �������.");
	}
	
	String toPrint(String model,int price,String company) {
		return company + " " + model + " " + price + "����"; 
	}
	String toPrint(String model,int price) {
		return price + "����¥��" + model + "����Ʈ��" ; 
	}
}
