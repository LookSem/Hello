package 학교;

public class Phone {
	Phone(){
		total++;
	}
	
	static int total;
	void printTotal() {
		System.out.println("현재 총 " + total + "개 재고있음.");
	}
	
	String toPrint(String model,int price,String company) {
		return company + " " + model + " " + price + "만원"; 
	}
	String toPrint(String model,int price) {
		return price + "만원짜리" + model + "스마트폰" ; 
	}
}
