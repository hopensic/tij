package ex08;

import tools.P;

interface I1 {
	void m1();

	void m2();
}

interface I2 {
	void m3();

	void m4();
}

interface I3 {
	void m5();

	void m6();
}

interface I4 extends I1, I2, I3 {
	void m7();
}

class T1 {
	public T1(String str) {
		P.lnrint(str);
	}
}

class Newclass extends T1 implements I4 {
	public Newclass() {
		super("All");
		P.lnrint("Newclass init");
	}

	public void m1() {
		P.lnrint("m1");
	}

	public void m2() {
		P.lnrint("m2");
	}

	public void m3() {
		P.lnrint("m3");
	}

	public void m4() {
		P.lnrint("m4");
	}

	public void m5() {
		P.lnrint("m5");
	}

	public void m6() {
		P.lnrint("m6");
	}

	public void m7() {
		P.lnrint("m7");
	}
}

public class Ex05 {
	public void takes1(I1 i1) {
		i1.m1();
		i1.m2();
	}

	public void takes2(I2 i2) {
		i2.m3();
		i2.m4();
	}

	public void takes3(I3 i3) {
		i3.m5();
		i3.m6();
	}

	public void takes4(I4 i4) {
		i4.m1();
		i4.m2();
		i4.m3();
		i4.m4();
		i4.m5();
		i4.m6();
		i4.m7();
	}

	public static void main(String[] args) {
		Ex05 e = new Ex05();
		Newclass n = new Newclass();
		e.takes1(n);
		e.takes2(n);
		e.takes3(n);
		e.takes4(n);

	}

}
