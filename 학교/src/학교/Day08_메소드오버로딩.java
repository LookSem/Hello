package 학교;

public class Day08_메소드오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add obj = new Add();
		System.out.println(obj.sum(5, 8));
		System.out.println(obj.sum("서울", "로봇고"));
	
	}

}
class Add {
	int sum(int a, int b) {
		return a + b;
	}
	String sum(String a, String b) {
		return a + b;
	}
	
}
