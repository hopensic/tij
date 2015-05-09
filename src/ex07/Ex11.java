package ex07;

import tools.P;

class Base {
	public void a() {
		P.lnrint("a method");
		b();
	}

	public void b() {
		P.lnrint("b method");
	}
}

class Export extends Base {
	public void b() {
		P.lnrint("Export b method");
	}
}

public class Ex11 {

	public Ex11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		((Base) new Export()).a();

	}

}
