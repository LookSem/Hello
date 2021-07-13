package 切背;

public class Day08_CatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat();
		cat1.name = "国";
		cat1.age = 2;
		
		//国狼 沥焊 免仿
		cat1.print();
		cat1.printCount();
		
		Cat cat2 = new Cat("国货",3);
		cat2.print();
		cat2.printCount();
		
		cat2.print("富国");
	}

}
