package ex04;

class A {
	private String s;

	A() {
		System.out.println("Initiating A");
	}

	A(String s) {
		this.s = s;
		System.out.println("Initiating String:" + s);
	}

	String getS() {
		return this.s;
	}

}

public class Ex01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A[] arr = new A[3];
		for (int i = 0; i < 3; i++)
			arr[i] = new A("aaa");
		for (A a : arr)
			System.out.println(a.getS());

	}
}
