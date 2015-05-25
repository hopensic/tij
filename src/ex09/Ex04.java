package ex09;

public class Ex04 {

	public static void main(String[] args) {
		String s = null;
		try {
			s.toString();
		} catch (Exception e) {
			System.err.println("Caught exception " + e);
		}
	}

}
