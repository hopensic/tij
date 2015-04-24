package ex04;

class Tank {
	private boolean isEmpty;

	Tank(boolean a_isEmpty) {
		isEmpty = a_isEmpty;
	}

	@Override
	public void finalize() {
		if (isEmpty)
			System.out.println("Doing finalizing");
		else
			System.out.println("Object is not empty");
	}

}

public class Ex13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tank t = new Tank(true);
		t = null;
		Tank b = new Tank(false);
		b = null;
		System.gc();
	}

}
