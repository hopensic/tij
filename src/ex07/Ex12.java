package ex07;

import tools.P;

abstract class Base1 {
	public Base1() {
		print();
	}

	abstract void print();

	public void a() {
		P.lnrint("a method");
		b();
	}

	public void b() {
		P.lnrint("b method");
	}
}

class Export1 extends Base1 {
	private int a = 3;

	public void b() {
		P.lnrint("Export b method");
	}

	public void print() {
		P.lnrint(a);
	}
}

public class Ex12 {

	public static void main(String[] args) {
		new Export1().print();
	}

}
