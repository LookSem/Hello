package 학교;

public class Student1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student1 st1 = new Student1();
			st1.setName("이성계");
			st1.setHakbun(20521);
			st1.setAge(19);
			
			Student1 st2 = new Student1("이순신",20623,18);
			Student1 st3 = new Student1("정약용",20423,19);
			
			st1.toPrint();
			st2.toPrint();
			st3.toPrint();
			
			
	}

}
