package ch10;

import tools.P;

class A01 {
	static {
		P.lnrint("in A01");
	}
}

public class ClassTest {

	public static void main(String[] args) {
		P.lnrint(A01.class);
		try {
			Class.forName("ch10.A01");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
