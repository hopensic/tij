package ex09;

class VeryImportantException extends Exception {
	public String toString() {
		return "A very important exception!";
	}
}

class HoHumException extends Exception {
	public String toString() {
		return "A trivial exception";
	}
}

class YetAnotherException extends Exception {
	public String toString() {
		return "Yet another exception";
	}
}

class LostMessage {
	void f() throws VeryImportantException {
		throw new VeryImportantException();

	}

	void dispose() throws HoHumException {
		throw new HoHumException();
	}

	void cleanup() throws YetAnotherException {
		throw new YetAnotherException();
	}
}

public class Ex18 {
	public static void main(String[] args) throws Exception {
		LostMessage lm = new LostMessage();
		try {
			try {
				try {
					lm.f();
				} finally {
					lm.dispose();
				}
			} finally {
				lm.cleanup();
			}
		} catch (YetAnotherException e) {
			System.err.println("Caught " + e);
		}
	}
} // /:~
