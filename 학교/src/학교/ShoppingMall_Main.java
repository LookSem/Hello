package 학교;

public class ShoppingMall_Main extends ShoppingMall{

	ShoppingMall_Main(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ShoppingMall tv = new ShoppingMall("AABB123");
		 tv.addTotal(10);
		 
		 ShoppingMall camera = new ShoppingMall("CCTV");
		 camera.addTotal(20);
		 camera.subTotal(5);
		 
		 HomeShopping CookSomeChicken = new HomeShopping("Hot Sauce Chicken");
		 CookSomeChicken.setTime("12 : 30 PM");
		 CookSomeChicken.addTotal(50);
		 System.out.println(CookSomeChicken.code + " 방송시간은" + CookSomeChicken.getTime() + " 입니다.");
	}

}
