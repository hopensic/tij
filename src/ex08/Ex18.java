package ex08;

class E {
	private String str;

	E(String s) {
		str = s;
	}
}

class F {
	E getE(String str) {
		return new E(str) {
		};
	}
}

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
