package 학교;

public class Pizza {
	private int size;
	private String type;
	Pizza(){
		
	}
	Pizza(String type){
		this.type = type;
	}
	Pizza(String type, int size){
		this(type);
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	void toPrint() {
		System.out.println("종류 : " + type + " 크기 : " + size);
	}
}
