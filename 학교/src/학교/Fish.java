package �б�;

public class Fish extends Animal{
	public static void main(String[] args) {
		Fish gold = new Fish();
		gold.name = "�ݺؾ�";
		gold.toPrint();
		
		Animal ani = gold;
		ani.toPrint();
		
		Fish silver = (Fish) ani;
		silver.toPrint();
	}
}
