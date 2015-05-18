package ex08;

import tools.P;

interface U {
	void m1();

	void m2();

	void m3();
}

class A1 {
	U a1() {
		return new U() {
			public void m1() {
				P.lnrint("m1");
			}

			public void m2() {
				P.lnrint("m2");
			}

			public void m3() {
				P.lnrint("m3");
			}
		};
	}
}

class B1 {
	B1(int sum) {
		count = sum;
		array = new U[sum];
	}

	private int count;
	private int cur = 0;
	private U array[];

	void v1(U u) {
		array[cur++] = u;
	}

	void v3() {
		for (U u : array) {
			u.m1();
			u.m2();
			u.m3();
		}
	}
}

public class Ex28 {

	public static void main(String[] args) {
		A1 a1 = new A1();
		A1 a2 = new A1();
		B1 b = new B1(5);
		b.v1(a1.a1());
		b.v1(a2.a1());
		
		

	}

}
