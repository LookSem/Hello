package �б�;

//������ �����ε�
//����ƽ ����, �޼ҵ�
//�޼ҵ� �����ε�
public class Cat {
	// ������
	Cat() {
		count++;
		System.out.println("test");
	}

	Cat(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	
	}

	// �������
	String name;
	int age;
	static int count; // ����� ��

	// �޼ҵ�
	void print() {
		System.out.println(name + ":" + age + "��");
	}
	void print(String newname) {
		this.name = newname;
		print();
	}

	static void printCount() {
		System.out.println("���� �� ���� �� : " + count);
	}
}
