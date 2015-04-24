package ex04;

public class Ex12 {

	public static void main(String[] args) {
		Ex12 e = new Ex12();
		e = null;
		System.gc();
	}

	@Override
	public void finalize() {
		System.out.println("finalizing");
	}

}
