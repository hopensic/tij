package ex09;

class A1 {
	void f() {
		try {
			g();
		} catch (MyE e) {
			throw new RuntimeException(e);
		}
	}

	void g() throws MyE {
		throw new MyE("in g()");
	}
}

public class Ex06 {

	public static void main(String[] args) {
		A1 a = new A1();
		a.f();
	}

}
