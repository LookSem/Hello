package �б�;

public class ShoppingMall {

	String code;
	static int total = 0 ;
	
	ShoppingMall(){};
	ShoppingMall(String code){
		this.code = code;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	void addTotal(int count) {
		total = total + count;
		System.out.println(code + "�� ���� ���� ������ "+total+ "�� �Դϴ�.");
	}
	void subTotal(int count) {
		total = total - count;
		System.out.println(code + "�� ���� ���� ������ "+total+ "�� �Դϴ�.");
	}
}
