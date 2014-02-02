package ex04;

class A4 {
	A4() {
		this(33);
	}

	A4(int a) {
		System.out.println("init: " + a);
	}

}

public class Ex10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A4 a = new A4();

	}

}
