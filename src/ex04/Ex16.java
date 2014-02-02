package ex04;

public class Ex16 {
	private String s1 = "aaa";
	private String s2;

	Ex16() {

	}

	Ex16(String s) {
		s2 = s;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex16 a = new Ex16("sss");
		System.out.println(a.s1);
		System.out.println(a.s2);
	}

}
