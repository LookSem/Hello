package �б�;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone1 = new Phone();
		System.out.println(phone1.toPrint("S21", 200));
		
		Phone phone2 = new Phone();
		System.out.println(phone2.toPrint("V50", 85));
		phone2.printTotal();
		
		Phone phone3 = new Phone();
		System.out.println(phone3.toPrint("������", 100,"����"));
	}

}
