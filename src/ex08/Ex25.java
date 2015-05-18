package ex08;

import tools.P;

class C25 {
	class C25_1 {
		C25_1(int a) {
			P.lnrint(a);
		}
	}
}

class C25_other {
	class C25_other_1 extends C25.C25_1 {
		C25_other_1(int a, C25 c25) {
			c25.super(a);
		}
	}
}

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
