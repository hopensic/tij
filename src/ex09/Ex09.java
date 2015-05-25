package ex09;

class ResumerException extends Exception {
}

class Resumer {
	static int count = 3;

	void f() throws ResumerException {
		if (--count > 0)
			throw new ResumerException();
	}
}

public class Ex09 {

	public static void main(String[] args) {
		Resumer r = new Resumer();
		while (true) {
			try {
				r.f();
			} catch (ResumerException e) {
				System.err.println("Caught " + e);
//				continue;
			}
			System.out.println("Got through...");
			break;
		}
		System.out.println("Successful execution");
	}

}
