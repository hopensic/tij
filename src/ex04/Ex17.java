package ex04;

public class Ex17 {
	private static String s1 = "sss";
	private static String s2;

	static {
		System.out.println("Init static block");
		s2 = "aaa";
		System.out.println("Init static block completed");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(s1);
		System.out.println(s2);
	}

}
