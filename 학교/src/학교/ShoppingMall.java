package 학교;

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
		System.out.println(code + "의 현재 남은 개수는 "+total+ "개 입니다.");
	}
	void subTotal(int count) {
		total = total - count;
		System.out.println(code + "의 현재 남은 개수는 "+total+ "개 입니다.");
	}
}
